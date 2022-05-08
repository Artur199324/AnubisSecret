package com.ak.ta.dainikbhaskar.activit.modas;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

import java.util.Random;

public class MgT {

    Random random;
    ImageView imageView1;
    ImageView imageView2;
    int tag1;
    int tag2;
    public static GmAS gmAS;
    int aa = 0;
    TextView textView;

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public void itr(ImageView imageView, int tag) {
        this.imageView1 = imageView;
        tag1 = tag;
        if (tag == 0) {
            imageView1.setImageResource(R.drawable.ss2);
        } else if (tag1 == 1) {
            imageView1.setImageResource(R.drawable.ss4);
        } else if (tag1 == 2) {
            imageView1.setImageResource(R.drawable.ss5);
        }


    }

    public void ds(ImageView imageView, int tag) {
        this.imageView2 = imageView;
        tag2 = tag;
        if (tag == 0) {
            imageView2.setImageResource(R.drawable.ss2);
        } else if (tag == 1) {
            imageView2.setImageResource(R.drawable.ss4);
        } else if (tag == 2) {
            imageView2.setImageResource(R.drawable.ss5);
        }

    }

    public void dsh(ImageView imageView11, ImageView imageView22, ImageView imageView33, ImageView imageView44, ImageView imageView55, ImageView imageView66) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (tag1 == tag2) {
                    imageView1.setVisibility(View.INVISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                    aa++;
                } else {
                    imageView1.setImageResource(R.drawable.ss1);
                    imageView2.setImageResource(R.drawable.ss1);
                }
                imageView11.setClickable(true);
                imageView22.setClickable(true);
                imageView33.setClickable(true);
                imageView44.setClickable(true);
                imageView55.setClickable(true);
                imageView66.setClickable(true);
                if (aa == 3){
                    aa = 0;
                    textView.setVisibility(View.VISIBLE);
                    GmAS.bb = 1;
                    gmAS.getSharedPreferences(gmAS.getPackageName(), gmAS.MODE_PRIVATE).edit().putInt("bb", GmAS.aa).apply();
                }
            }
        }, 1000);
    }


    public void jfg(ImageView imageView, ImageView imageView1, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        random = new Random();
        new Thread(new Runnable() {
            @Override
            public void run() {
                switch (random.nextInt(6)) {
                    case 0:

                        imageView.setTag(0);
                        imageView1.setTag(0);
                        imageView2.setTag(1);
                        imageView3.setTag(1);
                        imageView4.setTag(2);
                        imageView5.setTag(2);
                        break;
                    case 1:

                        imageView.setTag(1);
                        imageView1.setTag(1);
                        imageView2.setTag(0);
                        imageView3.setTag(0);
                        imageView4.setTag(2);
                        imageView5.setTag(2);
                        break;
                    case 2:

                        imageView.setTag(2);
                        imageView1.setTag(2);
                        imageView2.setTag(0);
                        imageView3.setTag(0);
                        imageView4.setTag(1);
                        imageView5.setTag(1);
                        break;
                    case 3:

                        imageView.setTag(2);
                        imageView1.setTag(0);
                        imageView2.setTag(1);
                        imageView3.setTag(2);
                        imageView4.setTag(0);
                        imageView5.setTag(1);
                        break;
                    case 4:

                        imageView.setTag(0);
                        imageView1.setTag(2);
                        imageView2.setTag(0);
                        imageView3.setTag(1);
                        imageView4.setTag(2);
                        imageView5.setTag(1);
                        break;
                    case 5:

                        imageView.setTag(2);
                        imageView1.setTag(0);
                        imageView2.setTag(1);
                        imageView3.setTag(2);
                        imageView4.setTag(1);
                        imageView5.setTag(0);
                        break;
                }

            }
        }).start();
    }
}
