/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsproyect;

import java.util.Scanner;

/**
 *
 * @author Sistem
 */
public class ObjectsProyect {
     public static int selection=0, lado=0;
     public static String entry="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cubo cub=new Cubo();
            do{
                System.out.println("Bienvenido al menu principal\n Ingresa la medida de un lado");

                Scanner entradaEscaner = new Scanner (System.in);
                entry = entradaEscaner.nextLine ();
                cub.setLado(Integer.parseInt(entry));
                do {  
                    System.out.println("Esta es la medida de un lado: "+cub.getLado());
                    System.out.println("opciones de cálculo disponibles \n 1.- Calcular el area de un cuadrado \r\n 2.-Calcular el perimetro de un cuadrado \r\n 3.- Calcular el Volumen de un cubo\r\n 4.- Calcular el primetro de un cubo \n 5.-Cancelar \n 6.-Salir \n Selecciona tu opción");
                    entry = entradaEscaner.nextLine ();
                    selection=Integer.parseInt(entry);
                    switch(selection){
                        case 1:
                            System.out.println(cub.calcularAreaCuadrado());
                            break;
                        case 2:
                            System.out.println(cub.calcularPerimetroCuadrado());
                            break;
                        case 3:
                            System.out.println(cub.calcularVolumen());
                            break;
                        case 4:
                            System.out.println(cub.calcularPerimetroCubo());
                            break;
                    }
                } while (selection!=5 && selection !=6);
            }while(selection!=6);
    }
    
}
