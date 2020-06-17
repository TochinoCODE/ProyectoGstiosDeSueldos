//Anthony Joel Carhuachin Calixto 
package practica02Colas;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class AplicaCola {
    static Colas cola;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    static void menu() {
        int opcion;
        do {
            System.out.println("\n\tmenu");
            System.out.println("[1] Crear Cola");
            System.out.println("[2] Insertar Datos");
            System.out.println("[3] Mostrar Datos");
            System.out.println("[4] Eliminar Dato");
            System.out.print("Ingrese una opncion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    crearCola();
                    break;
                case 2:
                    llenarDatos();
                    break;
                case 3:
                    cola.mostrar();
                    break;
                case 4:
                    cola.eliminar();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opncion no valida");
            }
        } while (opcion != 0);
    }

    static void crearCola() {
        int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Trabajadores"));
        cola = new Colas(tam);
    }
    static int pos = 0;

    static void llenarDatos() {
        double tarifa;
        int hora;

        String codigo = JOptionPane.showInputDialog("Ingrese el codigo");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        do {
            tarifa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tarifa por hora trabajada"));
            if (tarifa <= 0) {
                JOptionPane.showMessageDialog(null, "**Error al ingresar tarifa***");
            }
        } while (tarifa <= 0);

        do {
            hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas trabajadas al dia "));
            if (hora <= 0) {
                JOptionPane.showMessageDialog(null, "**Error al ingresar hora no puede ser negativa o cero***");
            }
        } while (hora <= 0);

        cola.llenarCola(pos, codigo, nombre, tarifa, hora);
        pos++;
    }
}
