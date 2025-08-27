/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BoletoViaje {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del pasajero: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el destino: ");
        String destino = sc.nextLine();

        System.out.print("Ingrese la fecha del viaje (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        System.out.print("Ingrese el número de asiento: ");
        byte asiento = sc.nextByte();

        System.out.print("Ingrese el precio del boleto: ");
        double precio = sc.nextDouble();

        System.out.print("¿El boleto incluye comida? (true/false): ");
        boolean incluyeComida = sc.nextBoolean();

        System.out.print("Ingrese la hora de salida (solo hora en formato 24h): ");
        short horaSalida = sc.nextShort();

        System.out.print("Ingrese el código de viaje (número entero): ");
        int codigoViaje = sc.nextInt();

        System.out.print("Ingrese el número de paradas: ");
        long paradas = sc.nextLong();

        // Salida formateada
        System.out.println("\n========== BOLETO DE VIAJE ==========");
        System.out.println("Pasajero: " + nombre.toUpperCase());
        System.out.println("Destino: " + destino.toLowerCase());
        System.out.println("Fecha: " + fecha);
        System.out.println("Asiento Nº: " + asiento);
        System.out.println("Precio: S/ " + precio);
        System.out.println("Incluye comida: " + incluyeComida);
        System.out.println("Hora de salida: " + horaSalida + ":00");
        System.out.println("Código de viaje: " + codigoViaje);
        System.out.println("Número de paradas: " + paradas);
        System.out.println("=====================================");
    }
}