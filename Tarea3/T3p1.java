package Tarea3;
import java.util.*;
public class T3p1 {
    //usar a.length();
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Escriba una cadena: ");
        String n_tc = tc.nextLine();
        tc.close();

        try {
            System.out.println("\nEl caracter de la cadena encontrado en la posición 7 es: " + caracterEn(n_tc, 7-1));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static char caracterEn(String cadena, int pos) throws Exception {
        if (pos < 0 || pos >= cadena.length())
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        else
            return cadena.charAt(pos);
    }
}
