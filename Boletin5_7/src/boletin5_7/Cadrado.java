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
public class Cadrado {
    float lado;

    public Cadrado(float lado) {
        this.lado = lado;
    }
    public float superficie(){
        return (float)lado*lado;
    }
}
