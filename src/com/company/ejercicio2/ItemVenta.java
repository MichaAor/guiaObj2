package com.company.ejercicio2;

import java.util.UUID;

public class ItemVenta {
    private UUID id;
    private String nombre;
    private String descripcion;
    private float pUnit;

    public itemVenta(){}
    public itemVenta(String nombre,String descripcion,float pUnit){
        this.id=UUID.randomUUID();
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.pUnit=pUnit;

    }
}
