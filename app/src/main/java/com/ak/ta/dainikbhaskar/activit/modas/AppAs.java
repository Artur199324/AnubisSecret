package com.ak.ta.dainikbhaskar.activit.modas;



import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.decodeAS;

import android.util.Log;

import com.ak.ta.dainikbhaskar.activit.ac.GmAS;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

import java.util.Map;

public class AppAs {


    GmAS gmAS;
    String af_statusAS = "-";
    String media_sourceAS;
    String af_channelAS;
    String campaignAS;
    String strAppsFlyerAS = "-";

    public String getAf_statusAS() {
        return af_statusAS;
    }

    public void setAf_statusAS(String af_statusAS) {
        this.af_statusAS = af_statusAS;
    }

    public String getStrAppsFlyerAS() {
        return strAppsFlyerAS;
    }

    public void setStrAppsFlyerAS(String strAppsFlyerAS) {
        this.strAppsFlyerAS = strAppsFlyerAS;
    }

    public GmAS getGmAS() {
        return gmAS;
    }

    public void setGmAS(GmAS gmAS) {
        this.gmAS = gmAS;
    }

    public void appAs(ParsAS parsAS){
        AppsFlyerLib.getInstance().init("QfLWAC8jUJtN2WQ7hhEznX", new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                af_statusAS = map.get(decodeAS("MFTF643UMF2HK4Y=")).toString();
                Log.d("weq",af_statusAS);
                if (af_statusAS.equals(decodeAS("JZXW4LLPOJTWC3TJMM======"))){

                    try {
                        campaignAS = map.get(decodeAS("MNQW24DBNFTW4===")).toString();

                        parsAS.setCampaignAS(campaignAS);
                    }catch (Exception e){

                    }

                    try {

                        media_sourceAS = map.get(decodeAS("NVSWI2LBL5ZW65LSMNSQ====")).toString();
                        parsAS.setMedia_sourceAS(media_sourceAS);
                    }catch (Exception e){

                    }

                    try {

                        af_channelAS = map.get(decodeAS("MFTF6Y3IMFXG4ZLM")).toString();
                        parsAS.setAf_channelAS(af_channelAS);
                    }catch (Exception e){

                    }

                    setStrAppsFlyerAS(parsAS.ds(campaignAS));
                }else {

                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },gmAS);
        AppsFlyerLib.getInstance().start(gmAS);

    }
}
