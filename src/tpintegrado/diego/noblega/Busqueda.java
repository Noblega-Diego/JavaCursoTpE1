package tpintegrado.diego.noblega;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Busqueda {
    public static void main(String[] args) {
        String[] lista = {"Javier", "Micael", "Martin", "Jose", "Paul"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el usuario abuscar: ");
        String nombre = sc.next();
        for (int i = 0; i < lista.length; i++) 
            if(nombre.equalsIgnoreCase(lista[i])){ System.out.println("pos["+i+"]"); break;}
        
    }
}
