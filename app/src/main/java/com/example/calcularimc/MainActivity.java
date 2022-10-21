package com.example.calcularimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editIdade;
    private EditText editPeso;
    private EditText editAltura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editIdade = findViewById(R.id.editIdade);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
    }

    public void calcularImc(View view) {

        //calculo ICM
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso / (altura * altura);


        //Se
        if (resultado < 16) {
            textResultado.setText("MAGREZA GRAU III");

        } else if (resultado <= 16 || resultado < 16.9) {
            textResultado.setText("MAGREZA GRAU II");

        } else if (resultado <= 17 || resultado < 18.4) {
            textResultado.setText("MAGREZA GRAU I");

        } else if (resultado <= 18.5 || resultado < 24.9) {
            textResultado.setText("EUTROFIA");

        } else if (resultado <= 25 || resultado < 29.9) {
            textResultado.setText("PRÉ-OBESIDADE");

        } else if (resultado <= 30 || resultado < 34.9) {
            textResultado.setText("OBESIDADE MODERADA (GRAU I)");

        } else if (resultado <= 35 || resultado < 39.9) {
            textResultado.setText("OBESIDADE SEVERA (GRAU II)");

        } else if (resultado >= 40) {
            textResultado.setText("OBESIDADE MUITO SEVERA (GRAU III)");

        }
    }

}