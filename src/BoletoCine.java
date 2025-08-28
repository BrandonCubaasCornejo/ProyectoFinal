/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BoletoCine {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del espectador: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el nombre de la película: ");
        String pelicula = sc.nextLine();

        System.out.print("Ingrese la fecha de función (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        System.out.print("Ingrese el número de asiento: ");
        byte asiento = sc.nextByte();

        System.out.print("Ingrese el precio del boleto: ");
        double precio = sc.nextDouble();

        System.out.print("¿El boleto incluye combo de snacks? (true/false): ");
        boolean incluyeSnacks = sc.nextBoolean();

        System.out.print("Ingrese la hora de inicio (solo hora en formato 24h): ");
        short horaInicio = sc.nextShort();

        System.out.print("Ingrese el código de entrada: ");
        int codigoEntrada = sc.nextInt();

        System.out.print("Ingrese la duración estimada de la película en minutos: ");
        long duracion = sc.nextLong();

        // Salida formateada
        System.out.println("\n========== BOLETO DE CINE ==========");
        System.out.println("Espectador: " + nombre.toUpperCase());
        System.out.println("Película: " + pelicula.toLowerCase());
        System.out.println("Fecha: " + fecha);
        System.out.println("Asiento Nº: " + asiento);
        System.out.println("Precio: S/ " + precio);
        System.out.println("Incluye combo de snacks: " + incluyeSnacks);
        System.out.println("Hora de inicio: " + horaInicio + ":00");
        System.out.println("Código de entrada: " + codigoEntrada);
        System.out.println("Duración estimada: " + duracion + " minutos");
        System.out.println("=====================================");
    }
}