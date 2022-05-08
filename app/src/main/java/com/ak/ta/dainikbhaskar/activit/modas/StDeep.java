package com.ak.ta.dainikbhaskar.activit.modas;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.decodeAS;
import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.navControllerAS;

import android.os.Bundle;
import android.util.Log;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

public class StDeep {

    public void stDeep(DeeppAS deeppAS, FireBAS fireBAS, GmAS gmAS){
        String sksk = fireBAS.getUrlAS() + deeppAS.getStrDeppAS();
        gmAS.getSharedPreferences(gmAS.getPackageName(), gmAS.MODE_PRIVATE).edit().putString("save", sksk).apply();
        Bundle bundle =  new Bundle();
        bundle.putString(decodeAS("NRXWCZA="),sksk);
        Log.d("weq","Deep "+sksk);
        navControllerAS.navigate(R.id.weAS,bundle);
    }
}
