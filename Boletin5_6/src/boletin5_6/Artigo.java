/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

/**
 *
 * @author pnocedalopez
 */
public class Artigo {
    String nome;
    int vendasAnuais;

    public Artigo() {
    }

    public Artigo(String nome, int vendasAnuais) {
        this.nome = nome;
        this.vendasAnuais = vendasAnuais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVendasAnuais() {
        return vendasAnuais;
    }

    public void setVendasAnuais(int vendasAnuais) {
        this.vendasAnuais = vendasAnuais;
    }
    
    
}
