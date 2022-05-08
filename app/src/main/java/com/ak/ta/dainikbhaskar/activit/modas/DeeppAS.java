package com.ak.ta.dainikbhaskar.activit.modas;

import androidx.annotation.Nullable;

import com.ak.ta.dainikbhaskar.activit.ac.GmAS;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;

public class DeeppAS {

    String deepAS = null;
    String strDeppAS = "-";

    public String getDeepAS() {
        return deepAS;
    }

    public void setDeepAS(String deepAS) {
        this.deepAS = deepAS;
    }

    public String getStrDeppAS() {
        return strDeppAS;
    }

    public void setStrDeppAS(String strDeppAS) {
        this.strDeppAS = strDeppAS;
    }

    public void deepAS(GmAS gmAS,ParsAS parsAS){
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.fullyInitialize();
        AppEventsLogger.activateApp(gmAS.getApplication());
        AppLinkData.fetchDeferredAppLinkData(gmAS.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(gmAS);

                }
                if (appLinkData != null) {

                    String[] as = appLinkData.getTargetUri().toString().split("://");
                    deepAS = as[1];
                    strDeppAS = parsAS.ds(deepAS);

                } else {

                }
            }
        });
    }
}
