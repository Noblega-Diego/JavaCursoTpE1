package tpintegrado.diego.noblega;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Escuela {
    public static void main(String[] args) {
        String[] aulas = {"Azul","Verde","Amarillo"};
        int[] bancosPAula = {40,35,30};
        int nroIngresante = 0;
        System.out.print("Ingrese la cantidad de ingresantes: ");
        nroIngresante = tomarNroIngresantes();
        
        for (int i = bancosPAula.length -1; i >= 0; i--) {
            if(nroIngresante <= bancosPAula[i]){
                System.out.println("Aula recomendada: " + aulas[i]);
                break;
            }
        }
    
    }
    
    public static int tomarNroIngresantes(){
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextInt();
        }catch(InputMismatchException e){
            System.out.print("El Nro ingresado es incorrecto \n Intente nuevamente: ");
            return tomarNroIngresantes();
        }
    }
}
