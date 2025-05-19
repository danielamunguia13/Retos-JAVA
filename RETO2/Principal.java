public class Principal {
    public static void main(String[] args) {
        // Crear objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 750.0);

        // Mostrar la información de cada entrada
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
    }
}
