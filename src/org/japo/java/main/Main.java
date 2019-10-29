/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés
 */
public class Main {

    /**
     * @param args the command line arguments*
     */
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
      
        char letraDNI;

        try {

            System.out.print("Letra DNI .............: ");

            letraDNI = SCN.nextLine().charAt(0);

            System.out.printf("%s%C%n", "Letra DNI .............: ", letraDNI);

        } catch (Exception e) {

            System.out.println("ERROR: Entrada incorrecta");

        } finally {

         
        }

    }

}
