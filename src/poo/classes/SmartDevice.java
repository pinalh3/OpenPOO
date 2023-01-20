package poo.classes;

public class SmartDevice {

    protected String so;
    protected String pantalla;

    protected int bateria;

    public SmartDevice(String so, String pantalla, int bateria) {
        this.so = so;
        this.pantalla = pantalla;
        this.bateria = bateria;
    }

    public SmartDevice() {
    }

    @Override
    public String toString() {
        return "SmatDevice{" +
                "so='" + so + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", autonomia=" + bateria +
                '}';
    }
}
