package br.com.digitalhouse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        //EXERCICIO 01 E 02

        lista.add(0, "PATO");
        lista.add(1, "CACHORRO");
        lista.add(2, "GATO");

        try{
            System.out.println(lista.get(2));
        }catch (Exception ex){

            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        }


    }


}
