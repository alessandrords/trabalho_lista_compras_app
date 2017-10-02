package com.example.aless.lista_compras_app;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

/**
 * Created by aless on 29/09/2017.
 */

public class Item {

    private String produto;
    private String quantidade;
    private String categoria;
    //private Boolean perecivel;


    public Item(String produto, String quantidade, String categoria /*, Boolean perecivel */) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.categoria = categoria;
        //this.perecivel = perecivel;
    }


    public String getProduto() {

        return produto;
    }

    public void setProduto(String produto){

        this.produto = produto;
    }

    public String getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(String quantidade) {

        this.quantidade = quantidade;
    }

    public String getCategoria() {

        return categoria;
    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;
    }

    //public Boolean getPerecivel() { return perecivel; }
    //public void setPerecivel(Boolean perecivel) { this.perecivel = perecivel; }

}


