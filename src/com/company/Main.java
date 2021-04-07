package com.company;

import com.company.ejercicio2.Factura;
import com.company.ejercicio2.ItemVenta;
import com.company.ejercicio3.Cliente;
import com.company.ejercicio3.CueBancaria;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        //autor.mostrar();
        Autor autor2 = new Autor("Melene","Spider","mele@gmail.com",'F');
        Autor[] autores = new Autor[2];
        autores[0] = autor;
        autores[1] = autor2;
        Libro ej = new Libro( "Effective Java",450f,150,autores);
            //ej.mostrar();
            ej.setPrecio(500f);
            ej.setStock(ej.getStock()+50);
        System.out.println(ej.imprimirMsj());

    ////EJ2

        Cliente cl1 = new Cliente("Carlos","minguito@gmail.com",15);
        System.out.println(cl1.toString());
        LocalDateTime fecha = LocalDateTime.now();

        //Factura f1 = new Factura(25000f, fecha,cl1);
        //System.out.println(f1.toString());

        ItemVenta pelota = new ItemVenta("Pelota","Redonda,de color azul con marcas negras",3500f);
        ItemVenta barco = new ItemVenta("Barco","Blanco con velas rojas y muñecos",9500f);
        ItemVenta bicicleta = new ItemVenta("Bicicleta","Amarilla con rayas verdes",25000f);
        ItemVenta[] items = new ItemVenta[3];
        items[0] = pelota;
        items[1] = barco;
        items[2] = bicicleta;
        Factura f2 = new Factura(fecha,cl1,items);
        System.out.println(f2.toString());*/

   ///EJ3
        Cliente pablo = new Cliente("Pablo",'M');
        //System.out.println(pablo.toString());
        CueBancaria cueB1 = new CueBancaria(10000f,pablo);
        //cueB1.deposito(2000f);
        //cueB1.extraccion(14000);
        //System.out.println(cueB1.toString());

        Cliente paola = new Cliente("Paola",'F');
        Cliente gustav = new Cliente("Gustav",'M');

        CueBancaria cueB2 = new CueBancaria(50000f,paola);
        CueBancaria cueB3 = new CueBancaria(1000000f,gustav);

        for(String op : cueB1.getOperaciones()){
            System.out.printf(op);
        }










    }
}
