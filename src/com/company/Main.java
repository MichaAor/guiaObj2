package com.company;

import com.company.ejercicio1.Autor;
import com.company.ejercicio1.Libro;
import com.company.ejercicio2.Cliente;

import java.util.UUID;

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
        System.out.println(ej.imprimirMsj());*/

    ////EJ2

        Cliente cl1 = new Cliente("Carlos","minguito@gmail.com",15);
        System.out.println(cl1.toString());





    }
}
