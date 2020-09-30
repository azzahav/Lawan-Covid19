package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CekUpdate extends AppCompatActivity {
WebView webview4;
WebSettings websettings4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_update);

        webview4 = (WebView)findViewById(R.id.webview1);
        websettings4 = webview4.getSettings();
        webview4.setWebViewClient(new WebViewClient());
        webview4.loadUrl("https://covid19.go.id");
    }
}
