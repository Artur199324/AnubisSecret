package com.ak.ta.dainikbhaskar.activit.frg;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.decodeAS;
import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.vas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.ak.ta.dainikbhaskar.activit.R;


public class WeAS extends Fragment {

    public static WebView webViewFullAppAS;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View gfg = inflater.inflate(R.layout.fragment_we_a_s, container, false);
        webViewFullAppAS = gfg.findViewById(R.id.webViewFullAppAS);
        vas.webSetAS(webViewFullAppAS);
        assert getArguments() != null;
        String ls = getArguments().getString(decodeAS("NRXWCZA="));
        webViewFullAppAS.loadUrl(ls);
        return gfg;
    }
}