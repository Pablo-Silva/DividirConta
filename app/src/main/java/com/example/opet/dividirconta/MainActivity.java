package com.example.opet.dividirconta;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText valor;
    private EditText pessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor = findViewById(R.id.valorText);
        pessoas = findViewById(R.id.pessoasText);
    }

    public void calcular(View view){
        String conta = valor.getText().toString();
        String quantidade_pessoas = pessoas.getText().toString();
        if (view.getId() == R.id.btnCalcular){

           float conta_number = Float.parseFloat(conta);
           float pessoas_number = Float.parseFloat(quantidade_pessoas);
           float resultado = conta_number / pessoas_number;
           Toast.makeText(this, String.valueOf(resultado), Toast.LENGTH_LONG).show();


        }


    }
}
