package alquilervehiculos;


public class AlquilerVehiculos {


    public static void main(String[] args) {
        //Instanciamos un objeto de la clase Interfaz llamado alquiler
        Interfaz alquiler = new Interfaz();
        //Vamos al Metodo mostrar Interfaz
        alquiler.mostrarInterfaz();
        // Instanciamos un objeto de la clase Calcular
        NewCalcularVehi50t newcalcula = new NewCalcularVehi50t();
        // //Vamos al Metodo del carro de 50T
        newcalcula.carro50t();
        
    }
    
}
