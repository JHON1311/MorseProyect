/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsproyect;

/**
 *
 * @author Sistem
 */
public class Cuadrado {
    public int lado;
    public void setLado(int lado){
        this.lado=lado;
    }
    public int getLado(){
        return lado;
    }
    public String calcularAreaCuadrado(){
        int r=lado *lado;
        return "El area del cuadrado es: "+r;
        
    }
    public String calcularPerimetroCuadrado(){
        int r=4*lado;
        return "El perimetro del cuadrado es: "+r;
    }
}
