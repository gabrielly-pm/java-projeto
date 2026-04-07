/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author 04334011098
 */
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantas publicacoes deseja cadastrar? ");
        int qtd = entrada.nextInt();
        entrada.nextLine();
        
        publicacao[] publicacoes = new publicacao[qtd];
        
        for (int i = 0; i < qtd; i++) {
            System.out.println("Publicacao "+ (i + 1));
             System.out.print("Digite 1 para Livro ou 2 para Revista: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Titulo: ");
            String titulo = entrada.nextLine();

            System.out.print("Autor: ");
            String autor = entrada.nextLine();

            if (opcao == 1) {
                System.out.print("Numero de paginas: ");
                int paginas = entrada.nextInt();
                publicacoes[i] = new livro(titulo, autor, paginas);
            } else {
                System.out.print("Número da edicao: ");
                int edicao = entrada.nextInt();
                publicacoes[i] = new revista(titulo, autor, edicao);
            }
        }

        System.out.println("--- Publicacoes cadastradas ---");
        for (int i = 0; i < qtd; i++) {
            publicacoes[i].mostrarinfo();
            System.out.println();
        }

        entrada.close();
    }
}
       
    
