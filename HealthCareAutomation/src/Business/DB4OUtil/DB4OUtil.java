package Business.DB4OUtil;

import Business.SystemConfiguration;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Networks.Networks;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author rrheg
 * @author Lingfeng
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
            System.out.println("Hello createConnection");
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
             ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

           
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem ecosystem) {
        ObjectContainer conn = createConnection();
        
                            System.out.println("e="+ecosystem.getOrgID());
            System.out.println("Networtks="+ecosystem.getNetworks());
            for(Networks n : ecosystem.getNetworks()) {
                System.out.println("Network name="+n.getNetwrkName());
                System.out.println("xyz="+n.getEntDir().getEntList());
                for(Enterprise en : n.getEntDir().getEntList()) {
                    System.out.println("Name="+en.getName());
                }
            }
            
        conn.store(ecosystem);
        conn.commit();
        System.out.println("EcoSystem="+conn.query(EcoSystem.class));
        

        conn.close();
        
    }
    
    public EcoSystem retrieveSystem(){
        System.out.println("Hello retrieveSystem");
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> ecosystems = conn.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem ecosystem;
        System.out.println("Ecosystem retrieve="+conn.query(EcoSystem.class));
        for(EcoSystem e: ecosystems) {
            System.out.println("e="+e.getOrgID());
            System.out.println("Networtks="+e.getNetworks());
            for(Networks n : e.getNetworks()) {
                System.out.println("Network name="+n.getNetwrkName());
                System.out.println("xyz="+n.getEntDir().getEntList());
                for(Enterprise en : n.getEntDir().getEntList()) {
                    System.out.println("Name="+en.getName());
                }
            }
        }
        if (ecosystems.isEmpty()){
            ecosystem = SystemConfiguration.configure();  // If there's no System in the record, create a new one
        }
        else{
            ecosystem = ecosystems.get(ecosystems.size() - 1);
        }
        conn.close();
        return ecosystem;
    }
}
