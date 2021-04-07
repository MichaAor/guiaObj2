package com.company.ejercicio2;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID id;
    private float montoT;
    private LocalDateTime fecha;
    private Cliente cliente;
    private ItemVenta[] items;

    public Factura(){}
    public Factura(LocalDateTime fecha,Cliente cliente,ItemVenta[] items){
        this.id = UUID.randomUUID();
        this.items = items;
        this.montoT=this.totItems();
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
    public float totItems(){
        float total=0f;
        int i=0;
        for(ItemVenta item : this.items){
            System.out.println("paso"+i++);
            total= total +item.getpUnit();
        }
        return total;
    }

    @Override
    public String toString(){
        return "Factura:[ID= "+this.id+"|| Monto= "+this.montoT+"|| Fecha= "
                +this.fecha+"|| MontoDesc= "+this.montoF() + this.cliente.toString();
    }


}
