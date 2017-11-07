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
public class Circulo {
    float radio;
    final float Pi=(float) 3.14;

    public Circulo(float radio) {
        this.radio = radio;
    }
    public float superficie(){
        return (float)Pi*radio*radio;
    }
    
   
}
