package com.example.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private EditText tnum1;
    private EditText tnum2;
    //private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tnum1 = (EditText) findViewById(R.id.id_txt_Num_1);
        tnum2 = (EditText) findViewById(R.id.id_txt_Num_2);
        //result = (TextView) findViewById(R.id.id_txt_Resultado);
    }

    public void irSiguiente (View view){

        String valor1 = tnum1.getText().toString();
        String valor2 = tnum2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        int suma = numero1 + numero2;
        String resultado = String.valueOf(suma);
        //result.setText(resultado);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("suma", resultado);
        startActivity(intent);
        Toast.makeText(this, "Ir a la Actividad Dos", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy");
    }

}