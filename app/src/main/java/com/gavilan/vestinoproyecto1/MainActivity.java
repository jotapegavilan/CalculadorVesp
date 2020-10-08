package com.gavilan.vestinoproyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    EditText txtN1, txtN2,txtResultado;
    Button btnSuma, btnResta, btnDivide, btnMultiplica;
    float n1,n2,resultado;

    public void LeerDatos(){
        if(txtN1.getText().toString().isEmpty() == true){
            Snackbar.make(getCurrentFocus(),"N1 esta vacío.",Snackbar.LENGTH_LONG).show();
            return;
        }
        if(txtN2.getText().toString().isEmpty()){
            txtN2.setError("No puede estar vacía.");
            return;
        }
        try{
            n1 = Float.parseFloat(txtN1.getText().toString());
        }catch (Exception e){
            txtN1.setError("Error en el dato ingresado");
            return;
        }
        try{
            n2 = Float.parseFloat(txtN2.getText().toString());
        }catch (Exception e){
            txtN2.setError("Error en el dato ingresado");
            return;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtN1 = findViewById(R.id.txtN1);
        txtN2 = findViewById(R.id.txtN2);
        txtResultado = findViewById(R.id.txtResultado);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiplica = findViewById(R.id.btnMultiplica);

        //txtN1.getText().toString();
        //txtN1.setText("Texto cualquiera");



        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LeerDatos();
                resultado = n1 + n2;
                txtResultado.setText(String.valueOf(resultado));
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LeerDatos();
                resultado = n1 - n2;
                txtResultado.setText(String.valueOf(resultado));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LeerDatos();
                if(n2 == 0){
                    txtN2.setError("El divisor no puede ser 0");
                    return;
                }
                resultado = n1 / n2;
                txtResultado.setText(String.valueOf(resultado));
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LeerDatos();
                resultado = n1 * n2;
                txtResultado.setText(String.valueOf(resultado));
            }
        });

    }
}