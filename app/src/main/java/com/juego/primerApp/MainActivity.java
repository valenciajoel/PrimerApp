package com.juego.primerApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asigno a las variables sus valores de vista.
        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_resultado);
    }

    //Este metodo realiza la suma.

    private void calcular(View view, Operacion operacion){

        double num1 = Integer.parseInt(et1.getText().toString());
        double num2 = Integer.parseInt(et2.getText().toString());
        double resultado = 0;
        switch (operacion){
            case SUMA:
                resultado = num1 + num2;
                break;
            case RESTA:
                resultado = num1 - num2;
                break;
            case DIVISION:
                resultado = num1 / num2;
                break;
            case MULTIPLICACION:
                resultado = num1 * num2;
                break;
        }

        tv1.setText(String.valueOf(resultado));

    }


    public void suma(View view){
        calcular(view,Operacion.SUMA);
    }
    public void resta(View view){
        calcular(view,Operacion.RESTA);
    }
    public void multiplicacion(View view){
        calcular(view,Operacion.MULTIPLICACION);
    }
    public void division(View view){
        calcular(view,Operacion.DIVISION);
    }
}