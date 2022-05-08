package com.ak.ta.dainikbhaskar.activit.modas;

import android.content.Context;
import android.net.ConnectivityManager;

import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

public class OnlAS {

    public boolean onAs(GmAS gmAS){
        String bfd = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager vdss = (ConnectivityManager) gmAS.getSystemService(bfd);
        if (vdss.getActiveNetworkInfo() == null) {
            return false;
        } else {
            return true;
        }
    }
}
