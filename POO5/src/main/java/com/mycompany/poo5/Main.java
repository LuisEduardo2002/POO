/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo5;

/**
 *
 * @author mario
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("#########getters y setters########");
         Circulo cir =new Circulo();
         System.out.println(cir);
        cir.setRadio(5);
        System.out.println(cir);
        System.out.println("Radio de cir="+cir.getRadio());
        cir.setRadio((float)7.2);
        cir.setRadio(8.9f);
        cir.setRadio((float)7.66);
        
        float var=5;
        cir.setRadio(var);
        
        cir.setRadio(-7);
        System.out.println(cir);
        System.out.println("#######composicion######");
        
        Persona persona1 = new Persona();
        persona1.setNombre("Antonio");
        persona1.setApellido("Lopez");
        Fecha fNac=new Fecha(14,10,2021);
        persona1.setfNacimiento(fNac);
        System.out.print(persona1);
        
        System.out.println("#######composicion2######");
        Fecha fNac2=new Fecha(25,10,1999);
        Persona persona2 = new Persona("Ricardo","Lopez",fNac2);
        System.out.print(persona2);
    }
   
}
