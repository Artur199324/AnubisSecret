package com.ak.ta.dainikbhaskar.activit.frg;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Prog {

    ImageView images1;
    ImageView images2;
    ImageView images3;
    ImageView images4;
    int ccc = 0;

    public Prog(ImageView images1, ImageView images2, ImageView images3, ImageView images4) {
        this.images1 = images1;
        this.images2 = images2;
        this.images3 = images3;
        this.images4 = images4;
    }

    public void idj(){
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
               ccc++;
               switch (ccc){
                   case 1:
                       images2.setVisibility(View.VISIBLE);
                       break;
                   case 2:
                       images3.setVisibility(View.VISIBLE);
                       break;
                   case 3:
                       images4.setVisibility(View.VISIBLE);
                       break;
                   case 4:
                       images2.setVisibility(View.INVISIBLE);
                       images3.setVisibility(View.INVISIBLE);
                       images4.setVisibility(View.INVISIBLE);
                       ccc = 0;
                       break;

               }

                handler.postDelayed(this::run,1000);
            }
        });
    }
}
