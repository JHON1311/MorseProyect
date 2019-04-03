/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanosproyect;

import java.lang.reflect.Array;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sistem
 */
public class RomanosProyect {

    /**
     * @param args the command line arguments
     */
    public static int n,d,r,a;
    public static int [] valoresN={1000,0,100,0,10,0,1};
    public static char []valoresR={'M','D','C','L','X','V','I'};
     public static int []valoresF={0,0,0,0,0,0,0};
    public static int pos;
    public static void main(String[] args) {
        do{
            System.out.println("Ingresa un numero entero entre el 1-1000");
            Scanner entradaEscaner = new Scanner (System.in);
            n = entradaEscaner.nextInt();            
            if (n>1000) {
                System.out.println("Ingresa un numero valido");
            }
        }while(n>1000);
        for (int i = 0; i < valoresN.length; i++) {
            if(valoresN[i]==0)
                i++;
            d=valoresN[i];
            r=n/d;
            a=d*r;
            valoresF[i]=r;
            n=n-a; 
        }
       String salida="";         
        for (int i = 0; i <  valoresF.length; i++) {
            int aux=valoresF[i];
            if(aux>=4){
                salida+=formatea(aux,i);
            }else{
                salida+=""+cambia(valoresF[i],i);
            }
        }
        System.out.println(salida);
        
    }
    public static String formatea(int valor,int pos){
        String salida="";
        if (valor>=5) {
            if (valor==5) {
                salida+=valoresR[pos-1];
            }else{
                if(valor==9){
                    salida+=""+valoresR[pos]+valoresR[pos-2];
                }else{
                    int aux=valor-5;
                    salida+=valoresR[pos-1];
                    for (int i = 0; i < aux; i++) {
                            salida+=valoresR[pos];                   
                    }
                }
            }
        } else {
            if(valor==4){
                String d=""+valoresR[pos]+valoresR[pos-1];
                System.out.println("Valor pos="+d);
                salida=d;
            }
        }
        return salida;
    }
    public static String cambia(int cant, int pos){
        String salida="";
        for (int i = 0; i < cant; i++) {
            salida+=valoresR[pos];
        }
        return salida;
    }
    public static String r1(String cadena){
        String salida="";
        char car1=' ',car2=' ';
        int cn=0;
        for(int i=0;i<cadena.length();i++){
            car1=car2;
            car2=cadena.charAt(i);
            if(car1==cadena.charAt(i)){
                cn++;
            }else{
                System.out.println(cn);
                if(cn>2){
                    pos=0;
                    for (int j = 0; j < valoresR.length; j++) {
                        if(valoresR[j]==car2){
                            pos=j;
                            break;
                        }
                    }
                    salida+=valoresR[pos-1]+valoresR[pos];
                }else{
                    for (int j = 0; j < cn; j++) {
                        salida+=car1;
                    }
                    salida+=car1;
                    cn=0;
                }
            }
        }
        salida+=cadena.charAt(cadena.length()-1);
        return salida;
    }
    
}
