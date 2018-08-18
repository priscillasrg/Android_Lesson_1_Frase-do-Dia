package frasesdodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String [] frases = {
            "Nunca desista dos seus sonhos",
            "Para ter sucesso é preciso acreditar que podemos",
            "Acreditar é a força que nos permite subir os maiores degraus na escada da vida",
            "Coragem é a resistência ao medo e não a ausência dele",
            "A determinação de hoje é o sucesso de amanhã"
    };  //array


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        //textoNovaFrase.setText(frases [1]); para chamar o array

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases [numeroAleatorio]);
            }
        });
    }
}
