package com.ak.ta.dainikbhaskar.activit.frg;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.vas;
import static com.ak.ta.dainikbhaskar.activit.frg.StAs.dddd;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ak.ta.dainikbhaskar.activit.R;


public class GmTt extends Fragment {


    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView18;
    ImageView imageView19;
    ImageView imageView20;
    ImageView imageView21;
    ImageView imageView22;
    boolean feht = true;
    TextView textView33,textViewp1,textViewp2,textViewW1,textViewW2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vvd = inflater.inflate(R.layout.fragment_gm_tt, container, false);

        imageView10 = vvd.findViewById(R.id.imageView10);
        imageView11 = vvd.findViewById(R.id.imageView11);
        imageView12 = vvd.findViewById(R.id.imageView12);
        imageView13 = vvd.findViewById(R.id.imageView13);
        imageView14 = vvd.findViewById(R.id.imageView14);
        imageView15 = vvd.findViewById(R.id.imageView15);
        imageView16 = vvd.findViewById(R.id.imageView16);
        imageView18 = vvd.findViewById(R.id.imageView18);
        imageView19 = vvd.findViewById(R.id.imageView19);
        imageView20 = vvd.findViewById(R.id.imageView20);
        imageView21 = vvd.findViewById(R.id.imageView21);
        imageView22 = vvd.findViewById(R.id.imageView22);
        textView33 = vvd.findViewById(R.id.textView33);
        textViewp1 = vvd.findViewById(R.id.textViewp1);
        textViewp2 = vvd.findViewById(R.id.textViewp2);
        textViewW1 = vvd.findViewById(R.id.textViewW1);
        textViewW2 = vvd.findViewById(R.id.textViewW2);

        if (dddd){
            textViewp1.setVisibility(View.VISIBLE);
            textViewp2.setVisibility(View.VISIBLE);
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                vas.jf(imageView10, imageView11, imageView12, imageView13, imageView14,
                        imageView15, imageView16, imageView18, imageView19, imageView20, imageView21, imageView22);
                vas.t3(textView33,textViewp1,textViewp2,textViewW1,textViewW2);
            }
        }, 200);

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView10.getTag();
                if (feht) {
                    vas.ss13(imageView10, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView10, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView11.getTag();
                if (feht) {
                    vas.ss13(imageView11, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView11, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }

            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView12.getTag();
                if (feht) {
                    vas.ss13(imageView12, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView12, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView13.getTag();
                if (feht) {
                    vas.ss13(imageView13, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView13, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView14.getTag();
                if (feht) {
                    vas.ss13(imageView14, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView14, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView15.getTag();
                if (feht) {
                    vas.ss13(imageView15, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView15, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView16.getTag();
                if (feht) {
                    vas.ss13(imageView16, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView16, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView18.getTag();
                if (feht) {
                    vas.ss13(imageView18, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView18, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView19.getTag();
                if (feht) {
                    vas.ss13(imageView19, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView19, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });

        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView20.getTag();
                if (feht) {
                    vas.ss13(imageView20, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView20, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });
        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView21.getTag();
                if (feht) {
                    vas.ss13(imageView21, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView21, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ii = (int) imageView22.getTag();
                if (feht) {
                    vas.ss13(imageView22, ii);
                    feht = false;

                } else {
                    vas.ss23(imageView22, ii);
                    feht = true;
                    vas.g3();
                    imageView10.setClickable(false);
                    imageView11.setClickable(false);
                    imageView12.setClickable(false);
                    imageView13.setClickable(false);
                    imageView14.setClickable(false);
                    imageView15.setClickable(false);
                    imageView16.setClickable(false);
                    imageView18.setClickable(false);
                    imageView19.setClickable(false);
                    imageView20.setClickable(false);
                    imageView21.setClickable(false);
                    imageView22.setClickable(false);
                }
            }
        });


        return vvd;
    }
}