package com.ak.ta.dainikbhaskar.activit.frg;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.vas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ak.ta.dainikbhaskar.activit.R;


public class AsSt extends Fragment {

    ImageView images1;
    ImageView images2;
    ImageView images3;
    ImageView images4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viesdsw = inflater.inflate(R.layout.fragment_as_st, container, false);
        images1 = viesdsw.findViewById(R.id.images1);
        images2 = viesdsw.findViewById(R.id.images2);
        images3 = viesdsw.findViewById(R.id.images3);
        images4 = viesdsw.findViewById(R.id.images4);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                vas.progAs(images1,images2,images3,images4);
            }
        },200);

        return viesdsw;
    }
}