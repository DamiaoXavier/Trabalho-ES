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
 * @since  Release 04 da aplicação
 */
public class quadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
   
    /** Método para retorno da BASE do quadrado
     * 
     * @param  h- Altura do quadrado
     * @return 
     */
    public static int base(int h){
        int base;
        base = h;
        return base;
    }
    
    /** Método para retorno da ALTURA do quadrado
     * 
     * @param b - base do quadrado
     * @return 
     */
    public static int altura(int b){
        int altura;
        altura = b;
        return altura;
    } 
    
    /** Método para retorno da Àrea do quadrado
     * 
     * @param h - Altura do quadrado
     * @param b - base do quadrado
     * @return 
     */
    public static int area(int h, int b){
        int area;
        area = h * b;
        return area;
    }
    
}
