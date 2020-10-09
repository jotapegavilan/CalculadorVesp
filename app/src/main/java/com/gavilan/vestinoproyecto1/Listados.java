package com.gavilan.vestinoproyecto1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Listados extends AppCompatActivity {

    private Spinner spinner;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listados);

        spinner = findViewById(R.id.spinner);
        recycler = findViewById(R.id.recycler);

        ArrayList<String> opcionesSpinner = new ArrayList<>();
        opcionesSpinner.add("Seleccione una región");
        opcionesSpinner.add("Metropolitana");
        opcionesSpinner.add("Bio-Bio");
        opcionesSpinner.add("Los lagos");

        // Para asignar una lista de opciones al spinner
        // debemos crear un objeto de tipo ArrayAdapter (adaptador)

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,opcionesSpinner);

        spinner.setAdapter(adapter);
    }
}