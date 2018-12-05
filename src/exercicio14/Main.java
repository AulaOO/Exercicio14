/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario f = new Funcionario();
        setorPessoal p = new setorPessoal();
        System.out.println("Escolha uma opçao abaixo:");
        System.out.println("1 - Adicionar funcionário");
        System.out.println("2 - Imprimir folha de pagamento");
        System.out.println("3 - Imprimir valor total da folha de pagamento");
        System.out.println("4 - Funcionário que recebe o maior valor");
        System.out.println("5 - Imprimir funcionários do departamento");
        System.out.println("6 - Todas as pessoas que exercem tal funçao");
        int escolha = ler.nextInt();
        switch(escolha){
            case 1:
                
                break;
            case 2:
                
                break;
        }
    }
    
}
