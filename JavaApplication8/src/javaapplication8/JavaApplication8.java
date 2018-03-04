/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import logica.logica;
import resultset.Resultados;

/**
 *
 * @author diego
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo1[]={3,4,5,67,8,7,3,9876,53,98,23,675};
        int arreglo2[]={-3,-7654,-234,-65,-654,-654,-234,-234};
        int arreglo3[]={-3,7654,-234,65,-654,654,-234,-234};
        int areglo4[]={65,43,-765,-343,234,876,-987,231};
        logica l = new logica();
        System.out.println("Ejercicio #1");
        System.out.println(l.buscar(arreglo1, 53));
        System.out.println(l.buscar(arreglo2, 65));
        System.out.println(l.buscar(arreglo3, 59865));
        System.out.println(l.buscar(areglo4, -987));
        
        System.out.println("Ejercicio #2");
        System.out.println(l.fechavalida(2018, 3, 32));
        System.out.println(l.fechavalida(1992, 2, 29));
        System.out.println(l.fechavalida(2015, 6, 03));
        System.out.println(l.fechavalida(2018, 03, -4));
        
        System.out.println("Ejercicio#3");
        System.out.println(l.esPrimo(3));
        System.out.println(l.esPrimo(984637));
        System.out.println(l.esPrimo(71));
        System.out.println(l.esPrimo(3453654));
        System.out.println(l.esPrimo(30));
        
        Resultados r= new Resultados();
        
        System.out.println("Mostrando Tabla");
        System.out.println(r.showTable());
        
        
        System.out.println("Ejercicio #4");
        int arr[] = r.arreglosetResultSetUno();
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("Ejercicio #5");
        int arr1[] = r.getAlumnosquepasaron();
        for(int i =0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        
        
        
    }
    
}
