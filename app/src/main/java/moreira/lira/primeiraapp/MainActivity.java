package moreira.lira.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //le o arquivo de layout e constri a interface
        setContentView(R.layout.activity_main);

        // obtem o botao enviar
        Button btnEnviar=findViewById(R.id.btnEnviar);

        //defini a acao do click no botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {

            // o metodo e chamado quando ha um click no botao
            @Override
            public void onClick(View v) {
                //obter o campo de texto
                EditText etDigiteAqui=findViewById(R.id.etDigiteAqui);

                //obtem o texto que foi digitado na caixa de texto pelo usuario
                String textoDigitado = etDigiteAqui.getText().toString();

                //cria uma intençao para navegar para proxima tela
                Intent i = new Intent(MainActivity.this,NextActivity.class);

                //coloca o texto dentro da inteçao
                i.putExtra("texto", textoDigitado);

                //executa a intençao e vai para proxima tela
                startActivity(i);

            }
        });
    }
}