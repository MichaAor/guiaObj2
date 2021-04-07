package com.company.ejercicio3;

import java.util.UUID;

public class Cuenta {
    private UUID id;
    private float balance;
    private Cliente cliente;

    public Cuenta(){}
    public Cuenta(float balance,Cliente cliente){
        this.balance=balance;
        this.cliente=cliente;
    }

    public float deposito(float deposito){
        return this.balance + deposito;
    }
    public float extraccion(float sustraccion){
        float aux = this.balance;
        if(sustraccion>this.balance){
            System.out.println("El valor a sustraer es mayor al balance de la cuenta,no se cubre lo pedido,operacion cancelada");
        }else{
            aux = this.balance - sustraccion;
        }
        return aux;
    }
}
