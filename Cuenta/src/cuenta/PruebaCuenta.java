package cuenta;

import java.util.Scanner;

public class PruebaCuenta {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Cuenta miCuenta = new Cuenta();
        
        System.out.println("El nombre incial es: "+miCuenta.obtenerNombre());
        
        System.out.println("Introduzca el nombre: ");
        String elNombre = scanner.nextLine();
        miCuenta.establecerNombre(elNombre);
        System.out.println();
        
        System.out.println("El nombre en el objeto de miCuenta es: "+miCuenta.obtenerNombre());
    
    }
}
