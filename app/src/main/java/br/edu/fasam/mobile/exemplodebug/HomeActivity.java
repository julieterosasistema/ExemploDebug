package br.edu.fasam.mobile.exemplodebug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void exibirTela(View view) {

        int opcao = view.getId();
        Intent intent;

        //Verifica qual botao foi adionado
        switch (opcao){

            //Exibir tela MainActivity
            case R.id.btnMain:

                intent = new Intent(this,MainActivity.class);
                startActivity(intent);

                break;

            //Exibir tela ListaAcitivy
            case R.id.btnLista:
                intent = new Intent(this,ListaActivity.class);
                startActivity(intent);
                break;

            case R.id.aluno:
                intent = new Intent(this,ListaActivity.class);
                startActivity(intent);
                break;

            case R.id.professor:
                intent = new Intent(this,ListaActivity.class);
                startActivity(intent);
                break;


            default:
                Toast.makeText(getApplicationContext(),
                        "Opcao Inválida",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }
}
