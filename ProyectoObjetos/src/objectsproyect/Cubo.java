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
public class Cubo extends Cuadrado{
    public String calcularVolumen(){
        int aux=lado*lado*lado;        
        return "El volumen del cubo es: "+aux;
    }
    public String calcularPerimetroCubo(){
        int r=12*lado;
        return "El perimetro del cubo es: "+r;
    }
}
