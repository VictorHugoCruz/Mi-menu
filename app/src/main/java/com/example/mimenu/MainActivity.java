package com.example.mimenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.tecnologico, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                Toast.makeText(this, "Sistemas Informáticos", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Comunicación", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Agropecuaria", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, "Informática Industrial", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item5:
                Toast.makeText(this, "Electrónica", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item6:
                Toast.makeText(this, "Industria de Alimentos", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item7:
                Toast.makeText(this, "Gastronomía", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this, "ESTADÍSTICA", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this, "PROGRAMACIÓN II", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem3:
                Toast.makeText(this, "ESTRUCTURA DE DATOS", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem4:
                Toast.makeText(this, "REDES DE COMPUTADORAS I", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem5:
                Toast.makeText(this, "PROGRAMACIÓN PARA DISPOSITIVOS MÓVILES", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem6:
                Toast.makeText(this, "ANÁLISIS Y DISEÑO DE SISTEMAS I", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem7:
                Toast.makeText(this, "\tDISEÑO Y PROGRAMACIÓN WEB I", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem8:
                Toast.makeText(this, "BASE DE DATOS I", Toast.LENGTH_SHORT).show();
                return true;


        }
        return true;
    }
}


