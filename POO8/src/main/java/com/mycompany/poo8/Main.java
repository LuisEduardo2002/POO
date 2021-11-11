/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo8;

/**
 *
 * @author mario
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("######## Objectos se comportan con sus superficies ######");
PoligonoC poligonoC=new PoligonoC();
Object objecto = poligonoC;
        System.out.println(poligonoC);
        System.out.println(objecto);
        poligonoC=(PoligonoC) objecto;
        System.out.println(poligonoC);
    
        float flotante;
        double doble= 1.6666666666666666666;
        flotante =(float)doble;
        
    poligonoC = new TrianguloC();
        System.out.println(poligonoC);
        poligonoC = new CuadrilateroC();
        
        System.out.println(poligonoC.toString());
        PoligonoC poli = new CuadrilateroC();
        System.out.println(poli.toString());
        //poli.setBase(5.5f);// el metodo no esta definido el poligonoC por lo tanto
                           //no puede sobreescribirlo
    }
}