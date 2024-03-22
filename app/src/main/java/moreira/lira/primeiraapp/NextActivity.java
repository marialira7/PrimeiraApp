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

        Intent i = getIntent();

        //criando variável
        String texto = i.getStringExtra("texto");

        TextView tvTexto = findViewById(R.id.etTexto);
        tvTexto.setText(texto);
    }
}