/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author 04334011098
 */
public class publicacao {
   protected String titulo;
   protected  String autor;
    
   public publicacao (String titulo, String autor) {
       this.titulo = titulo;
               this.autor = autor;
   }
    
   public void mostrarinfo() {
       System.out.println("Titulo: " +titulo);
       System.out.println("Autor: " +autor);
       
   }
}
