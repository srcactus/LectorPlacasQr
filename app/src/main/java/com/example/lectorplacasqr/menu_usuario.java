package com.example.lectorplacasqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class menu_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);
    }

    public boolean onCreateOptionsMenu(Menu menu_principal){
        getMenuInflater().inflate(R.menu.menu_principal, menu_principal);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.btnInicio:{
                onRestart();
            }
            break;
            case R.id.btnEscaneaQr:{
                Intent intent = new Intent(menu_usuario.this, scan_qr.class);
                startActivity(intent);
            }
            break;
            case R.id.btnSalir:{
                finish();
            }
            break;
        }

        return true;
    }

}