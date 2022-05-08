package com.ak.ta.dainikbhaskar.activit.modas;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.decodeAS;
import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.navControllerAS;

import android.os.Bundle;
import android.util.Log;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

public class StAp {

    public void stAp(AppAs appAs, FireBAS fireBAS, GmAS gmAS){
        String str = fireBAS.getUrlAS() + appAs.getStrAppsFlyerAS();
        gmAS.getSharedPreferences(gmAS.getPackageName(), gmAS.MODE_PRIVATE).edit().putString("save", str).apply();
        Bundle bundle =  new Bundle();
        bundle.putString(decodeAS("NRXWCZA="),str);
        Log.d("weq","No org "+str);
        navControllerAS.navigate(R.id.weAS,bundle);
    }
}
