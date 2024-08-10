/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciodefixacaoprint;

import java.util.Locale;

/**
 *
 * @author vanio.oliveira
 */
public class ExercicioDeFixacaoPrint {

    public static void main(String[] args) {
        String product1 = "commputer";
        String product2= "Office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'f';
        
        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 52.234567;
        
        System.out.printf("Products: %n"
                + "%s, wich price is $ %.2f %n"
                + "%s, wich price is $ %.2f%n%n"
                + "Record: %d years old, code %d and gender %s%n%n"
                + "measure witch eight decimal places %.8f%n"
                + "rounded (three decimal places): %.3f %n" ,product1, price1, product2, price2, age, code, gender, measure, measure );
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
        
        
        
    }
}
