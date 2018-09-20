package atmempresaconsultoria.cursoandroid.com.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView botaoEmpresa;
    private ImageView botaoServicos;
    private ImageView botaoClientes;
    private ImageView botaoContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoEmpresa = (ImageView) findViewById(R.id.empresaId);
        botaoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        botaoServicos = (ImageView) findViewById(R.id.servicosId);
        botaoServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }
        });

        botaoClientes = (ImageView) findViewById(R.id.clientesId);
        botaoClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        botaoContato = (ImageView) findViewById(R.id.contatoId);
        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });

    }
}
