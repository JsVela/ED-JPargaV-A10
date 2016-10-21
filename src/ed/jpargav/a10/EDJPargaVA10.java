/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a10;

import java.util.Scanner;

/**
 *
 * @author JESUS PARGA VELA
 */
public class EDJPargaVA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba expresión con parentesis: ");
        String cad = s.nextLine();
        char[] cadena = cad.toCharArray();
        Simbolos p = new Simbolos();
        // verifica si la expresión está equilibrada en sus paréntesis
        if (p.Sintaxis(cadena)) {
            System.out.println("expresión correcta");
        } else {
            System.out.println("expresión incorrecta");
        }
    }
}
