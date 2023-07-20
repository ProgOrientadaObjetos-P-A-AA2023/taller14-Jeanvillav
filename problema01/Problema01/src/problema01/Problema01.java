/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Byte opc = 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Datos del Trabajador");

            System.out.println("Ingrese cedula: ");
            String c = sc.nextLine();

            System.out.println("Ingrese nombres: ");
            String n = sc.nextLine();

            System.out.println("Ingrese correo: ");
            String correo = sc.nextLine();

            System.out.println("Ingrese sueldo: ");
            double s = sc.nextDouble();
            sc.nextLine();

            System.out.println("Ingrese mes del sueldo: ");
            String m = sc.nextLine();

            Enlace a = new Enlace();

            Trabajador t = new Trabajador();

            t.establecerCedula(c);

            t.establecerNombres(n);
            t.establecerCorreo(correo);
            t.establecerSueldo(s);
            t.establecerMesSueldo(m);

            a.insertarTrabajador(t);

           
            for (int i = 0; i < a.obtenerDataTrabajador().size(); i++) {
                System.out.printf("%s", a.obtenerDataTrabajador().get(i));
            }

            System.out.println("Ingrese 0 si desea terminar el programa, Si desea continuar Ingrese un numero");
            opc = sc.nextByte();

        } while (opc != 0);

    }

}
