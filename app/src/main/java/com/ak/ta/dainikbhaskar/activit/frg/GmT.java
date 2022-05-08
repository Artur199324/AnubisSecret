package com.ak.ta.dainikbhaskar.activit.frg;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.vas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ak.ta.dainikbhaskar.activit.R;


public class GmT extends Fragment {

    ImageView imageView,imageView5,imageView6,imageView7,imageView8,imageView9;
    boolean gg = true;
    TextView textView22;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View ifd =  inflater.inflate(R.layout.fragment_gm_t, container, false);
        imageView = ifd.findViewById(R.id.imageView);
        imageView5 = ifd.findViewById(R.id.imageView5);
        imageView6 = ifd.findViewById(R.id.imageView6);
        imageView7 = ifd.findViewById(R.id.imageView7);
        imageView8 = ifd.findViewById(R.id.imageView8);
        imageView9 = ifd.findViewById(R.id.imageView9);
        textView22 = ifd.findViewById(R.id.textView22);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                vas.ds(imageView,imageView5,imageView6,imageView7,imageView8,imageView9);
                vas.t2(textView22);
            }
        },200);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gg) {
                    int ii = (int) imageView.getTag();
                    vas.s11(imageView,ii);
                    gg = false;

                } else {
                    int ii = (int) imageView.getTag();
                    vas.s22(imageView,ii);
                    gg = true;
                    vas.g2(imageView,imageView5,imageView6,imageView7,imageView8,imageView9);
                    imageView.setClickable(false);
                    imageView5.setClickable(false);
                    imageView6.setClickable(false);
                    imageView7.setClickable(false);
                    imageView8.setClickable(false);
                    imageView9.setClickable(false);
                }
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gg) {
                    int ii = (int) imageView5.getTag();
                    vas.s11(imageView5,ii);
                    gg = false;

                } else {
                    int ii = (int) imageView5.getTag();
                    vas.s22(imageView5,ii);
                    gg = true;
                    vas.g2(imageView,imageView5,imageView6,imageView7,imageView8,imageView9);
                    imageView.setClickable(false);
                    imageView5.setClickable(false);
                    imageView6.setClickable(false);
                    imageView7.setClickable(false);
                    imageView8.setClickable(false);
                    imageView9.setClickable(false);
                }

            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (gg) {
                    int ii = (int) imageView6.getTag();
                    vas.s11(imageView6,ii);
                    gg = false;

                } else {
                    int ii = (int) imageView6.getTag();
                    vas.s22(imageView6,ii);
                    gg = true;
                    vas.g2(imageView,imageView5,imageView6,imageView7,imageView8,imageView9);
                    imageView.setClickable(false);
                    imageView5.setClickable(false);
                    imageView6.setClickable(false);
                    imageView7.setClickable(false);
                    imageView8.setClickable(false);
                    imageView9.setClickable(false);
                }
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (gg) {
                    int ii = (int) imageView7.getTag();
                    vas.s11(imageView7,ii);
                    gg = false;

                } else {
                    int ii = (int) imageView7.getTag();
                    vas.s22(imageView7,ii);
                    gg = true;
                    vas.g2(imageView,imageView5,imageView6,imageView7,imageView8,imageView9);
                    imageView.setClickable(false);
                    imageView5.setClickable(false);
                    imageView6.setClickable(false);
                    imageView7.setClickable(false);
                    imageView8.setClickable(false);
                    imageView9.setClickable(false);
                }

            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gg) {
                    int ii = (int) imageView8.getTag();
                    vas.s11(imageView8,ii);
                    gg = false;

                } else {
                    int ii = (int) imageView8.getTag();
                    vas.s22(imageView8,ii);
                    gg = true;
                    vas.g2(imageView,imageView5,imageView6,imageView7,imageView8,imageView9);
                    imageView.setClickable(false);
                    imageView5.setClickable(false);
                    imageView6.setClickable(false);
                    imageView7.setClickable(false);
                    imageView8.setClickable(false);
                    imageView9.setClickable(false);
                }

            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gg) {
                    int ii = (int) imageView9.getTag();
                    vas.s11(imageView9,ii);
                    gg = false;

                } else {
                    int ii = (int) imageView9.getTag();
                    vas.s22(imageView9,ii);
                    gg = true;
                    vas.g2(imageView,imageView5,imageView6,imageView7,imageView8,imageView9);
                    imageView.setClickable(false);
                    imageView5.setClickable(false);
                    imageView6.setClickable(false);
                    imageView7.setClickable(false);
                    imageView8.setClickable(false);
                    imageView9.setClickable(false);
                }
            }
        });

        return ifd;
    }
}