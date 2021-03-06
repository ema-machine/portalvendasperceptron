package com.example.portalvendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AliexpressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aliexpress);

        WebView webView = findViewById(R.id.webview);

        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://pt.aliexpress.com/");
    }

    public void OnBack(View view){

        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);

    }
}
