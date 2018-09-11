package a3.a2018.dcc196.exr01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlunoActivity  extends AppCompatActivity {

    private Button btnAlunoConfirma;
    private EditText txtAlunoNome, txtAlunoMat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);
        btnAlunoConfirma = (Button) findViewById(R.id.btn_aluno_confirma);
        txtAlunoMat = (EditText) findViewById(R.id.txt_aluno_mat);
        txtAlunoNome = (EditText) findViewById(R.id.txt_aluno_nome);


        btnAlunoConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtAlunoMat.getText()!=null && txtAlunoNome.getText() !=null) {
                    Intent resultado = new Intent();
                    setResult(Activity.RESULT_OK, resultado);
                    MainActivity.ALUNO_QUANTIDADE = MainActivity.ALUNO_QUANTIDADE + 1;
                    finish();
                }
            }
        });
    }
}