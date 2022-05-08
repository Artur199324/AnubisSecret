package com.ak.ta.dainikbhaskar.activit.frg;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.navControllerAS;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.ac.GmAS;


public class StAs extends Fragment {

    TextView textView1, textView2, textView3, textViewone, textVieclose;
    public static GmAS gmAS;
    public static boolean dddd = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vsc = inflater.inflate(R.layout.fragment_st_as, container, false);
        textView1 = vsc.findViewById(R.id.textView1);
        textView2 = vsc.findViewById(R.id.textView2);
        textView3 = vsc.findViewById(R.id.textView3);
        textViewone = vsc.findViewById(R.id.textViewone);
        textVieclose = vsc.findViewById(R.id.textVieclose);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navControllerAS.navigate(R.id.gmO);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GmAS.aa == 1) {
                    navControllerAS.navigate(R.id.gmT);
                } else {
                    Toast toast = Toast.makeText(gmAS.getApplicationContext(), "Complete the previous level", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GmAS.bb == 1) {
                    navControllerAS.navigate(R.id.gmTt);
                } else {
                    Toast toast = Toast.makeText(gmAS.getApplicationContext(), "Complete the previous level", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        textViewone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (GmAS.cc == 1) {
                    dddd = true;
                    navControllerAS.navigate(R.id.gmTt);
                } else {
                    Toast toast = Toast.makeText(gmAS.getApplicationContext(), "Complete the previous level", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        textVieclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gmAS.finish();
            }
        });
        return vsc;
    }
}