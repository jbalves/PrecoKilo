package barros.jeferson.precokilo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calcular(View view) {
        EditText precoKilo = (EditText) findViewById(R.id.edPrecoKilo);
        EditText edPeso = (EditText) findViewById(R.id.edPeso);
        TextView txtExibirValor = (TextView) findViewById(R.id.txtExibirValor);

        float valorPagar = 0;
        float valorKilo = Float.valueOf(precoKilo.getText().toString());
        float valorPeso = Float.valueOf(edPeso.getText().toString());
        valorPagar = (valorKilo * valorPeso)/1000;
        Log.d("Debug", valorPagar+"");
    }
}
