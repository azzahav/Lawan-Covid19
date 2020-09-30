package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CuciTangan extends AppCompatActivity {
    WebView webview2;
    WebSettings websettings2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuci_tangan);

        webview2 = (WebView)findViewById(R.id.webview1);
        websettings2 = webview2.getSettings();
        webview2.setWebViewClient(new WebViewClient());
        webview2.loadUrl("https://tirto.id/cara-cuci-tangan-yang-benar-untuk-cegah-virus-corona-covid-19-eCPj");

    }
}
