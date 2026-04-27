package ec.edu.ups.agendatelefonica;

import ec.edu.ups.agendatelefonica.clases.OperadoraTelefonica;
import ec.edu.ups.agendatelefonica.clases.Persona;
import ec.edu.ups.agendatelefonica.clases.Telefono;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<OperadoraTelefonica> operadoras = new ArrayList<>();

        String continuar = "N";

        while (opcion != 4) {

            System.out.println("MENÚ");
            System.out.println("1.Registrar Contactos");
            System.out.println("2.Registrar Operadoras");
            //System.out.println("3.Registrar Telefonos");
            System.out.println("4.Salir");
            System.out.println("Ingresar una opción::");
            opcion = scanner.nextInt();

            if (opcion == 1) {

                System.out.println("Registrar contacto:");

                do {
                    System.out.println("Ingrese la cedula:");
                    String cedula = scanner.next();

                    System.out.println("Ingrese el nombre:");
                    String nombre = scanner.next();

                    System.out.println("Ingrese año de nacimiento:");
                    int año = scanner.nextInt();

                    System.out.println("Ingrese mes:");
                    int mes = scanner.nextInt();

                    System.out.println("Ingrese dia:");
                    int dia = scanner.nextInt();

                    Date fecha = new Date(año - 1900, mes - 1, dia);

                    Persona persona = new Persona();
                    persona.setCedula(cedula);
                    persona.setNombre(nombre);
                    persona.setFechaNacimiento(fecha);

                    personas.add(persona);

                    System.out.println("¿Ingresar otro contacto? (S/N)");
                    continuar = scanner.next();

                } while (continuar.equalsIgnoreCase("S"));

                for (Persona aux : personas) {
                    System.out.println(aux);
                }

            } else if (opcion == 2) {

                System.out.println("\nRegistrar operadora:");

                do {
                    System.out.println("Ingrese el codigo:");
                    int codigo = scanner.nextInt();

                    System.out.println("Ingrese el nombre:");
                    String nombre = scanner.next();

                    OperadoraTelefonica operadora = new OperadoraTelefonica();
                    operadora.setCodigo(codigo);
                    operadora.setNombre(nombre);

                    operadoras.add(operadora);

                    System.out.println("¿Ingresar otra operadora? (S/N)");
                    continuar = scanner.next();
                    
                } while(continuar.equalsIgnoreCase("S"));

                for (OperadoraTelefonica aux : operadoras) {
                    System.out.println(aux);
                }
            } else if (opcion == 3) {
                System.out.println("Coming soon...");
            }
            else {
                System.out.println("Fin del programa.");
                break;
            }
        }
    }
}