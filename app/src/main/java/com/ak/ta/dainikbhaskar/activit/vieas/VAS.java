package com.ak.ta.dainikbhaskar.activit.vieas;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.decodeAS;
import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.ooo;

import android.app.Application;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.ak.ta.dainikbhaskar.activit.ac.GmAS;
import com.ak.ta.dainikbhaskar.activit.modas.AppAs;
import com.ak.ta.dainikbhaskar.activit.modas.DeeppAS;
import com.ak.ta.dainikbhaskar.activit.modas.FireBAS;
import com.ak.ta.dainikbhaskar.activit.frg.Prog;
import com.ak.ta.dainikbhaskar.activit.modas.MgO;
import com.ak.ta.dainikbhaskar.activit.modas.MgT;
import com.ak.ta.dainikbhaskar.activit.modas.MgTt;
import com.ak.ta.dainikbhaskar.activit.modas.OnlAS;
import com.ak.ta.dainikbhaskar.activit.modas.ParsAS;
import com.ak.ta.dainikbhaskar.activit.modas.ReCoAs;
import com.ak.ta.dainikbhaskar.activit.modas.StAp;
import com.ak.ta.dainikbhaskar.activit.modas.StDeep;
import com.ak.ta.dainikbhaskar.activit.modas.StGamAS;
import com.ak.ta.dainikbhaskar.activit.modas.StOrgAS;
import com.ak.ta.dainikbhaskar.activit.modas.WebSetAS;

public class VAS extends AndroidViewModel {

    MgO mgO;
    MgT mgT;
    MgTt mgTt;
    OnlAS onlAS;
    ReCoAs reCoAs;
    FireBAS fireBAS;
    ParsAS parsAS;
    AppAs appAs;
    DeeppAS dippAS;
    WebSetAS webSetAS;
    StAp stAp;
    StDeep stDeep;
    StGamAS stGamAS;
    StOrgAS stOrgAS;

    public VAS(@NonNull Application application) {
        super(application);
        mgO = new MgO();
        mgT = new MgT();
        mgTt = new MgTt();
        onlAS = new OnlAS();
        fireBAS = new FireBAS();
        parsAS = new ParsAS();
        appAs = new AppAs();
        dippAS = new DeeppAS();
        webSetAS = new WebSetAS();

    }


    public void startAs(DeeppAS dippAS, AppAs appAs, FireBAS fireBAS, GmAS gmAS) {
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (!appAs.getAf_statusAS().equals("-") || !dippAS.getStrDeppAS().equals("-")) {
                    if (appAs.getAf_statusAS().equals(decodeAS("JZXW4LLPOJTWC3TJMM======"))) {
                        stAp = new StAp();
                        stAp.stAp(appAs, fireBAS, gmAS);
                        ooo = true;
                    } else if (dippAS.getDeepAS() != null) {
                        stDeep = new StDeep();
                        stDeep.stDeep(dippAS, fireBAS, gmAS);
                        ooo = true;
                    } else {
                        if (fireBAS.getStatusAs().equals(decodeAS("GA======"))) {
                            stGamAS = new StGamAS();
                            stGamAS.startGaAs();
                        } else {
                            stOrgAS = new StOrgAS();
                            stOrgAS.stOrgAS(fireBAS, gmAS);
                            ooo = true;

                        }
                    }

                } else {
                    handler.postDelayed(this::run, 1000);

                }
            }
        });
    }

    public void weinAS(GmAS gmAS) {
        webSetAS.setGmAS(gmAS);
    }

    public void webSetAS(WebView webView) {
        webSetAS.setWebViewFullAppAS(webView);
        webSetAS.webSetAS();
    }

    public AppAs appsAS(GmAS gmAS) {
        appAs.setGmAS(gmAS);
        appAs.appAs(parsAS);
        return appAs;
    }

    public DeeppAS dippAS(GmAS gmAS) {
        dippAS.deepAS(gmAS, parsAS);
        return dippAS;
    }

    public void pasInAS(GmAS gmAS, String AIDAS, String apps_idAS) {
        parsAS.setGmAS(gmAS);
        parsAS.setGoogle_adidAS(AIDAS);
        parsAS.setAf_useridAS(apps_idAS);
    }

    public void fireBAScon(GmAS gmAS) {
        fireBAS.fireAs(gmAS);
    }

    public FireBAS fff() {
        return fireBAS;
    }

    public void jh(ImageView imageView1, ImageView imageView2, ImageView imageView3, ImageView imageView4) {

        mgO.mgO(imageView1, imageView2, imageView3, imageView4);
    }

    public void progAs(ImageView imageViews1, ImageView imageViews2, ImageView imageViews3, ImageView imageViews4) {
        Prog prog = new Prog(imageViews1, imageViews2, imageViews3, imageViews4);
        prog.idj();
    }

    public boolean onLAS(GmAS gmAS) {
        return onlAS.onAs(gmAS);
    }

    public void reAs(GmAS gmAS) {
        reCoAs = new ReCoAs(gmAS);
    }

    public void reeAS() {
        reCoAs.reCoAs();
    }

    public void s1(ImageView imageView, int tag) {
        mgO.oj(imageView, tag);
    }

    public void s2(ImageView imageView, int tag) {
        mgO.yt(imageView, tag);
    }

    public void g1(ImageView imageView, ImageView imageView1, ImageView imageView2, ImageView imageView3) {
        mgO.uu(imageView, imageView1, imageView2, imageView3);
    }

    public void ds(ImageView imageView, ImageView imageView1, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        mgT.jfg(imageView, imageView1, imageView2, imageView3, imageView4, imageView5);
    }

    public void s11(ImageView imageView, int tag) {
        mgT.itr(imageView, tag);
    }

    public void s22(ImageView imageView, int tag) {
        mgT.ds(imageView, tag);
    }

    public void g2(ImageView imageView, ImageView imageView1, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        mgT.dsh(imageView, imageView1, imageView2, imageView3, imageView4, imageView5);
    }

    public void jf(ImageView imageView, ImageView imageView1, ImageView imageView2, ImageView imageView3, ImageView imageView4,
                   ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11) {
        mgTt.setImageView10(imageView);
        mgTt.setImageView11(imageView1);
        mgTt.setImageView12(imageView2);
        mgTt.setImageView13(imageView3);
        mgTt.setImageView14(imageView4);
        mgTt.setImageView15(imageView5);
        mgTt.setImageView16(imageView6);
        mgTt.setImageView18(imageView7);
        mgTt.setImageView19(imageView8);
        mgTt.setImageView20(imageView9);
        mgTt.setImageView21(imageView10);
        mgTt.setImageView22(imageView11);
        mgTt.jgj();
    }

    public void ss13(ImageView imageView, int tag) {
        mgTt.dsh(imageView, tag);
    }

    public void ss23(ImageView imageView, int tag) {
        mgTt.fdh(imageView, tag);
    }

    public void g3() {
        mgTt.dfsa();
    }


    public void t1(TextView textView) {
        mgO.setTextView(textView);
    }

    public void t2(TextView textView) {
        mgT.setTextView(textView);
    }

    public void t3(TextView textView, TextView textViewp1, TextView textViewp2, TextView textViewW1, TextView textViewW2) {
        mgTt.setTextView(textView);
        mgTt.setTextViewp1(textViewp1);
        mgTt.setTextViewp2(textViewp2);
        mgTt.setTextViewW1(textViewW1);
        mgTt.setTextViewW2(textViewW2);
    }
}
