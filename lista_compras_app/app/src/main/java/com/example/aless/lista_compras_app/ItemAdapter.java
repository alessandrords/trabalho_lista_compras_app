package com.example.aless.lista_compras_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    Context context;
    ArrayList<Item> itens;

    public ItemAdapter(Context context, int resource, ArrayList<Item> objects){

        super(context, resource, objects);
        this.context=context;
        this.itens=objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View LinhaView = LayoutInflater.from(context).inflate(R.layout.linha, parent, false);


        TextView quantidade = (TextView)LinhaView.findViewById(R.id.listQuantidade);

        TextView produto = (TextView)LinhaView.findViewById(R.id.listProduto);

        TextView categoria = (TextView)LinhaView.findViewById(R.id.listCategoria);

        TextView perecivel = (TextView)LinhaView.findViewById(R.id.perecivelId);


        quantidade.setText(itens.get(position).getQuantidade());

        produto.setText(itens.get(position).getProduto());

        categoria.setText(itens.get(position).getCategoria());

        //sperecivel.setText(itens.get(position).getPerecivel());

        return LinhaView;

    }


}



















