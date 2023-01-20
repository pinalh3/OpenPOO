package poo.inheritance;

import poo.classes.SmartDevice;

public class SmartWatch extends SmartDevice {
    public String correa;

    public SmartWatch(String so, String pantalla, int bateria, String correa) {
        super(so, pantalla, bateria);
        this.correa = correa;
    }

    public SmartWatch() {
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correa='" + correa + '\'' +
                ", so='" + so + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", bateria=" + bateria +
                '}';
    }
}
