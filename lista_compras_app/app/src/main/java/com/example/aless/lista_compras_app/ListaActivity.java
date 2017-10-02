package com.example.aless.lista_compras_app;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaActivity extends Activity {

    TextView nomeLista; // vem da MainActivity
    ListView lista;
    EditText produto;
    EditText quantidade;
    Spinner categoria;
    Button btSalvar;
    //private CheckBox perecivel;

    ArrayList<Item> itens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        // Recebendo dados enviados da MainActivity
        nomeLista = (TextView) findViewById(R.id.nomeListaId);
        Bundle extra = getIntent().getExtras();
        String nomeRecebido = extra.getString("nome");
        nomeLista.setText(nomeRecebido);

        // Incluindo itens no spinner

        categoria = (Spinner) findViewById(R.id.categoriaId);

        String[] categorias = {"Frutas","Produto de Limpeza", "Perfumaria", "Frios", "Doces"};

        ArrayAdapter<String> adapterCategoria = new ArrayAdapter<String>(ListaActivity.this, android.R.layout.simple_list_item_1, categorias);
        adapterCategoria.setDropDownViewResource(android.R.layout.simple_list_item_1);
        categoria.setAdapter(adapterCategoria);


        lista = (ListView) findViewById(R.id.listViewId);
        final ArrayAdapter adapter = new ItemAdapter(ListaActivity.this, R.layout.linha, itens);
        lista.setAdapter(adapter);

        btSalvar = (Button) findViewById(R.id.btSalvarId);
        produto = (EditText) findViewById(R.id.produtoId);
        quantidade = (EditText) findViewById(R.id.quantidadeId);

        //perecivel = (CheckBox) findViewById(R.id.perecivelId);



        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Adicionando um elemento na lista
                Item item = new Item(produto.getText().toString(), quantidade.getText().toString(), categoria.getSelectedItem().toString());
                itens.add(item);
                lista.setAdapter(adapter);
            }
        });


    }
}

































