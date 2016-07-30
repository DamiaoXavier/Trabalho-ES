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
 * @since  Release 02 da aplicação
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
    */
    
    public class Conta {
	
	private Double saldo;
        
        /**
         * 
         * @param saldo 
         */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

        /**
         * 
         * @return 
         */
	public Double getSaldo() {
		return saldo;
	}
	
        /**
         * 
         * @param valor 
         */
	public void depositar(Double valor){
		saldo += valor;
	}
	
        /* Imprimir o resultado*/
	public void verificaSaldo(){
		System.out.println("Valor do Saldo: "+getSaldo());
	}
    }   
}
