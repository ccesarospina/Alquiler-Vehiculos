package alquilervehiculos;

import javax.swing.JOptionPane;

public class Calcular {

    //private int dias_alquiler;
    private double vlr_base = 50000;
    private double vlr_auto = 1500;
    private double vlr_micro = 1500;
    private double vlr_vehcarga = 2000;
    private double vlr_camion = 4000;
    public double vlr_total = 0;
    public double Carro50t = 5000;
    

    public double vehiculo(double _diasalq) {
        //En el caso de alquiler de un coche, al precio base se le suma la cantidad de $1.5 COP x día.
        vlr_total = (getVlr_base() * _diasalq) + (getVlr_auto() * _diasalq);
        return vlr_total;
    }

    public double microbus(double _diasalq) {
        //El precio de alquiler de microbuses es igual que el de los coches,
        //salvo que se le añade una cantidad de $2 COP, independientemente de los días de alquiler.
        vlr_total = (getVlr_base() * _diasalq) + (getVlr_micro() * _diasalq) + 2000;
        return vlr_total;
    }

    public double vehiculo_18t(double _diasalq) {
        //El precio de los vehículos de carga es el precio base más $20 COP x PMA (Peso Máximo Autorizado en toneladas).
        vlr_total = (getVlr_base() * _diasalq) + (getVlr_vehcarga() * 18);
        return vlr_total;
    }

    public double vehiculo_26t(double _diasalq) {
        //El precio de los vehículos de carga es el precio base más $20 COP x PMA (Peso Máximo Autorizado en toneladas).
        vlr_total = (getVlr_base() * _diasalq) + (getVlr_vehcarga() * 26);
        return vlr_total;
    }

    public double vehiculo_32t(double _diasalq) {
        //El precio de los vehículos de carga es el precio base más $20 COP x PMA (Peso Máximo Autorizado en toneladas).
        vlr_total = (getVlr_base() * _diasalq) + (getVlr_vehcarga() * 32);
        return vlr_total;
    }

    public double camion(double _diasalq) {
        //Además, en el caso de los camiones, al precio se suma un fijo de $40 COP, 
        //independientemente de los días de alquiler.
        vlr_total = (getVlr_base() * _diasalq) + getVlr_camion();
        return vlr_total;
    }

    public double getVlr_base() {
        return vlr_base;
    }

    public void setVlr_base(double vlr_base) {
        this.vlr_base = vlr_base;
    }

    public double getVlr_auto() {
        return vlr_auto;
    }

    public void setVlr_auto(double vlr_auto) {
        this.vlr_auto = vlr_auto;
    }

    public double getVlr_micro() {
        return vlr_micro;
    }

    public void setVlr_micro(double vlr_micro) {
        this.vlr_micro = vlr_micro;
    }

    public double getVlr_vehcarga() {
        return vlr_vehcarga;
    }

    public void setVlr_vehcarga(double vlr_vehcarga) {
        this.vlr_vehcarga = vlr_vehcarga;
    }

    public double getVlr_camion() {
        return vlr_camion;
    }

    public void setVlr_camion(double vlr_camion) {
        this.vlr_camion = vlr_camion;
    }

}

class NewCalcularVehi50t extends Calcular {

    public NewCalcularVehi50t() {
        this.vlr_total = (this.Carro50t * 50);
    }

    public void carro50t() {
        JOptionPane.showMessageDialog(null, "El valor para un carro de 50 toneladas es = " + this.vlr_total);
    }
}
