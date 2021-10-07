package com.ceep.test;

import com.ceep.enumeraciones.*;

public class TestEnum {

    public static void main(String[] args) {
        //Podemos acceder sin el import porque es publico y es estatico
        System.out.println("Primer dia de la semana: " + Dias.Lunes);
        diasSemana(Dias.Lunes);
        //Continentes
        System.out.println("\n- Pais numero 1: "+Continentes.Africa);
         System.out.println("- Numero de paises de America: " + Continentes.America.getNumpaises());
         System.out.println("Habitantes de Africa: "+Continentes.Africa.getNumhabitantes());
    }

    public static void diasSemana(Dias dia) {
        switch (dia) {
            case Lunes:
                System.out.println("Primer dia");
                break;
            case Martes:
                System.out.println("Segundo dia");
                break;
            case Miercoles:
                System.out.println("Tercer dia");
                break;
            case Jueves:
                System.out.println("Cuarto dia");
                break;
            case Viernes:
                System.out.println("Quinto dia");
                break;

        }

    }
}
