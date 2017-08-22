package barros.jeferson.precokilo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.Format;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calcular(View view) {
        EditText precoKilo = (EditText) findViewById(R.id.edPrecoKilo);
        EditText edPeso = (EditText) findViewById(R.id.edPeso);
        EditText edDinheiro = (EditText) findViewById(R.id.edValor);
        TextView txtExibirValor = (TextView) findViewById(R.id.txtExibirValor);
        float valorPagar = 0;

        if(!edPeso.getText().toString().isEmpty()){
            valorPagar = CalcularValor(Float.valueOf(precoKilo.getText().toString()),Float.valueOf(edPeso.getText().toString())*1000);
            txtExibirValor.setText("R$ " + String.valueOf(String.format("%.2f",valorPagar)));
        }

        if(!edDinheiro.getText().toString().isEmpty()){
            valorPagar = CalcularPreco(Float.valueOf(precoKilo.getText().toString()),Float.valueOf(edDinheiro.getText().toString()));
            Log.d("Debug", valorPagar+"");
            txtExibirValor.setText(String.valueOf(String.format("%.3f",valorPagar))+" Kg");
        }
    }

    public float CalcularValor(float valorKilo, float valorPeso){
        return ((valorKilo * valorPeso)/1000);
    }

    public float CalcularPreco( float valorKilo, float valorDinheiro){
        return (((1000*valorDinheiro)/valorKilo))/1000;
    }
}
