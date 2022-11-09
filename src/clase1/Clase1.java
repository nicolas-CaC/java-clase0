package clase1;

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Holis");
        System.out.println("Alo aló");
        System.err.println("Sí en rojo");
        
        System.out.print("Ingrese el nombre de usuario: ");
        String nombre_usuario = entrada.nextLine();
        System.out.println("nombre_usuario = " + nombre_usuario);
        
        System.out.print("Ingrese su edad: ");
        int edad_usuario = entrada.nextInt();
        System.out.println("edad_usuario = " + edad_usuario);
        
        System.out.printf("Su nombre es %s y su edad es %d\n", nombre_usuario, edad_usuario);
        
        String palabra1 = "Fin";
        String palabra2 = "Programa";
        
        System.out.println(palabra1 + " " + "del" + " " + palabra2);
        
        //
    }

}
