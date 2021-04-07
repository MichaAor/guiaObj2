package com.company.ejercicio3;

import java.util.UUID;

public class CueBancaria {
    private UUID id;
    private float balance;
    private Cliente cliente;
    private float salDeudor ;
    private int cantOp;
    private String[] operaciones;

    public CueBancaria(){}
    public CueBancaria(float balance, Cliente cliente){
        this.id=UUID.randomUUID();
        this.balance=balance;
        this.cliente=cliente;
    }

    public String[] getOperaciones() {
        return operaciones;
    }

    public void deposito(float deposito){
        this.guardarDP(deposito);
        this.cantOp++;
        this.balance = this.balance + deposito;
    }
    public void extraccion(float sustraccion){
        if(sustraccion>this.balance){
            if(sustraccion-this.balance > 2000f) {
                System.out.println("El valor a sustraer es mayor al saldo deudor de la cuenta,no se cubre lo pedido,operacion cancelada");
            }else{
                this.salDeudor = -1 * (sustraccion - this.balance);
                this.balance = 0;
                this.guardarEX(sustraccion);
            }
        }else{
            this.balance = this.balance - sustraccion;
            this.guardarEX(sustraccion);
            }
    }

    public void guardarDP(float monto){
        this.operaciones[this.cantOp] = "El cliente "+ this.cliente.getNombre() +"Deposito" +monto;
        this.cantOp++;
    }
    public void guardarEX(float monto){
        this.operaciones[this.cantOp] = "El cliente "+ this.cliente.getNombre() +"extrajo" +monto;
        this.cantOp++;
    }

    @Override
    public String toString(){
        return "CUENTA BANCARIA:[ID= "+this.id+"|| BALANCE= "
                +this.balance+"||Saldo Deudor= "+this.salDeudor + "]" + this.cliente.toString();
    }
}
