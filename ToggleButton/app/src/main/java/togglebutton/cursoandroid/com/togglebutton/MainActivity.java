package togglebutton.cursoandroid.com.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton botaoToggle;
    private TextView textoExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoToggle = (ToggleButton) findViewById(R.id.toggleButtonId);
        textoExibir = (TextView) findViewById(R.id.textViewId);

        botaoToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textoExibir.setText(" ");
                if(isChecked){
                    textoExibir.setText("Ligado");
                }
            }
        });

    }
}
