package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PakaiMasker extends AppCompatActivity {
WebView webview3;
WebSettings websettings3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakai_masker);
        webview3 = (WebView)findViewById(R.id.webview1);
        websettings3 = webview3.getSettings();
        webview3.setWebViewClient(new WebViewClient());
        webview3.loadUrl("https://www.alodokter.com/cara-menggunakan-masker-kain-untuk-mencegah-infeksi-virus-corona");
    }
}
