package br.edu.fasam.mobile.exemplodebug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlunoActivity extends DebugActivity {

    EditText txtNomeAluno;
    EditText txtNota1;
    EditText txtNota2;
    EditText txtNota3;
    EditText txtaddAluno;

    List<HashMap<String,String>> lista = new ArrayList<>();
    ListView listView;


    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_aluno);
    }

    public void adicionarAluno(View view) {
        //ENTRADA

        //PROCESSAMENTO

        //ADICIONAR ITENS NA LISTA

        //Capturar dados da tela
        //findViewById busca o componente pelo id
        //utilizando a classe R.java

        txtNomeAluno = findViewById(R.id.txtNome);
        txtNota1 = findViewById(R.id.txtNota1);
        txtNota2 = findViewById(R.id.txtNota2);
        txtNota3 = findViewById(R.id.txtNota3);
        //txtaddAluno = findViewById(R.id.txtaddAluno);



//        //Declarar as variáveis para receber os dados

        String nomeAluno;
        double nota1, nota2, nota3;



//        //Extrair conteúdo do componente EditText

        nomeAluno = txtNomeAluno.getText().toString();
        nota1 = Double.parseDouble(txtNota1.getText().toString());
        nota2 = Double.parseDouble(txtNota2.getText().toString());
        nota3 = Double.parseDouble(txtNota3.getText().toString());
        double media = (nota1+nota2+nota3)/3;





//        //Formatar saída para o usuário
        String dados = String.format("Os dados digitados foram %s %.2f %.2f %.2f = %.2f",
                nomeAluno,nota1,nota2,nota3,media);

//        //Adiciona dados num mapa de valores (dicionário)
//        //Mapa como um "array associativo", K = key, v = value
        HashMap<String,String> map = new HashMap<>();
        map.put("nomeAluno",nomeAluno);
        //HashMap<Double,Double> map = new HashMap<>();
        map.put("nota1", String.valueOf(nota1));
        map.put("nota2", String.valueOf(nota2));
        map.put("nota3", String.valueOf(nota3));
        map.put("media", String.valueOf(media));

        lista.add(map);

//        //Mapeamento de dados do List<HashMap<K,V> para
//        //imprimir no layout
        String[] de = {"nomeAluno","nota1","nota2","nota3","media"}; //dados do Map

        //id's do layout item.xml
        int[] para = {R.id.labelNomeAluno,R.id.labelNota1,R.id.labelNota2,R.id.labelNota3,R.id.labelMedia};

//        //Criar o simpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(
                getApplicationContext(),
                lista,
                R.layout.item,
                de,
                para
        );
//
//        //Buscar a listView e imprimir os dados

        listView = findViewById(R.id.listViewAluno);
        listView.setAdapter(adapter);


    }
}
