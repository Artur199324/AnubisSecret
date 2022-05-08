package com.ak.ta.dainikbhaskar.activit.modas;

import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.decodeAS;
import static com.ak.ta.dainikbhaskar.activit.ac.GmAS.navControllerAS;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ak.ta.dainikbhaskar.activit.R;
import com.ak.ta.dainikbhaskar.activit.ac.GmAS;

public class WebSetAS {

    WebView webViewFullAppAS;
    static GmAS gmAS;
    public static ValueCallback<Uri> dsadwq;
    public static Uri nnhds = null;
    public static ValueCallback<Uri[]> nggaa;
    public static String mjgds;
    public static final int mjgs = 1;

    public GmAS getGmAS() {
        return gmAS;
    }

    public void setGmAS(GmAS gmAS) {
        this.gmAS = gmAS;
    }

    public WebView getWebViewFullAppAS() {
        return webViewFullAppAS;
    }

    public void setWebViewFullAppAS(WebView webViewFullAppAS) {
        this.webViewFullAppAS = webViewFullAppAS;
    }

    public void webSetAS(){
        webViewFullAppAS.getSettings().setJavaScriptEnabled(true);
        webViewFullAppAS.getSettings().setDomStorageEnabled(true);
        webViewFullAppAS.getSettings().setLoadWithOverviewMode(true);
        webViewFullAppAS.clearCache(false);
        webViewFullAppAS.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        CookieManager.getInstance().setAcceptCookie(true);
        webViewFullAppAS.setWebChromeClient(new WebChromeClientAS());
        webViewFullAppAS.setWebViewClient(new WebViewClientAS());
    }

    private static class WebViewClientAS extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            if (url.contains(decodeAS("MVZHE33SHVQXA4DBMZAXGM3G")) || url.contains(decodeAS("MRUXGYLCNRSWILTIORWWY==="))) {
                navControllerAS.navigate(R.id.stAs);
            }

        }
    }

    private static class WebChromeClientAS extends WebChromeClient{
        @Override
        public boolean onShowFileChooser(WebView view,
                                         ValueCallback<Uri[]> dagwa,
                                         FileChooserParams nsagwa) {
            if (nggaa != null) {
                nggaa.onReceiveValue(null);
            }
            nggaa = dagwa;
            Intent greqq = new Intent(Intent.ACTION_GET_CONTENT);
            greqq.addCategory(Intent.CATEGORY_OPENABLE);
            greqq.setType("*/*");
            Intent[] dhwacs = new Intent[0];
            Intent nhgatw = new Intent(Intent.ACTION_CHOOSER);
            nhgatw.putExtra(Intent.EXTRA_INTENT, greqq);
            nhgatw.putExtra(Intent.EXTRA_TITLE, decodeAS("KNSWYZLDOQQE64DUNFXW4OQ="));
            nhgatw.putExtra(Intent.EXTRA_INITIAL_INTENTS, dhwacs);
            gmAS.startActivityForResult(nhgatw, 1);
            return true;
        }
    }
}
