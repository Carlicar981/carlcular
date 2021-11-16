package com.example.carlcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText valor1,valor2;
    RadioButton sumar,restar;
    Button calcular;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1=(EditText) findViewById(R.id.valor1);
        valor2=(EditText) findViewById(R.id.valor2);
        sumar=(RadioButton) findViewById(R.id.sumar);
        restar=(RadioButton) findViewById(R.id.restar);
        calcular=(Button) findViewById(R.id.button);
        resultado=(TextView) findViewById(R.id.textView);
    }
    public void calcular (View view){
        if (sumar.isChecked()){
            int suma=Integer.parseInt(valor1.getText().toString())+Integer.parseInt(valor2.getText().toString());
            resultado.setText(String.valueOf(suma));
        }else if (restar.isChecked()){
            int resta=Integer.parseInt(valor1.getText().toString())-Integer.parseInt(valor2.getText().toString());
            resultado.setText(String.valueOf(resta));
        }
    }
}