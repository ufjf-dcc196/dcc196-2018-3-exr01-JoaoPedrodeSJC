package a3.a2018.dcc196.exr01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnAddAluno,btnAddServidor,btnAddExterno;
    private TextView txtQuantAluno, txtQuantServidor, txtQuantExterno;
    private static final int CADS_ALUNO = 1, CADS_SERVIDOR = 1, CADS_EXTERNO = 1;
    public static final String PESSOA_NOME = "nome",SERV_SIAPE = "siape",ALUNO_MAT = "matricula",EXT_EMAIL = "email";
    public static int ALUNO_QUANTIDADE = 0, SERVIDOR_QUANTIDADE = 0, EXTERNO_QUANTIDADE = 0;
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
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent, MainActivity.CADS_ALUNO);
            }
        });
        btnAddExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
                startActivityForResult(intent, MainActivity.CADS_EXTERNO);

            }
        });
        btnAddServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
                startActivityForResult(intent, MainActivity.CADS_SERVIDOR);
            }
        });
    }
/*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == MainActivity.CADS_ALUNO && resultCode == Activity.RESULT_OK) {
            txtQuantAluno.setText(ALUNO_QUANTIDADE);
        }
        if(requestCode == MainActivity.CADS_SERVIDOR && resultCode == Activity.RESULT_OK) {
            txtQuantServidor.setText(SERVIDOR_QUANTIDADE);
        }
        if(requestCode == MainActivity.CADS_EXTERNO && resultCode == Activity.RESULT_OK) {
            txtQuantExterno.setText(EXTERNO_QUANTIDADE);
        }
    }*/
}
