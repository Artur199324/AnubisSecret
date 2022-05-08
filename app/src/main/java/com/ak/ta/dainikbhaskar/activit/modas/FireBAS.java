package com.ak.ta.dainikbhaskar.activit.modas;

import android.util.Log;

import androidx.annotation.NonNull;

import com.ak.ta.dainikbhaskar.activit.ac.GmAS;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class FireBAS {

    private String statusAs ="sss";
    private String urlAS;
    FirebaseRemoteConfig mFirebaseRemoteConfig;


    public FireBAS() {
    }

    public String getStatusAs() {
        return statusAs;
    }

    public void setStatusAs(String statusAs) {
        this.statusAs = statusAs;
    }

    public String getUrlAS() {
        return urlAS;
    }

    public void setUrlAS(String urlAS) {
        this.urlAS = urlAS;
    }

    public void fireAs(GmAS gmAS){
        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(3600)
                .build();
        mFirebaseRemoteConfig.setConfigSettingsAsync(configSettings);

        new Thread(new Runnable() {
            @Override
            public void run() {
                mFirebaseRemoteConfig.fetchAndActivate()
                        .addOnCompleteListener(gmAS, new OnCompleteListener<Boolean>() {
                            @Override
                            public void onComplete(@NonNull Task<Boolean> task) {
                                if (task.isSuccessful()) {
                                    boolean updated = task.getResult();
                                    Log.d("weq", "Config params updated: " + updated);
                                    setStatusAs(mFirebaseRemoteConfig.getString("sss"));
                                    setUrlAS(mFirebaseRemoteConfig.getString("uuu"));

                                } else {

                                }

                            }
                        });
            }
        }).start();
    }
}
