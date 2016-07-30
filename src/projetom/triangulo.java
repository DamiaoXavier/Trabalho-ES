/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetom;

/**
 *
 * @author damião Xavier && Edilson Bernardo
 * @version 1.0 
 * @since  Release 05 da aplicação
 */
public class triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     
    /** Método para retorno da area do triângulo
     * @param b
     * @param h
     * @return 
     */
    public static int area( int b, int h){
        int area = (b * h)/ 2;
            return area;
    }   
    
    /** Método para retorno da base do triângulo
     * @param a
     * @param h
     * @return 
     */
    public static int base( int a, int h){
        int base = (2*a)/h;
            return base;
    }

    /** Método para retorno da altura do triângulo
     * @param a
     * @param b
     * @return 
     */
     public static int altura( int a, int b){
        int altura = (2*a)/b;
            return altura;
    }
      
}
