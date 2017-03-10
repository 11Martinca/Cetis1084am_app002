package mx.edu.cetis108.cetis1084am_app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btsumar_onClick (View v) {
        EditText textonum1 = (EditText)findViewById(R.id.textonum1);
        EditText textonum2 = (EditText)findViewById(R.id.textonum2);
        TextView textoresultado = (TextView)findViewById(R.id.textoresultado);

        float texto_num1 = Float.parseFloat(textonum1.getText().toString());
        float texto_num2 = Float.parseFloat(textonum2.getText().toString());
        float resultadosuma = texto_num1 + texto_num2;

        textoresultado.setText("resultado: " +resultadosuma);
    }

    public void btresta_onClick (View v) {
        EditText textonum1 = (EditText)findViewById(R.id.textonum1);
        EditText textonum2 = (EditText)findViewById(R.id.textonum2);
        TextView textoresultado = (TextView)findViewById(R.id.textoresultado);

        float texto_num1 = Float.parseFloat(textonum1.getText().toString());
        float texto_num2 = Float.parseFloat(textonum2.getText().toString());
        float resultadoresta = texto_num1 - texto_num2;

        textoresultado.setText("resultado: " +resultadoresta);
    }

    public void btmultiplicar_onClick (View v) {
        EditText textonum1 = (EditText)findViewById(R.id.textonum1);
        EditText textonum2 = (EditText)findViewById(R.id.textonum2);
        TextView textoresultado = (TextView)findViewById(R.id.textoresultado);

        float texto_num1 = Float.parseFloat(textonum1.getText().toString());
        float texto_num2 = Float.parseFloat(textonum2.getText().toString());
        float resultadoresta = texto_num1 * texto_num2;

        textoresultado.setText("resultado: " +resultadoresta);
    }

    public void btdiv_onClick (View w) {
        EditText textonum1 = (EditText)findViewById(R.id.textonum1);
        EditText textonum2 = (EditText)findViewById(R.id.textonum2);
        TextView textoresultado = (TextView)findViewById(R.id.textoresultado);

        float texto_num1 = Float.parseFloat(textonum1.getText().toString());
        float texto_num2 = Float.parseFloat(textonum2.getText().toString());
        float resultadoresta = texto_num1 / texto_num2;

        textoresultado.setText("resultado: " +resultadoresta);
    }
}
