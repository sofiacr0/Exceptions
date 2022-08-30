package Tarea2;
public class T2p2 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] " + args[i]);
            suma = suma + Integer.parseInt(args[i]);
        }
        System.out.println("\nSuma: " + suma);
        System.out.println("Promedio: " + suma / args.length);
    }
}