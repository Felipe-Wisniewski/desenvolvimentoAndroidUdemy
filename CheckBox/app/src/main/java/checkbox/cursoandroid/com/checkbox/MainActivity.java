package checkbox.cursoandroid.com.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

    private CheckBox checkBoxPeixe;
    private CheckBox checkBoxCao;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;
    private CheckBox checkBoxHamster;

    private Button botaoMostrar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxPeixe = (CheckBox) findViewById(R.id.checkBoxPeixeId);
        checkBoxCao = (CheckBox) findViewById(R.id.checkBoxCaoId);
        checkBoxGato = (CheckBox) findViewById(R.id.checkBoxGatoId);
        checkBoxPapagaio = (CheckBox) findViewById(R.id.checkBoxPapagaioId);
        checkBoxHamster = (CheckBox) findViewById(R.id.checkBoxHamsterId);

        botaoMostrar = (Button) findViewById(R.id.botaoMostrarId);
        textoExibicao = (TextView) findViewById(R.id.textViewMostrarId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoItensSelecionados = "";

                textoItensSelecionados += "Item: " + checkBoxPeixe.getText() + ": " + checkBoxPeixe.isChecked() + "\n";
                textoItensSelecionados += "Item: " + checkBoxCao.getText() + ": " + checkBoxCao.isChecked() + "\n";
                textoItensSelecionados += "Item: " + checkBoxGato.getText() + ": " + checkBoxGato.isChecked() + "\n";
                textoItensSelecionados += "Item: " + checkBoxPapagaio.getText() + ": " + checkBoxPapagaio.isChecked() + "\n";
                textoItensSelecionados += "Item: " + checkBoxHamster.getText() + ": " + checkBoxHamster.isChecked() + "\n";

                textoExibicao.setText(textoItensSelecionados);

            }
        });

    }
}
