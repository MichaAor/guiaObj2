package com.company.ejercicio2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Factura {
    private UUID id;
    private float montoT;
    private LocalDateTime fecha;
    private Cliente cliente;
    private itemVenta[] items;

    public Factura(){}
    public Factura(float montoT,LocalDateTime fecha,Cliente cliente){
        this.id = UUID.randomUUID();
        this.montoT = montoT;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getId() {
        return this.id;
    }

    public void setMontoT(float montoT) {
        this.montoT = montoT;
    }
    public float getMontoT() {
        return this.montoT;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente() {
        return this.cliente;
    }


    public float montoF(){
        return this.montoT - (this.montoT*(this.cliente.getPorcDesc()/100));
    }

    @Override
    public String toString(){
        return "Factura:[ID= "+this.id+"|| Monto= "+this.montoT+"|| Fecha= "
                +this.fecha+"|| MontoDesc= "+this.montoF() + this.cliente.toString();
    }


}
