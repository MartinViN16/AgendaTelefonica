package ec.edu.ups.agendatelefonica;

import ec.edu.ups.agendatelefonica.clases.OperadoraTelefonica;
import ec.edu.ups.agendatelefonica.clases.Persona;
import ec.edu.ups.agendatelefonica.clases.Telefono;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {
        Date fechaDeNacimientoUno = new Date(2000, 0, 15);
        Persona personaUno = new Persona("010101", "Pepito Perez", fechaDeNacimientoUno);        
        OperadoraTelefonica operadoraUno = new OperadoraTelefonica(1, "Claro");
        
        Telefono telefonoUno = new Telefono(991275411, "Movil", personaUno, operadoraUno);
        
        System.out.println("Datos del Telefono Uno: " + telefonoUno);
        
        // Manejo de Listas en Java
        ArrayList<OperadoraTelefonica> operadoras = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        String continuar = "N";
        do {
            System.out.println("Ingresa el codigo de la operadora");
            int codigo = entrada.nextInt();
            System.out.println("Ingresa el nombre de la operadora: ");
            String nombre = entrada.next();
            
            OperadoraTelefonica operadora = new OperadoraTelefonica();
            operadora.setCodigo(codigo);
            operadora.setNombre(nombre);
            operadoras.add(operadora);
            
            
            System.out.println("¿Desea ingresar otra operadora? (S/N)");
            continuar = entrada.next();
        } while(continuar.equalsIgnoreCase("S"));
        
        for(OperadoraTelefonica operadorita : operadoras){
            System.out.println(operadorita);
        }
        
        
        /*
        
        Menu
        1. Registrar Contactos (implementar)
        2. Registrar Operadoras (implementar)
        3. Regitrar Telefonos (no implementar)
        4. Salir        
        
        Subir a GitHub (enlace publicado en Teams)
        */
        
    }
}