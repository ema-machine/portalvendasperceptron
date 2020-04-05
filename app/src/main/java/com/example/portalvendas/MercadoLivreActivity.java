package com.example.portalvendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MercadoLivreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercado_livre);

        WebView webView = findViewById(R.id.webview);

        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.mercadolivre.com.br/");
    }

    public void OnBack(View view){

        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);

    }
}
