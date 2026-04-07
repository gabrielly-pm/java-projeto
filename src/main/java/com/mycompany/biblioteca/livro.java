/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author 04334011098
 */
public class livro extends publicacao {
    
    protected int pagina;
    
    public livro(String titulo, String autor, int pagina) {
        super(titulo, autor);
        this.pagina = pagina;
    }
    
    @Override
    
    public void mostrarinfo(){
       System.out.println("Titulo: " + titulo);
       System.out.println("Autor: " + autor);
       System.out.println("Paginas: "+pagina);
    }
}
