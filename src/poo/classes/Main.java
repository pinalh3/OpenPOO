package poo.classes;

import poo.inheritance.SmartPhone;
import poo.inheritance.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone telefono = new SmartPhone();
        SmartWatch reloj = new SmartWatch();

        telefono.pantalla = "Oled";
        telefono.so = "Android13";
        telefono.bateria = 8000;
        telefono.forro = true;

        reloj.pantalla = "IPS";
        reloj.so = "Android13";
        reloj.bateria = 2000;
        reloj.correa = "cuero";

        System.out.println(reloj.toString());
        System.out.println(telefono.toString());


    }
}