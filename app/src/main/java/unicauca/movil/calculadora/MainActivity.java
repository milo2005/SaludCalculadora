package unicauca.movil.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button btnSum, btnRes, btnDiv, btnMul;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btnSum = (Button) findViewById(R.id.sum);
        btnMul = (Button) findViewById(R.id.mul);
        btnDiv = (Button) findViewById(R.id.div);
        btnRes = (Button) findViewById(R.id.res);
        resultado = (TextView) findViewById(R.id.result);

        btnSum.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnRes.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String n1 = num1.getText().toString();
        String n2 =  num2.getText().toString();

        int ni1 = Integer.parseInt(n1);
        int ni2 = Integer.parseInt(n2);
        int r = 0;

        switch(view.getId()){
            case R.id.sum:
                r = ni1 + ni2;
                break;
            case R.id.res:
                r = ni1 - ni2;
                break;
            case R.id.div:
                r = ni1 / ni2;
                break;
            case R.id.mul:
                r = ni1 * ni2;
                break;
        }

        resultado.setText("" + r);
    }
}
