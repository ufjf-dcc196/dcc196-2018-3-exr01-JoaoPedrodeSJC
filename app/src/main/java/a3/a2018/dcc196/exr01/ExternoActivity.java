package a3.a2018.dcc196.exr01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExternoActivity  extends AppCompatActivity {

    private Button btnExternoConfirma;
    private EditText txtExternoNome, txtExternoEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);
        btnExternoConfirma = (Button) findViewById(R.id.btn_ext_confirma);
        txtExternoEmail = (EditText) findViewById(R.id.txt_ext_email);
        txtExternoNome = (EditText) findViewById(R.id.txt_ext_nome);


        btnExternoConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtExternoNome.getText().toString().isEmpty() && !txtExternoNome.getText().toString().isEmpty()) {
                    Intent resultado = new Intent();
                    resultado.putExtra(MainActivity.EXT_EMAIL, txtExternoEmail.getText().toString());
                    setResult(Activity.RESULT_OK, resultado);
                    MainActivity.EXTERNO_QUANTIDADE = MainActivity.EXTERNO_QUANTIDADE + 1;
                    finish();
                }
            }
        });
    }
}