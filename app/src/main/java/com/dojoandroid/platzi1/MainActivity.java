package com.dojoandroid.platzi1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dojoandroid.platzi1.pojo.alumno;
import com.dojoandroid.platzi1.view.Container2Activity;
import com.dojoandroid.platzi1.view.CreateAccountActivity;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goCreateAcoun(View view){
        Intent i = new Intent(MainActivity.this, CreateAccountActivity.class);
        startActivity(i);
    }
    public void goContainer(View view){
        Intent i = new Intent(this, Container2Activity.class);
        startActivity(i);
    }
    public void goWeb(View view){
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.setData(Uri.parse("http://www.platzigram.com"));
        startActivity(intent);
    }
    public void pojo(View view){
        //instanciando
        alumno alumno1 = new alumno();

        alumno1.setNombre("vanesaa adriana");
        alumno1.setFechaNAcimiento(new Date());
        alumno1.setNumero_cuenta(123333333);
       // Bundle b = intent.getExtras();

//Colocar un bundle en un intent
       // Bundle b2 = new Bundle();

//Rellenar el bundle con datos fundamentales
     //   putExtra(String name, boolean value);
        //Añadir el bundle al intent
       // intent.putExtras(b2)
    }
}
