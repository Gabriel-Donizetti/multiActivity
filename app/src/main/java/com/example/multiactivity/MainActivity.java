package com.example.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view ){
        EditText _nome = findViewById(R.id.nome);
        EditText _nota1 = findViewById(R.id.nota1);
        EditText _nota2 = findViewById(R.id.nota2);
        EditText _freq = findViewById(R.id.freq);

        String nome = _nome.getText().toString();
        Integer nota1 = Integer.parseInt(_nota1.getText().toString());
        Integer nota2 = Integer.parseInt(_nota2.getText().toString());
        Integer freq = Integer.parseInt(_freq.getText().toString());


        Intent it = new Intent( this, SituacaoFinal.class);
        Bundle params = new Bundle();
        params.putString("nome", nome);
        params.putInt("freq", freq);
        params.putFloat("nota1", nota1);
        params.putFloat("nota2", nota2);
        it.putExtras(params);
        startActivity(it);
    }
}