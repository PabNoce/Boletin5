/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

/**
 *
 * @author pnocedalopez
 */
public class Persoa {
    String nome;
    int peso;
                         

    public Persoa() {
    }

    public Persoa(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "nome=" + nome + " peso=" + peso ;
    }
    
}
