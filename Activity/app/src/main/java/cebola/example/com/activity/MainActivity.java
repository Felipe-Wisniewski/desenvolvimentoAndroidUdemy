package cebola.example.com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtTexto;

    Button button;
    Button button2;
    int s1 = R.string.btn_toast;
    int s2 = R.string.btn_toast2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTexto = (EditText) findViewById(R.id.editText);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.button:
                button.setText(s2);
                button2.setText(s1);
                //String texto = edtTexto.getText().toString();
                //Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG).show();
                break;

            case R.id.button2:
                button.setText(s1);
                button2.setText(s2);

                //String texto2 = edtTexto.getText().toString();
                //Toast.makeText(MainActivity.this, texto2, Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
