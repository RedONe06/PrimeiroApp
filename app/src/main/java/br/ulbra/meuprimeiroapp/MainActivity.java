package br.ulbra.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titulo;
    EditText nome;
    Button mostre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titulo = findViewById(R.id.txtTitulo1);
        nome = findViewById(R.id.edtNome);
        mostre = findViewById(R.id.btnMostrar);
        mostre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = nome.getText().toString();
                titulo.setText("Boa noite, tchau! Sextou " + n);
            }
        });
    }


}