package com.example.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.security.auth.Destroyable;

public class MainActivity2 extends AppCompatActivity {

    private TextView resultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = (TextView) findViewById(R.id.id_txt_Resultado);

        String suma = getIntent().getStringExtra("suma");
        resultado.setText(suma);
    }

    public void irAnterior (View view){
        Intent intent = new Intent(this, MainActivity.class);
        //Intent intent1 = new Intent(this, MainActivity2.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity2", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity2", "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity2", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity2", "onDestroy");
    }



}