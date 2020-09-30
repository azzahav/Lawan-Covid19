package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class JagaJarak extends AppCompatActivity {
    WebView webviewku;
    WebSettings websettingsku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaga_jarak);

        webviewku = (WebView)findViewById(R.id.webview1);
        websettingsku = webviewku.getSettings();
        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("https://katadata.co.id/infografik/2020/03/31/pentingnya-jaga-jarak-di-tengah-pandemi-covid-19");
    }
}
