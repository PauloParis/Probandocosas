package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private TextView tnom2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tnom2 = (TextView) findViewById(R.id.id_txt_Nombre2);

        String dato = getIntent().getStringExtra("dato");
        tnom2.setText(dato);
    }

    public void Regresar (View view){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void Image (View view){
        Toast.makeText(this, "Computación Movil", Toast.LENGTH_SHORT).show();
    }

}