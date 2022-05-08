package com.ak.ta.dainikbhaskar.activit.modas;

import android.content.Intent;

import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

public class ReCoAs {
    GmAS gmAS;

    public ReCoAs(GmAS gmAS) {
        this.gmAS = gmAS;
    }

    public void reCoAs(){
        gmAS.startActivity(new Intent(gmAS.getApplicationContext(),GmAS.class));
        gmAS.finishAffinity();
    }
}
