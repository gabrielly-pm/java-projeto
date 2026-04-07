/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author 04334011098
 */
public class revista extends publicacao {
    
    private int edicao;
    
    public revista(String titulo, String autor, int edicao) {
        super(titulo, autor);
        this.edicao = edicao;
    }
    
    @Override
    
    public void mostrarinfo(){
       System.out.println("Titulo: " + titulo);
       System.out.println("Autor: " + autor);
       System.out.println("Edicao: "+edicao);
    }
}

    
