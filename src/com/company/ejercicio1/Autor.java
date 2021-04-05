package com.company.ejercicio1;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(){}
    public Autor(String nombre,String apellido,String email,char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return this.apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    public char getGenero() {
        return this.genero;
    }

    public void mostrar() {
        System.out.println("Nombre: "+this.nombre+
                "\nApellido: "+this.apellido+
                "\nEmail: "+this.email+
                "\nGenero: "+this.genero);
   /* @Override
    public String toString(){
        return "Autor{" +
                "Nombre=" + nombre +
                ", acompañantes=" + apellido +
                ", kilometros=" + email +
                ", usuario=" + genero +
                '}';
    }*/
    }
}
