/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morseproyect;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sistem
 */
public class MorseProyect {

    /**
     * @param args the command line arguments
     */
    public static String mensajeN="",mensajeM="", salida="",entry = "";
    public static boolean bandera=true;
    public static String codigos[]=null;
    public static int selection=0;
    public static void main(String[] args) {        
        do{
            System.out.println("Bienvenido al traductor de codigo morse\n 1.- Covertir texto a codigo morse \r\n 2.-Convertir codigo morse a texto \r\n 3.- Salir\r\n Selecciona tu opción");
            Scanner entradaEscaner = new Scanner (System.in);
            entry = entradaEscaner.nextLine ();
            selection=Integer.parseInt(entry);
            switch(selection){
                case 1:
                    System.out.println("Ingresa tu texto");
                    mensajeN=entradaEscaner.nextLine ();
                    for(int i=0;i<mensajeN.length();i++){
                        mensajeM+=traductorTM(mensajeN.charAt(i));
                    }
                    System.out.println(mensajeM);
                break;
                case 2:
                    System.out.println("Ingresa tu codigo morse");
                    mensajeM=entradaEscaner.nextLine ();
                    codigos=mensajeM.split(" ");
                    mensajeN="";                    
                    for (int i = 0; i < codigos.length; i++) {
                        if(codigos[i].equals("") && bandera){
                            i++;
                        }
                        mensajeN+=traductorMT(codigos[i]);
                    }
                    System.out.println(mensajeN);
                break;
                case 3:
                    System.out.println("Fin del programa");
                default:
                    System.out.println("Ingresa una opción valida");
                    break;
            }
        }while(selection!=3);
    }
    public static String traductorTM(char character){        
        switch(character){
            case 'A':
                salida=".-";
            break;
            case 'B':
                salida="-...";
            break;
            case 'C':
                salida="-.-.";
            break;
            case 'D':
                salida="-..";
            break;
            case 'E':
                salida=".";
            break;
            case 'F':
                salida="..-.";
            break;
            case 'G':
                salida="--.";
            break;
            case 'H':
                salida="....";
            break;
            case 'I':
                salida="..";
            break;
            case 'J':
                salida=".---";
            break;
            case 'K':
                salida="-.-";
            break;
            case 'L':
                salida=".-..";
            break;
            case 'M':
                salida="--";
            break;
            case 'N':
                salida="-.";
            break;
            case 'O':
                salida="---";
            break;
            case 'P':
                salida=".--.";
            break;                
            case 'Q':
                salida="--.-";
            break;
            case 'R':
                salida=".-.";
            break;
            case 'S':
                salida="...";
            break;
            case 'T':
                salida="-";
            break;
            case 'U':
                salida="..-";
            break;
            case 'V':
                salida="...-";
            break;
            case 'W':
                salida=".--";
            break;
            case 'X':
                salida="-..-";
            break;
            case 'Y':
                salida="-.--";
            break;
            case 'Z':
                salida="--..";
            break;
            case '1':
                salida=".----";
            break;
            case '2':
                salida="..---";
            break;
            case '3':
                salida="...--";
            break;
            case '4':
                salida="....-";
            break;
            case '5':
                salida=".....";
            break;
            case '6':
                salida="-....";
            break;
            case '7':
                salida="--...";
            break;
            case '8':
                salida="---..";
            break;
            case '9':
                salida="----.";
            break;
            case '0':
                salida="-----";
            break;
            case ' ':
                salida=" ";
            break;
            default:
                salida="";
                break;
        }
        return salida+" ";
    }
    public static String traductorMT(String chain){
        switch(chain){
            case ".-":
                salida="A";
            break;
            case "-...":
                salida="B";
            break;
            case "-.-.":
                salida="C";
            break;
            case "-..":
                salida="D";
            break;
            case ".":
                salida="E";
            break;
            case "..-.":
                salida="F";
            break;
            case "--.":
                salida="G";
            break;
            case "....":
                salida="H";
            break;
            case "..":
                salida="I";
            break;
            case ".---":
                salida="J";
            break;
            case "-.-":
                salida="K";
            break;
            case ".-..":
                salida="L";
            break;
            case "--":
                salida="M";
            break;
            case "-.":
                salida="N";
            break;
            case "---":
                salida="O";
            break;
            case ".--.":
                salida="P";
            break;                
            case "--.-":
                salida="Q";
            break;
            case ".-.":
                salida="R";
            break;
            case "...":
                salida="S";
            break;
            case "-":
                salida="T";
            break;
            case "..-":
                salida="U";
            break;
            case "...-":
                salida="V";
            break;
            case ".--":
                salida="W";
            break;
            case "-..-":
                salida="X";
            break;
            case "-.--":
                salida="Y";
            break;
            case "--..":
                salida="Z";
            break;
            case ".----":
                salida="1";
            break;
            case "..---":
                salida="2";
            break;
            case "...--":
                salida="3";
            break;
            case "....-":
                salida="4";
            break;
            case ".....":
                salida="5";
            break;
            case "-....":
                salida="6";
            break;
            case "--...":
                salida="7";
            break;
            case "---..":
                salida="8";
            break;
            case "----.":
                salida="9";
            break;
            case "-----":
                salida="0";
            break;
            case "":
                salida=" ";
            break;
            default:
                salida="";
                break;
        }
        return salida;
    }
}
