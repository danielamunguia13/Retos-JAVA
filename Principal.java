import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del usuario
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea

        System.out.print("Ingrese el número de expediente: ");
        String expediente = scanner.nextLine();

        Paciente paciente = new Paciente(nombre, edad, expediente);
        System.out.println("\n🩺 Información del Paciente:");
        paciente.mostrarInformacion();

        scanner.close();
    }
}
