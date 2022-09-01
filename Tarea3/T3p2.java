package Tarea3;
import java.util.*;
public class T3p2 {
    /*public class NumeroNegativoExcepcion {

    }*/
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int a = tc.nextInt();
        try {

            double rz = (int) Math.sqrt(a);
            System.out.println("La raíz cuadrada es: " + NumeroNegativoExcepcion(rz));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public class NumeroNegativoExcepcion extends Exception {
        public double NumeroNegativoExcepcion(int a, double rz) throws Exception {
            if (a < 0) {
                throw new Exception ("No se puede resolver esta operación.\nLa raíz cuadrada de un número negativo no tiene solución real");
            }else {
                return rz;
            }
        }
    }
}
