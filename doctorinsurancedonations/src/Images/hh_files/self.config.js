window.SparrowConfigV2={"capturedCookies":[{"cookie_key":"amg_user_partner","sparrow_key":"cnid"},{"cookie_key":"aam_uuid","sparrow_key":"aam_uuid"},{"cookie_key":"ba_opt_out","sparrow_key":"_anonymize"}],"capturedQueryParams":["mbid","CNDID","intcid"],"capturedHashParams":["intcid"],"preinit":["user-context"],"meta":{"cPd":"function b() { if (window._4d && window._4d.context && window._4d.context.pubdate) { return window._4d.context.pubdate; } else { return undefined; }}","cKh":"function a(o){var n=\"\";if(window._4d&&window._4d.context&&window._4d.context.keywords&&window._4d.context.keywords.list){var t=window._4d.context.keywords.list.filter(function(o){return o.score>.6});n=(t=t.map(function(o){return o.keyword.toLowerCase()})).join(\",\")}return n}"},"events":[{"parent":"body","type":["pageview"],"selector":"window","meta":{"dim1":"function d(){return window._4d&&window._4d.user&&window._4d.user.sg&&window._4d.user.sg.join(\",\")||undefined}","dim6":"function e(){return window && window.dataLayer && window.dataLayer[0] && JSON.stringify(window.dataLayer[0].experiments) || undefined; }"}},{"parent":"body","type":["timespent"],"selector":"window"},{"parent":"body","selector":".recirc-list__items","type":["inViewExists"],"customMapper":{"_c":"variations_recommendations","dim6":"end_of_content"}},{"parent":"body","selector":".recirc-list__items","type":["click"],"customMapper":{"_c":"variations_recommendations","dim6":"end_of_content"}},{"parent":"body","selector":".summary-item-tracking__image-link[data-recirc-id]","type":["inViewExists"],"dataAttrMapper":{"dim1":"href","dim5":"data-recirc-id","dim6":"data-recirc-pattern"},"customMapper":{"_c":"variations_recommendations","_t":"linksIn-view"},"meta":{"dim2":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;return r.indexOf(\"#\")>0?n(r.substring(0,r.indexOf(\"#\"))):n(r)}})}","dim3":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;var q=r.substring(r.indexOf(\"intcid=\")); if(q.indexOf(\"?\")>-1) {q=q.substring(0,q.lastIndexOf(\"?\"))}; if (q.indexOf(\"&\")>-1) {q=q.substring(0,q.lastIndexOf(\"&\"))}; q=q.split(\"_\"); return (r.indexOf(\"#\")>0 && q.length > 3)?n(q[3]):n(\"\")}return n(\"\")})}","dim4":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;var q=r.substring(r.indexOf(\"intcid=\")); if(q.indexOf(\"?\")>-1) {q=q.substring(0,q.lastIndexOf(\"?\"))}; if (q.indexOf(\"&\")>-1) {q=q.substring(0,q.lastIndexOf(\"&\"))}; q=q.split(\"_\"); return (r.indexOf(\"#\")>0 && q.length > 4)?n(q[4]):n(\"\")}return n(\"\")})}"}},{"parent":"body","selector":".summary-item-tracking__image-link[data-recirc-id]","type":["click"],"dataAttrMapper":{"dim1":"href","dim5":"data-recirc-id","dim6":"data-recirc-pattern"},"customMapper":{"_c":"variations_recommendations","_t":"linkClick"},"meta":{"dim2":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;return r.indexOf(\"#\")>0?n(r.substring(0,r.indexOf(\"#\"))):n(r)}})}","dim3":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;var q=r.substring(r.indexOf(\"intcid=\")); if(q.indexOf(\"?\")>-1) {q=q.substring(0,q.lastIndexOf(\"?\"))}; if (q.indexOf(\"&\")>-1) {q=q.substring(0,q.lastIndexOf(\"&\"))}; q=q.split(\"_\"); return (r.indexOf(\"#\")>0 && q.length > 3)?n(q[3]):n(\"\")}return n(\"\")})}","dim4":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;var q=r.substring(r.indexOf(\"intcid=\")); if(q.indexOf(\"?\")>-1) {q=q.substring(0,q.lastIndexOf(\"?\"))}; if (q.indexOf(\"&\")>-1) {q=q.substring(0,q.lastIndexOf(\"&\"))}; q=q.split(\"_\"); return (r.indexOf(\"#\")>0 && q.length > 4)?n(q[4]):n(\"\")}return n(\"\")})}"}},{"parent":"body","selector":".summary-item-tracking__hed-link[data-recirc-id]","type":["inViewExists"],"dataAttrMapper":{"dim1":"href","dim5":"data-recirc-id","dim6":"data-recirc-pattern"},"customMapper":{"_c":"variations_recommendations","_t":"linksIn-view"},"meta":{"dim2":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;return r.indexOf(\"#\")>0?n(r.substring(0,r.indexOf(\"#\"))):n(r)}})}","dim3":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;var q=r.substring(r.indexOf(\"intcid=\")); if(q.indexOf(\"?\")>-1) {q=q.substring(0,q.lastIndexOf(\"?\"))}; if (q.indexOf(\"&\")>-1) {q=q.substring(0,q.lastIndexOf(\"&\"))}; q=q.split(\"_\"); return (r.indexOf(\"#\")>0 && q.length > 3)?n(q[3]):n(\"\")}return n(\"\")})}","dim4":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;var q=r.substring(r.indexOf(\"intcid=\")); if(q.indexOf(\"?\")>-1) {q=q.substring(0,q.lastIndexOf(\"?\"))}; if (q.indexOf(\"&\")>-1) {q=q.substring(0,q.lastIndexOf(\"&\"))}; q=q.split(\"_\"); return (r.indexOf(\"#\")>0 && q.length > 4)?n(q[4]):n(\"\")}return n(\"\")})}"}},{"parent":"body","selector":".summary-item-tracking__hed-link[data-recirc-id]","type":["click"],"dataAttrMapper":{"dim1":"href","dim5":"data-recirc-id","dim6":"data-recirc-pattern"},"customMapper":{"_c":"variations_recommendations","_t":"linkClick"},"meta":{"dim2":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;return r.indexOf(\"#\")>0?n(r.substring(0,r.indexOf(\"#\"))):n(r)}})}","dim3":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;var q=r.substring(r.indexOf(\"intcid=\")); if(q.indexOf(\"?\")>-1) {q=q.substring(0,q.lastIndexOf(\"?\"))}; if (q.indexOf(\"&\")>-1) {q=q.substring(0,q.lastIndexOf(\"&\"))}; q=q.split(\"_\"); return (r.indexOf(\"#\")>0 && q.length > 3)?n(q[3]):n(\"\")}return n(\"\")})}","dim4":"function cutLink(n,i){return new Promise(function(n){if(i&&i.dim1){var r=i.dim1;var q=r.substring(r.indexOf(\"intcid=\")); if(q.indexOf(\"?\")>-1) {q=q.substring(0,q.lastIndexOf(\"?\"))}; if (q.indexOf(\"&\")>-1) {q=q.substring(0,q.lastIndexOf(\"&\"))}; q=q.split(\"_\"); return (r.indexOf(\"#\")>0 && q.length > 4)?n(q[4]):n(\"\")}return n(\"\")})}"}},{"parent":"body","selector":".inline-recirc-sparrow-tracking","type":["inViewExists"],"dataAttrMapper":{"dim2":"data-recirc-header","dim5":"data-recirc-id"},"customMapper":{"_c":"variations_recommendations","dim6":"mobile-recirc-unit"}},{"parent":"body","selector":".inline-recirc-sparrow-tracking","type":["click"],"dataAttrMapper":{"dim2":"data-recirc-header","dim5":"data-recirc-id"},"customMapper":{"_c":"variations_recommendations","dim6":"mobile-recirc-unit"}},{"parent":"body","selector":".recirc-riser__items","type":["inViewExists"],"customMapper":{"_c":"variations_recommendations","dim6":"riser"}},{"parent":"body","selector":".recirc-riser__items","type":["click"],"customMapper":{"_c":"variations_recommendations","dim6":"riser"}},{"parent":"body","selector":".recirc-most-popular__items","type":["inViewExists"],"customMapper":{"_c":"variations_recommendations","dim6":"right_rail"}},{"parent":"body","selector":".recirc-most-popular__items","type":["click"],"customMapper":{"_c":"variations_recommendations","dim6":"right_rail"}},{"parent":"body","selector":".recirc-most-popular-sparrow-tracking","type":["inViewExists"],"customMapper":{"_t":"in-view"},"dataAttrMapper":{"dim5":"data-most-popular-id"}},{"parent":"body","selector":".recirc-most-popular-sparrow-tracking","type":["click"],"customMapper":{"_t":"click"},"dataAttrMapper":{"dim5":"data-most-popular-id"}},{"parent":"body","selector":".summary-item-tracking__hed-link, .feed-item__link","type":["inViewExists"],"dataAttrMapper":{"dim1":"href","dim3":"data-component-type","dim4":"data-recirc-id","dim5":"data-recirc-pattern","dim6":"data-content-exp"},"customMapper":{"_c":"content","_t":"in-view"},"meta":{"dim2":"function cutLink(n,i){var r,j;if(i&&i.dim1){r=i.dim1;j=r.indexOf(\"?\");if(j>0){r=r.substring(0,j)}j=r.indexOf(\"#\");if(j>0){r=r.substring(0,j)}}return r}"}},{"parent":"body","selector":".summary-item-tracking__hed-link, .summary-item-tracking__image-link, .feed-item__link","type":["click"],"dataAttrMapper":{"dim1":"href","dim3":"data-component-type","dim4":"data-recirc-id","dim5":"data-recirc-pattern","dim6":"data-content-exp"},"customMapper":{"_c":"content","_t":"click"},"meta":{"dim2":"function cutLink(n,i){var r,j;if(i&&i.dim1){r=i.dim1;j=r.indexOf(\"?\");if(j>0){r=r.substring(0,j)}j=r.indexOf(\"#\");if(j>0){r=r.substring(0,j)}}return r}"}}],"origin":"self","title":"Self","environment":"prod","version":"1.0","org_id":"4gKgcF6nVvtKX5y2VznaJcDBuD47"}