package com.company.ejercicio3;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private char genero;

    public Cliente(){}
    public Cliente(String nombre,char genero){
        this.id=UUID.randomUUID();
        this.nombre=nombre;
        this.genero=genero;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    public char getGenero() {
        return genero;
    }

    @Override
    public String toString(){
        return "Cliente:[ID= "+this.id+"|| Nombre= "+this.nombre+"|| Genero= "
                +this.genero+"]";
    }
}
