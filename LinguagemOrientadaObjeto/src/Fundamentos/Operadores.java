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
public class Operadores {
    public static void main (String[] args) {
    String nome = "Edson";
    int x = 3;
    //quando usamos a condição "e" se usa &&
    //quando a condição é "ou" se usa ||
    System.out.println(
            x != 2 && nome == "edson");
    System.out.println(
    x == 2 || nome.toLowerCase().equals("edson"));

    //Operadores de atribuição
    x += 2 ; //mesma coisa que x = x + 2
    System.out.println(x);
    int z = 1;
    System.out.println("z: "+ ++z);
    System.out.println("z: "+ z++);
    
    
    //tipos de operadores de atribuição
    //unário
    x --;
    //binário
    x = z;
    //ternário
    int n = 2;
    n = x == 3 ? 100 : 500;
    System.out.println(x == 3?
    "Sim senhor" : "Negativo");
    
    }
    
    }