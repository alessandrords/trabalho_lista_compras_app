package com.example.aless.lista_compras_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.security.AccessController.getContext;

public class MainActivity extends Activity {

    private Button btCriar;
    private EditText txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtNome = (EditText) findViewById(R.id.txtNomeListaId);

        btCriar = (Button) findViewById(R.id.btCriarId);

        btCriar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String nomeLista = txtNome.getText().toString();

                Intent intent = new Intent(MainActivity.this, ListaActivity.class);
                intent.putExtra("nome", nomeLista);
                startActivity(intent);

            }

        });


    }
}
