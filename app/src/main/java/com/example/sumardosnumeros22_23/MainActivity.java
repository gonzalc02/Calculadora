package com.example.sumardosnumeros22_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;
    Button bSumar, bRestar;
    TextView resultado;
    final String ETIQUETA = "CALCULADORA";

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(ETIQUETA, "Entro en postResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ETIQUETA, "Se destruye la aplicación");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ETIQUETA, "Se mete en OnStop");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.editTextNumber1);
        n1.setText("0");
        n2 = findViewById(R.id.editTextNumber2);
        n2.setText("0");
        bSumar = findViewById(R.id.buttonSumar);
        resultado = findViewById(R.id.textViewResultado);
        resultado.setText("0");
        bRestar = findViewById(R.id.buttonRestar);

        /*
        bSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // int num1 = Integer.parseInt(n1.getText().toString());
               // int num2 = Integer.parseInt(n2.getText().toString());
                //int suma = num1 + num2;
                //resultado.setText(String.valueOf(suma));


               resultado.setText(""+(Integer.parseInt(n1.getText().toString()) +Integer.parseInt(n2.getText().toString())));
               Log.i(ETIQUETA, "He sumado dos números.");


            }
        });

        bRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int resta = num1 - num2;
                resultado.setText(String.valueOf(resta));
            }
        });
*/
        bRestar.setOnClickListener(this);
        bSumar.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int resultadoOperacion = 0;
        switch (view.getId()) {
            case R.id.buttonSumar:
                resultadoOperacion = num1 + num2;
                break;
            case R.id.buttonRestar:
                resultadoOperacion = num1 - num2;
                break;

        }
        resultado.setText(""+resultadoOperacion);

    }
}