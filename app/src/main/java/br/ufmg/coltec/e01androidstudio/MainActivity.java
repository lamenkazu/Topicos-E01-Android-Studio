package br.ufmg.coltec.e01androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = this.findViewById(R.id.btn_ok);
        Button btnErro = this.findViewById(R.id.btn_erro);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(MainActivity.this, "Aprovado!", Toast.LENGTH_SHORT);
                t.setGravity(Gravity.TOP, 0, 0);
                t.show();
            }
        });
        btnErro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = Toast.makeText(MainActivity.this, "Reprovado!", Toast.LENGTH_LONG);
                t.setGravity(Gravity.TOP, 0, 0);
                t.show();

                Log.w("Entrou!", "Botão OPS clicado.");
            }
        });

        Log.v("Sucesso!", "Activity criada corretamente");
    }
}