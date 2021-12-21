package com.example.listaelementos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listaelementos.db.ContactoDataSource;
import com.example.listaelementos.models.Contacto;

import com.example.listaelementos.MainActivity.*;

public class DetalleActivity extends AppCompatActivity {

    TextView tvNombre, tvPaterno, tvMaterno, tvTelefono;
    ContactoDataSource dataSource;
    long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        setTitle("DETALLE PERSONA");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dataSource = new ContactoDataSource(this);

        Intent intent = getIntent();
        //String nombre = intent.getStringExtra("nombre");

        Contacto contacto = (Contacto) intent.getSerializableExtra("contacto");
        String nombre = contacto.getNombre();
        id=contacto.getId();

        tvNombre = findViewById(R.id.tvNombre);
        tvPaterno = findViewById(R.id.tvPaterno);
        tvMaterno = findViewById(R.id.tvMaterno);
        tvTelefono = findViewById(R.id.tvTelefono);

        tvNombre.setText(nombre);
        tvPaterno.setText(contacto.getPaterno());
        tvMaterno.setText(contacto.getMaterno());
        tvTelefono.setText(contacto.getTelefono());

        Log.i("DetalleActivity", "Nombre recibido: " + nombre);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detalle_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case android.R.id.home:
                finish();
                break;
            case R.id.action_eliminar:
              //  Toast.makeText(this, "Eliminar", Toast.LENGTH_LONG).show();
                dataSource.openDB();
                eliminarContacto();
                dataSource.closeDB();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }



    public void eliminarContacto(){
        //id del contacto
        dataSource.eliminarContacto(id);
        setResult(1);
        finish();
    }
}