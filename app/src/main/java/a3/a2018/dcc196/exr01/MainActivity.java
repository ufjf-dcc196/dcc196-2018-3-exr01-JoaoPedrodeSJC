package a3.a2018.dcc196.exr01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String PESSOA_NOME = "nome";
    public static final String SERV_SIAPE = "siape";
    public static final String ALUNO_MATRICULA = "matricula";
    public static final String EXT_EMAIL = "email";
    private Button btnAddAluno,btnAddServidor,btnAddExterno;
    private TextView txtQuantAluno, txtQuantServidor, txtQuantExterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddAluno = (Button) findViewById(R.id.btn_addAluno);
        btnAddServidor = (Button) findViewById(R.id.btn_addServ);
        btnAddExterno = (Button) findViewById(R.id.btn_addExt);
        txtQuantAluno = (TextView) findViewById(R.id.quant_aluno);
        txtQuantExterno = (TextView) findViewById(R.id.quant_ext);
        txtQuantServidor = (TextView) findViewById(R.id.quant_serv);

        btnAddAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnAddExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnAddServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
