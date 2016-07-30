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
 * @since  Release 01 da aplicação
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public class Usuario{
        private String nome;
        private Double idade;
        private Double sexo;
        
        /** Método para retorno do nome do Usuário
        *   @return String - N nome
        */
        public String getNome() {
            return nome;
        }
        
        /** Método para retorno da Idade do Usuário
        *   @return String - Nr idade
        */
        public Double getIdade() {
            return idade;
        }
        
        /** Método para retorno do sexo do Usuário
        *   @return String - N sexo
        */
        public Double getSexo() {
            return sexo;
        } 
    }
    
}
