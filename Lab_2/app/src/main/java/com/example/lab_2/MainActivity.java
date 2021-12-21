package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText tnom1;
    //private Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tnom1 = (EditText) findViewById(R.id.id_txt_Nombre1);

    }


    public void IrSiguiente (View view){

        String Nombre = tnom1.getText().toString();

        if(Nombre.length() != 0){
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("dato", tnom1.getText().toString());
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Debe ingresar un nombre", Toast.LENGTH_SHORT).show();
        }
    }

    public void Image (View view){
        Toast.makeText(this, "Laboratorio 2", Toast.LENGTH_SHORT).show();
    }
}