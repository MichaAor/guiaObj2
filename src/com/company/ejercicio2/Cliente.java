package com.company.ejercicio2;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String email;
    private float porcDesc;

    public Cliente(){}
    public Cliente(String nombre,String email,float porcDesc){
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.porcDesc = porcDesc;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPorcDesc(float porcDesc) {
        this.porcDesc = porcDesc;
    }
    public float getPorcDesc() {
        return this.porcDesc;
    }

    @Override
    public String toString(){
        return "Cliente:[ID= "+this.id+"|| Nombre= "+this.nombre+"|| Email= "
                +this.email+"|| Descuento= "+this.porcDesc+"]";
    }

}
