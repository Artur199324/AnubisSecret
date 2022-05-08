package com.ak.ta.dainikbhaskar.activit.ac;


import static com.ak.ta.dainikbhaskar.activit.frg.WeAS.webViewFullAppAS;
import static com.ak.ta.dainikbhaskar.activit.modas.WebSetAS.nggaa;
import static com.ak.ta.dainikbhaskar.activit.modas.WebSetAS.mjgs;
import static com.ak.ta.dainikbhaskar.activit.modas.WebSetAS.nnhds;
import static com.ak.ta.dainikbhaskar.activit.modas.WebSetAS.dsadwq;
import static com.ak.ta.dainikbhaskar.activit.modas.WebSetAS.mjgds;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.modas.AppAs;
import com.ak.ta.dainikbhaskar.activit.modas.DeeppAS;
import com.ak.ta.dainikbhaskar.activit.modas.FireBAS;
import com.ak.ta.dainikbhaskar.activit.frg.StAs;
import com.ak.ta.dainikbhaskar.activit.modas.MgO;
import com.ak.ta.dainikbhaskar.activit.modas.MgT;
import com.ak.ta.dainikbhaskar.activit.modas.MgTt;
import com.ak.ta.dainikbhaskar.activit.vieas.VAS;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import org.apache.commons.codec.binary.Base32;

public class GmAS extends AppCompatActivity {

    public static VAS vas;
    public static NavController navControllerAS;
    public static int aa = 0;
    public static int bb = 0;
    public static int cc = 0;
    private String savUrlAS;
    public String oneSignalKeyAS = "810f5ad3-c1b5-44f0-b48e-35146c55123f";
    public String AIDAS;
    public String apps_idAS;
    boolean inOnAs;
    public static boolean ooo = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vas = new ViewModelProvider
                .AndroidViewModelFactory(getApplication())
                .create(VAS.class);
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(oneSignalKeyAS);
        StAs.gmAS = this;
        MgO.gmAS = this;
        MgT.gmAS = this;
        MgTt.gmAS = this;
        apps_idAS = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        inOnAs = vas.onLAS(this);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    AIDAS = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                    vas.pasInAS(GmAS.this, AIDAS, apps_idAS);
                } catch (Exception e) {

                }
            }
        }).start();
        vas.weinAS(this);
        aa = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("aa", 0);
        bb = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("bb", 0);
        cc = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("cc", 0);
         savUrlAS = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(decodeAS("ONQXMZI="), decodeAS("NZXG4==="));


        AppAs appAs = vas.appsAS(this);
        DeeppAS dippAS = vas.dippAS(this);

        navControllerAS = Navigation.findNavController(this, R.id.nav_host_fragmentas);

        vas.reAs(this);
        if (inOnAs) {

            if (savUrlAS.equals(decodeAS("NZXG4==="))){
                FireBAS fireBAS = vas.fff();
                vas.fireBAScon(GmAS.this);
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (!fireBAS.getStatusAs().equals(decodeAS("ONZXG==="))) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    vas.startAs(dippAS,appAs,fireBAS,GmAS.this);
                                }
                            });
                        } else {
                            handler.postDelayed(this::run, 10);
                        }

                    }
                });
            }else {
                Bundle bundle =  new Bundle();
                bundle.putString(decodeAS("NRXWCZA="),savUrlAS);
                navControllerAS.navigate(R.id.weAS,bundle);
                ooo = true;
            }

        } else {
            navControllerAS.navigate(R.id.reconeAD);
        }
    }

    @Override
    public void onBackPressed() {
        if (ooo){
            if (webViewFullAppAS.isFocused() && webViewFullAppAS.canGoBack()) {
                webViewFullAppAS.goBack();
            }
        }else {
            navControllerAS.navigate(R.id.stAs);
            StAs.dddd = false;
        }


    }

    @Override
    protected void onActivityResult(int adsr, int ngnte, @Nullable Intent bcxd) {
        if (adsr != mjgs || nggaa == null) {
            super.onActivityResult(adsr, ngnte, bcxd);
            return;
        }
        Uri[] bfdrs = null;
        if (ngnte == Activity.RESULT_OK) {
            if (bcxd == null) {
                if (mjgds != null) {
                    bfdrs = new Uri[]{Uri.parse(mjgds)};
                }
            } else {
                String hhg = bcxd.getDataString();
                if (hhg != null) {
                    bfdrs = new Uri[]{Uri.parse(hhg)};
                }
            }
        }
        nggaa.onReceiveValue(bfdrs);
        nggaa = null;
        if (dsadwq == null) {
            super.onActivityResult(adsr, ngnte, bcxd);
            return;
        }
        Uri bbfdds = null;
        try {
            if (ngnte != RESULT_OK) {
                bbfdds = null;
            } else {
                bbfdds = bcxd == null ? nnhds : bcxd.getData();
            }
        } catch (Exception e) {
        }
        dsadwq.onReceiveValue(bbfdds);
        dsadwq = null;
    }

    public static String decodeAS (String base32DataAS) {
        Base32 base32AS = new Base32();
        byte[] decodedBytesAS = base32AS.decode(base32DataAS);
        String decodedStringAS = new String(decodedBytesAS);
        return decodedStringAS;
    }
}