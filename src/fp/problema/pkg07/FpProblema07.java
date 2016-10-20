/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema.pkg07;
import java.util.*;

public class FpProblema07 {

    /**
    7.	Realiza un programa que convierta un valor expresado en Km/h a m/s.
    * @param args the command line arguments
     */
    public static void main(String[] args) {
        int KM, conv;
        conv=EntradaDeDatos();
    }
    public static int EntradaDeDatos(){
        int KM;
        double ms;
        ms=0.277778;
        double conversion;
        Scanner entradaDato= new Scanner(System.in);
        System.out.print("Ingresa los kilometros: ");
        KM= entradaDato.nextInt();
        conversion= KM * ms;
        System.out.println("El resultado es: " + conversion + "m/s");
        return KM;
    }
}
