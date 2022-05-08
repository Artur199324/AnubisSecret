package com.ak.ta.dainikbhaskar.activit.modas;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.decodeAS;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

public class ParsAS {

     String sab1AS = "";
     String sab2AS = "";
     String sab3AS = "";
     String sab4AS = "";
     String sab5AS = "";
     String sab6AS = "";
     String sab7AS = "";
     String sab8AS = "";
     String sab9AS = "";
     String sab10AS = "";
     String media_sourceAS;
     String campaignAS = null;
     String google_adidAS;
     String af_useridAS;
     String af_channelAS;
     String dev_keyAS = "QfLWAC8jUJtN2WQ7hhEznX";
     String bundleAS;
     String fb_app_idAS;
     String fb_atAS;
     GmAS gmAS;

    public String getMedia_sourceAS() {
        return media_sourceAS;
    }

    public void setMedia_sourceAS(String media_sourceAS) {
        this.media_sourceAS = media_sourceAS;
    }

    public  String getCampaignAS() {
        return campaignAS;
    }

    public void setCampaignAS(String campaignAS) {
        this.campaignAS = campaignAS;
    }

    public String getGoogle_adidAS() {
        return google_adidAS;
    }

    public void setGoogle_adidAS(String google_adidAS) {
        this.google_adidAS = google_adidAS;
    }

    public String getAf_useridAS() {
        return af_useridAS;
    }

    public void setAf_useridAS(String af_useridAS) {
        this.af_useridAS = af_useridAS;
    }

    public String getAf_channelAS() {
        return af_channelAS;
    }

    public void setAf_channelAS(String af_channelAS) {
        this.af_channelAS = af_channelAS;
    }

    public String getDev_keyAS() {
        return dev_keyAS;
    }

    public void setDev_keyAS(String dev_keyAS) {
        this.dev_keyAS = dev_keyAS;
    }

    public GmAS getGmAS() {
        return gmAS;
    }

    public void setGmAS(GmAS gmAS) {
        this.gmAS = gmAS;
    }

    public  String ds(String s){
        fb_app_idAS = gmAS.getResources().getString(R.string.fi);
        fb_atAS = gmAS.getResources().getString(R.string.ft);
        bundleAS = gmAS.getPackageName();
        String[] dd = {sab1AS, sab2AS, sab3AS, sab4AS, sab5AS, sab6AS, sab5AS, sab6AS, sab7AS, sab8AS, sab9AS, sab10AS};
        String ss[] = s.split("_");
        for (int i = 0; i<dd.length; i++){
            try {
                dd[i] = ss[i];
            }catch (Exception e){

            }

        }

        String[] ff = {decodeAS("EZZXKYRRHU======"),decodeAS("EZZXKYRSHU======"),decodeAS("EZZXKYRTHU======"),decodeAS("EZZXKYRUHU======"),decodeAS("EZZXKYRVHU======"),decodeAS("EZZXKYRWHU======"),decodeAS("EZZXKYRXHU======"),decodeAS("EZZXKYRYHU======"),decodeAS("EZZXKYRZHU======"),decodeAS("EZZXKYRRGA6Q===="), };
        String[]fff = {decodeAS("EZRWC3LQMFUWO3R5"),decodeAS("EZTW633HNRSV6YLENFSD2==="),decodeAS("EZQWMX3VONSXE2LEHU======"),decodeAS("EZQWMX3DNBQW43TFNQ6Q===="),decodeAS("EZSGK5S7NNSXSPI="),decodeAS("EZRHK3TENRST2==="),decodeAS("EZTGEX3BOBYF62LEHU======"),decodeAS("EZTGEX3BOQ6Q====")};
        String [] ds = {campaignAS, google_adidAS, af_useridAS, af_channelAS, dev_keyAS, bundleAS, fb_app_idAS, fb_atAS};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<dd.length;i++){
            try {
                stringBuilder.append(ff[i]);
                stringBuilder.append(dd[i]);
            }catch (Exception e){

            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i< fff.length;i++){
            builder.append(fff[i]);
            builder.append(ds[i]);
        }

        String ffd = decodeAS("H5WWKZDJMFPXG33VOJRWKPI=") + media_sourceAS + stringBuilder.toString() + builder.toString();


        return ffd;
    }

}
