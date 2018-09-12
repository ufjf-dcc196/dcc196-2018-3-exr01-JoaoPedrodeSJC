package a3.a2018.dcc196.exr01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ServidorActivity extends AppCompatActivity {

    private Button btnServidorConfirma;
    private EditText txtServidorNome, txtServidorSiape;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);
        btnServidorConfirma = (Button) findViewById(R.id.btn_serv_confirma);
        txtServidorSiape = (EditText) findViewById(R.id.txt_serv_siape);
        txtServidorNome = (EditText) findViewById(R.id.txt_serv_nome);


        btnServidorConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtServidorNome.getText().toString().isEmpty() && !txtServidorSiape.getText().toString().isEmpty()) {
                    Intent resultado = new Intent();
                    setResult(Activity.RESULT_OK, resultado);
                    MainActivity.SERVIDOR_QUANTIDADE = MainActivity.SERVIDOR_QUANTIDADE + 1;
                    finish();
                }
            }
        });
    }
}