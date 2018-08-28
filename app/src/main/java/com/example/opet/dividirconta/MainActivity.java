package com.example.opet.dividirconta;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText valor;
    private EditText pessoas;
    private CheckBox acrecimo;
    private TextView editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor = findViewById(R.id.valorText);
        pessoas = findViewById(R.id.pessoasText);
        acrecimo = findViewById(R.id.checkPorcento);
        editText = findViewById(R.id.textView);
    }

    public void calcular(View view){
        String conta = valor.getText().toString();
        String quantidade_pessoas = pessoas.getText().toString();
        if (view.getId() == R.id.btnCalcular){

           float conta_number = Float.parseFloat(conta);
           float pessoas_number = Float.parseFloat(quantidade_pessoas);
           float resultado = conta_number / pessoas_number;

           if (acrecimo.isChecked()){

               float adicionar = (float) (resultado * 0.1);
               resultado = resultado + adicionar;
               Toast.makeText(this, "R$" + String.valueOf(resultado), Toast.LENGTH_LONG).show();
               editText.setText("R$" + String.valueOf(resultado));

           } else {

               Toast.makeText(this, "R$" + String.valueOf(resultado), Toast.LENGTH_LONG).show();
               editText.setText("R$" + String.valueOf(resultado));

           }



        }


    }
}
