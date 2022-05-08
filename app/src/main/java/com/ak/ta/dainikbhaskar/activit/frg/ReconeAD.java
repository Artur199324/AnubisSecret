package com.ak.ta.dainikbhaskar.activit.frg;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.decodeAS;
import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.vas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ak.ta.dainikbhaskar.activit.R;


public class ReconeAD extends Fragment {

    TextView textViewInt;
    Button buttonInt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View ddv = inflater.inflate(R.layout.fragment_recone_a_d, container, false);
        textViewInt = ddv.findViewById(R.id.textViewInt);
        buttonInt = ddv.findViewById(R.id.buttonInt);
        textViewInt.setText(decodeAS("JZXSASLOORSXE3TFOQ======"));
        buttonInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vas.reeAS();
            }
        });

        return ddv;
    }
}