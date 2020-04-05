package com.example.portalvendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnMercadoLivre(View view){
        Intent intent = new Intent(this,MercadoLivreActivity.class);

        startActivity(intent);
    }

    public void OnBuscape(View view){

        Intent intent = new Intent(this,BuscapeActivity.class);

        startActivity(intent);

    }

    public void onEbay(View view){

        Intent intent = new Intent(this,EbayActivity.class);

        startActivity(intent);

    }

    public void OnWebmotors(View view){

        Intent intent = new Intent(this,WebmotorsActivity.class);

        startActivity(intent);

    }

    public void OnMagalu(View view){

        Intent intent = new Intent(this,MagaluActivity.class);

        startActivity(intent);

    }

    public void OnNetshoes(View view){

        Intent intent = new Intent(this,NetshoesActivity.class);

        startActivity(intent);

    }

    public void OnAmericanas(View view){

        Intent intent = new Intent(this,AmericanasActivity.class);

        startActivity(intent);

    }

    public void OnSubmarino(View view){

        Intent intent = new Intent(this,SubmarinoActivity.class);

        startActivity(intent);

    }

    public void OnMobly(View view){

        Intent intent = new Intent(this,MoblyActivity.class);

        startActivity(intent);

    }

    public void OnAliexpress(View view){

        Intent intent = new Intent(this,AliexpressActivity.class);

        startActivity(intent);

    }

    public void OnSobre(View view){

        Intent intent = new Intent(this,SobreActivity.class);

        startActivity(intent);

    }


}
