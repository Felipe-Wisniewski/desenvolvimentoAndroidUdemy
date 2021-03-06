package dialog.cursoandroid.com.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //criar alert dialog
                dialog = new AlertDialog.Builder(MainActivity.this);
                //configurar o titulo
                dialog.setTitle("Titulo da dialog");
                //configurar a mensagem
                dialog.setMessage("Mensagem da dialog");
                //nao cancela dialog clicando fora
                dialog.setCancelable(false);

                dialog.setIcon(android.R.drawable.alert_light_frame);
                //configurar botao negativo
                dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Pressionado o botão não", Toast.LENGTH_SHORT).show();
                    }
                });
                //configurar botao positivo
                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Pressionado o botão sim", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.create();
                dialog.show();

            }
        });

    }
}
