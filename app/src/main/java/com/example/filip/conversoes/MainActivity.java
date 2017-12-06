package com.example.filip.conversoes;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView resultadoMKm, resultadoDolarToReal, resultadoTangente, resultadoMFeets;
    EditText edMKm, edDolarToReal, edTangente;
    Button btnMKm, btnDolarToReal, btnTangente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMKm = (Button) findViewById(R.id.btnMKm);
        btnDolarToReal = (Button) findViewById(R.id.btnDolarReal);
        btnTangente = (Button) findViewById(R.id.btnTangente);

        edMKm = (EditText) findViewById(R.id.edMKm);
        edDolarToReal = (EditText) findViewById(R.id.edDolarReal);
        edTangente = (EditText) findViewById(R.id.edTangente);

        resultadoMKm = (TextView) findViewById(R.id.resultadoMKm);
        resultadoDolarToReal = (TextView) findViewById(R.id.resultadoDolarReal);
        resultadoTangente = (TextView) findViewById(R.id.resultadoTangente);
        resultadoMFeets = (TextView) findViewById(R.id.resultadoMFeets);


        btnMKm.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                double valor = Double.parseDouble(edMKm.getText().toString());
                double result = CalculoConversoes.milesToKm(valor);
                double resultFeet = CalculoConversoes.milesToFeets(valor);

                resultadoMKm.setText("KM: " + String.valueOf(result));
                resultadoMFeets.setText("Pés: " + String.valueOf(resultFeet));
            }
        });

        btnDolarToReal.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View x) {
                double valor2 = Double.parseDouble(edDolarToReal.getText().toString());
                double result2 = CalculoConversoes.dolarToReal(valor2);

                resultadoDolarToReal.setText("R$ "+String.valueOf(String.format(Locale.US, "%.2f", result2)));
            }
        });

        btnTangente.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View y) {
                double valor3 = Double.parseDouble(edTangente.getText().toString());
                double result3 = CalculoConversoes.tangenteOfTheAngle(valor3);

                resultadoTangente.setText(String.valueOf(result3));
            }
        });
    }
}
