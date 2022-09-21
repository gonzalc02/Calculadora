package com.example.sumardosnumeros22_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    Button bSumar;
    TextView resultado;


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

        bSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                int suma = num1 + num2;
                resultado.setText(String.valueOf(suma));
*/

               resultado.setText(""+(Integer.parseInt(n1.getText().toString()) +Integer.parseInt(n2.getText().toString())));
            }
        });


    }
}