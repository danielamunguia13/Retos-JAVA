public class Entrada {
    // Atributos privados
    private String nombreEvento;
    private double precio;

    // Constructor que recibe el nombre del evento y el precio
    public Entrada(String nombreEvento, double precio) {
        this.nombreEvento = nombreEvento;
        this.precio = precio;
    }

    // Método para mostrar la información de la entrada
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precio);
    }
}

