package com.ak.ta.dainikbhaskar.activit.frg;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.vas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ak.ta.dainikbhaskar.activit.R;


public class GmO extends Fragment {

    ImageView imageView1, imageView2, imageView3, imageView4;
    boolean ff = true;
    TextView textView11;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View dcd = inflater.inflate(R.layout.fragment_gm_o, container, false);
        imageView1 = dcd.findViewById(R.id.imageView1);
        imageView2 = dcd.findViewById(R.id.imageView2);
        imageView3 = dcd.findViewById(R.id.imageView3);
        imageView4 = dcd.findViewById(R.id.imageView4);
        textView11 = dcd.findViewById(R.id.textView11);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                vas.jh(imageView1, imageView2, imageView3, imageView4);
                vas.t1(textView11);
            }
        }, 10);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ff) {
                    int ii = (int) imageView1.getTag();
                    vas.s1(imageView1,ii);
                    ff = false;

                } else {
                    int ii = (int) imageView1.getTag();
                    vas.s2(imageView1,ii);
                    ff = true;
                    vas.g1(imageView1,imageView2,imageView3,imageView4);
                    imageView1.setClickable(false);
                    imageView2.setClickable(false);
                    imageView3.setClickable(false);
                    imageView4.setClickable(false);
                }
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ff) {
                    int ii = (int) imageView2.getTag();
                    vas.s1(imageView2,ii);
                    ff = false;
                } else {
                    int ii = (int) imageView2.getTag();
                    vas.s2(imageView2,ii);
                    ff = true;
                    vas.g1(imageView1,imageView2,imageView3,imageView4);
                    imageView1.setClickable(false);
                    imageView2.setClickable(false);
                    imageView3.setClickable(false);
                    imageView4.setClickable(false);
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ff) {
                    int ii = (int) imageView3.getTag();
                    vas.s1(imageView3,ii);
                    ff = false;
                } else {
                    int ii = (int) imageView3.getTag();
                    vas.s2(imageView3,ii);
                    ff = true;
                    vas.g1(imageView1,imageView2,imageView3,imageView4);
                    imageView1.setClickable(false);
                    imageView2.setClickable(false);
                    imageView3.setClickable(false);
                    imageView4.setClickable(false);
                }
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ff) {
                    int ii = (int) imageView4.getTag();
                    vas.s1(imageView4,ii);
                    ff = false;
                } else {
                    int ii = (int) imageView4.getTag();
                    vas.s2(imageView4,ii);
                    ff = true;
                    vas.g1(imageView1,imageView2,imageView3,imageView4);
                    imageView1.setClickable(false);
                    imageView2.setClickable(false);
                    imageView3.setClickable(false);
                    imageView4.setClickable(false);
                }
            }
        });

        return dcd;
    }
}