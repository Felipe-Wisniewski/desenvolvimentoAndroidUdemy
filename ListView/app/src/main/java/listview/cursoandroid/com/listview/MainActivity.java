package listview.cursoandroid.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaItens;
    private String[] itens = {"Porto Alegre","Florianópolis","Pelotas","Rio de Janeiro","Ubatuba",
                                "Arraial do Cabo","Ilha Bela","Praia do Rosa","Gramado","Paraty",
                                "São Paulo","Guaruja","Praia do Laranjal","Praia de Copacabana"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaItens.setAdapter(adapter);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codPosicao = position;
                String valorClicado = listaItens.getItemAtPosition(codPosicao).toString();
                Toast.makeText(getApplicationContext(), valorClicado, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
