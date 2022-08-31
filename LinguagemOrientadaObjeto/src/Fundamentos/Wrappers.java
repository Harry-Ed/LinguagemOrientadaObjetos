/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentos;

/**
 *
 * @author aula
 */
public class Wrappers {
    public static void main(String[] args) {
        int x = 10;
        Integer z = 10;
      
             
              //System.out.println(x);
              //System.out.println(z);
              
              String y = "20";
              x = Integer.parseInt(y);
              System.out.println(x);
              y = Integer.toString(x);
              
              
              String nome = "Eduardo Freitas de Medeiros";
              System.out.println("O nome "+ nome.toUpperCase() + nome.length() + "caracteres");
    }
}
