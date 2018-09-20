package caraoucoroa.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaojogar;
    private String[] opcao = {"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaojogar = (Button) findViewById(R.id.botaoJogarId);
        botaojogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randominco = new Random();
                int numeroAleatorio = randominco.nextInt(2);

                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio]);
                startActivity(intent);

            }
        });

    }
}
