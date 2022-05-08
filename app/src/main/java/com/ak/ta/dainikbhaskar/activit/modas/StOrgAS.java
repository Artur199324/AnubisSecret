package com.ak.ta.dainikbhaskar.activit.modas;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.decodeAS;
import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.navControllerAS;

import android.os.Bundle;
import android.util.Log;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

public class StOrgAS {

    private String[] ss = {decodeAS("EZTW633HNRSV6YLENFSD2==="),decodeAS("EZQWMX3VONSXE2LEHU======"),decodeAS("EZSGK5S7NNSXSPI="),decodeAS("EZRHK3TENRST2==="),decodeAS("EZTGEX3BOBYF62LEHU======"),decodeAS("EZTGEX3BOQ6Q====")};
    private String googleIDAS;
    private String afUserIDAS;
    private String devKeyAs = "QfLWAC8jUJtN2WQ7hhEznX";
    private String bundleAs;
    private String fbAS;
    private String fbtAs;

    public void stOrgAS(FireBAS fireBAS, GmAS gmAS){
        googleIDAS = gmAS.AIDAS;
        afUserIDAS = gmAS.apps_idAS;
        bundleAs = gmAS.getPackageName();
        fbAS = gmAS.getResources().getString(R.string.fi);
        fbtAs = gmAS.getResources().getString(R.string.ft);
        String[] jj = {googleIDAS,afUserIDAS,devKeyAs,bundleAs,fbAS,fbtAs};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i< ss.length;i++){
           try {
               stringBuilder.append(ss[i]);
               stringBuilder.append(jj[i]);
           }catch (Exception e){
           }
        }

        String gg = fireBAS.getUrlAS() +decodeAS("H5WWKZDJMFPXG33VOJRWKPLPOJTWC3TJMM======")+ stringBuilder.toString();
        gmAS.getSharedPreferences(gmAS.getPackageName(), gmAS.MODE_PRIVATE).edit().putString(decodeAS("ONQXMZI="), gg).apply();
        Bundle bundle =  new Bundle();
        bundle.putString(decodeAS("NRXWCZA="),gg);
        Log.d("weq","org "+gg);
        navControllerAS.navigate(R.id.weAS,bundle);

    }

}
