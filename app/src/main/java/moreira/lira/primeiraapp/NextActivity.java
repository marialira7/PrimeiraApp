package moreira.lira.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //exibir elementos do usuário na tela
        setContentView(R.layout.activity_next);

        //obtem a intençao q criou a tela
        Intent i = getIntent();

        //criando variável derivado da tela anterior
        String texto = i.getStringExtra("texto");

        //obtem o textview
        TextView tvTexto = findViewById(R.id.etTexto);

        //seta o texto dentro do textview
        tvTexto.setText(texto);
    }
}