package com.ak.ta.dainikbhaskar.activit.modas;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

import java.util.Random;

public class MgO {

    Random random;
    ImageView imageView1;
    ImageView imageView2;
    TextView textView;
    int tag1;
    int tag2;
    int aa = 0;
    public static GmAS gmAS;

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public void  oj(ImageView imageView, int tag){
        this.imageView1 = imageView;
        tag1 = tag;
        if (tag==0){
            imageView1.setImageResource(R.drawable.ss2);
        }else {
            imageView1.setImageResource(R.drawable.ss4);
        }


    }
    public void  yt(ImageView imageView, int tag){
        this.imageView2 = imageView;
        tag2 = tag;
        if (tag==0){
            imageView2.setImageResource(R.drawable.ss2);
        }else {
            imageView2.setImageResource(R.drawable.ss4);
        }

    }

    public void uu(ImageView imageView11, ImageView imageView22, ImageView imageView33,ImageView imageView44){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (tag1 == tag2){
                    imageView1.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    aa++;
                }else {
                    imageView1.setImageResource(R.drawable.ss1);
                    imageView2.setImageResource(R.drawable.ss1);
                }
                imageView11.setClickable(true);
                imageView22.setClickable(true);
                imageView33.setClickable(true);
                imageView44.setClickable(true);
                if (aa == 2){
                    aa = 0;
                    textView.setVisibility(View.VISIBLE);
                    GmAS.aa = 1;
                    gmAS.getSharedPreferences(gmAS.getPackageName(), gmAS.MODE_PRIVATE).edit().putInt("aa", GmAS.aa).apply();
                }
            }
        },1000);

    }

    public  void  mgO(ImageView imageView1,ImageView imageView2,ImageView imageView3,ImageView imageView4){
        new Thread(new Runnable() {
            @Override
            public void run() {
             random = new Random();
             switch (random.nextInt(5)){
                 case 0:
                     imageView1.setTag(0);
                     imageView2.setTag(0);
                     imageView3.setTag(1);
                     imageView4.setTag(1);
                     break;
                 case 1:
                     imageView1.setTag(1);
                     imageView2.setTag(0);
                     imageView3.setTag(1);
                     imageView4.setTag(0);
                     break;
                 case 2:
                     imageView1.setTag(0);
                     imageView2.setTag(1);
                     imageView3.setTag(1);
                     imageView4.setTag(0);
                     break;
                 case 3:
                     imageView1.setTag(1);
                     imageView2.setTag(0);
                     imageView3.setTag(0);
                     imageView4.setTag(1);
                     break;
                 case 4:
                     imageView1.setTag(0);
                     imageView2.setTag(1);
                     imageView3.setTag(0);
                     imageView4.setTag(1);
                     break;
             }

            }
        }).start();
    }

}
