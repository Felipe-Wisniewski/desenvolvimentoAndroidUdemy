package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valorDigitado;
    private Button botaoDescobrir;
    private TextView mostraIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorDigitado = (EditText) findViewById(R.id.caixaTextoId);
        botaoDescobrir = (Button) findViewById(R.id.botaoIdadeId);
        mostraIdade = (TextView) findViewById(R.id.resultadoId);

        botaoDescobrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idadeDigitada = valorDigitado.getText().toString();

                if(idadeDigitada.isEmpty()){
                    mostraIdade.setText("Digite uma idade!!");
                }else{
                    int numeroDigitado = Integer.parseInt(idadeDigitada);
                    int anosHumanos = numeroDigitado * 7;
                    mostraIdade.setText("A idade em anos humano é: "+ anosHumanos +" anos");
                }

            }
        });
    }
}
