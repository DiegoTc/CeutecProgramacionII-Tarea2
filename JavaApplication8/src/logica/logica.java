/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Calendar;

/**
 *
 * @author diego
 */
public class logica {

    public logica() {
    }

    /*
    El ejercicio de buscar va a recibir de parametros un arreglo y una llave.
    El objetivo de este ejercicio es buscar la llave en el arreglo y devolver la
    posicion donde se encuentra la llave. Caso contrario que no esta, deberia retornar -1
    Ejemplo
    arreglo [4,5,6,8]
    buscar(arreglo,8)
    Va a retornar 3
    
     */
    public int buscar(int[] arreglo, int llave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == llave) {
                return i;
            }
        }
        return -1;
    }

    /*
    Este ejercio recibira de 3 argumentos de parametros.
    int year, int mes, int dia
    El objetivo del ejercicio es que tiene que retornar true si es una fecha valida y false si no lo es.
    Los año bisiesto se tienen que tomar en cuenta.
    
    Tome en consideracion que la funcion solo funcionara con años del 1-5000
    Si no cumple esos requisitos deberia de retorn false
    
    Estas fechas van a retornar true
    2014,6,4
    2016,2,29
    
    Estas fechas van a retorn false
    2015,2,30
    2015,4,31
     */
    
    /*http://lineadecodigo.com/java/ano-bisiesto-en-java/*/
    public boolean myisOwnLeapyear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean isLeapYear(int year){
         Calendar cal = Calendar.getInstance();
          cal.set(Calendar.YEAR, year);
          if(cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365){
              return true;
          }
          else{
              return false;
          }
    }

    public boolean fechavalida(int year, int mes, int dia) {
        if(year >0 && year <=5000){
            if(mes >0 && mes <=12){
                if(mes == 1 || mes == 3 || mes ==5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    if (dia >= 1 && dia <=31){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    if (dia >= 1 && dia <=30){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if (myisOwnLeapyear(year)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /*
    La siguiente funcion tiene que validar si un numero es primo.
    Retornara True si el numero es primo y false si no lo es
     */
    public boolean esPrimo(int year) {
        for (int i = 2; i < year; i++) {
            if (i % i == 0) {
                return false;
            }
        }
        return true;
    }

}
