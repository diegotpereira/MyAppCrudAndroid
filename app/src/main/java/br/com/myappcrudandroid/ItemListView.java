package br.com.myappcrudandroid;

/**
 * Created by Diego Pereira on 08/05/2020.
 */

public class ItemListView {
    private String nome, email, categoria;
    private int iconeRid;

    public ItemListView() {
    }

    public ItemListView(String nome, String email, String categoria, int iconeRid) {
        this.nome = nome;
        this.email = email;
        this.categoria = categoria;
        this.iconeRid = iconeRid;
    }

    public int getIconeRid() {
        return iconeRid;
    }

    public void setIconeRid(int iconeRid) {
        this.iconeRid = iconeRid;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}