package com.company.ejercicio1;

import com.company.ejercicio1.Autor;

public class Libro {
    private String titulo;
    private float precio;
    private int stock;
    private Autor[] autores;

    public Libro(){}
    public Libro(String titulo,float precio,int stock,Autor[] autores){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public float getPrecio() {
        return this.precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return this.stock;
    }

    public void setAutor(Autor autor) {
        this.autores = autores;
    }
    public Autor[] getAutor() {
        return this.autores;
    }

    public void mostrar(){
        System.out.println("Titulo: "+this.titulo+
                "\nPrecio: "+this.precio+
                "\nStock: "+this.stock+
                "\n");
        for(Autor autor : autores){
            autor.mostrar();
        }
    }

    public String imprimirMsj() {
        StringBuilder nombres = new StringBuilder();
        for (Autor autor : autores) {
            if (autor != null) {
                nombres.append(autor.getNombre());
                nombres.append(" ");
                nombres.append(autor.getApellido());
                nombres.append(" ,");
            }
        }

        return "El libro, " + this.titulo + " de " + nombres + " se vende a " + this.precio + " pesos.";
    }
}
