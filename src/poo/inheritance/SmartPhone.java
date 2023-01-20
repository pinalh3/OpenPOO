package poo.inheritance;

import poo.classes.SmartDevice;

public class SmartPhone extends SmartDevice {
    public boolean forro;

    public SmartPhone(String so, String pantalla, int bateria, boolean forro) {
        super(so, pantalla, bateria);
        this.forro = forro;
    }

    public SmartPhone() {
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "forro=" + forro +
                ", so='" + so + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", bateria=" + bateria +
                '}';
    }
}
