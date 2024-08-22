package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>(); //asi se declara un arrayList
    lista.add(new Persona(1,"Juan",22));
        lista.add(new Persona(2,"Maria",12));
        lista.add(new Persona(3,"Marcos",24)); //llenado de la lista
        lista.add(new Persona(4,"Luis",43));   //dinamica

        //recorrer por indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba "+lista.get(i).getNombre());
        }

        //recorrido forEach
        for (Persona pipol:lista){
            System.out.println("Prueba ForEach: "+ pipol.getNombre());
        }

        //eliminar un elemento
        lista.remove(1);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elementos actualizados: "+lista.get(i).getNombre());
        }

    }
    
    
}