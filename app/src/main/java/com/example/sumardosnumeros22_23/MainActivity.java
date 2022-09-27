package com.example.sumardosnumeros22_23;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;
    Button bSumar, bRestar, bMultiplicar, bDividir;
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

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*             VARIABLES            */
        n1 = findViewById(R.id.editTextNumber1);
        n1.setText("0");

        n2 = findViewById(R.id.editTextNumber2);
        n2.setText("0");

        bSumar = findViewById(R.id.buttonSumar);
        bRestar = findViewById(R.id.buttonRestar);
        bMultiplicar = findViewById(R.id.buttonMultiplicar);
        bDividir = findViewById(R.id.buttonDividir);

        resultado = findViewById(R.id.textViewResultado);
        resultado.setText("0");


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
        bMultiplicar.setOnClickListener(this);
        bDividir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        float num1 = Integer.parseInt(n1.getText().toString());
        float num2 = Integer.parseInt(n2.getText().toString());
        float resultadoOperacion = 0;
        boolean bien = true;

        switch (view.getId()) {
            case R.id.buttonSumar:
                resultadoOperacion = num1 + num2;
                break;
            case R.id.buttonRestar:
                resultadoOperacion = num1 - num2;
                break;
            case R.id.buttonMultiplicar:
                resultadoOperacion = num1 * num2;
                break;
            case R.id.buttonDividir:
                try{
                    resultadoOperacion = num1 / num2;
                }catch (ArithmeticException e){}
        }
        if(bien){
            resultado.setText(""+resultadoOperacion);
        }


    }
}