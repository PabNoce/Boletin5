/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7;

/**
 *
 * @author pnocedalopez
 */
public class Triangulo {
    float base, altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public float superficie(){
        return base*altura/2;
    }
}
