package com.company.ejercicio2;

import java.util.UUID;

public class ItemVenta {
    private UUID id;
    private String nombre;
    private String descripcion;
    private float pUnit;

    public ItemVenta(){}
    public ItemVenta(String nombre, String descripcion, float pUnit){
        this.id=UUID.randomUUID();
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.pUnit=pUnit;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setpUnit(float pUnit) {
        this.pUnit = pUnit;
    }
    public float getpUnit() {
        return pUnit;
    }

    public String toString(){
        return "Item:[ID= "+this.id+"|| Nombre= "+this.nombre+"|| Descripcion= "
                +this.descripcion+"|| Precio Unitario= "+this.pUnit+"]";
    }




}
