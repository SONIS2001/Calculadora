package calculadora;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonia
 */
public class Calculadora {

    private static Component parentComponent;

    public static void main(String[] args) {
        float operacion, dato1, dato2, resultado = 0;
        System.out.println("1.-Sumar "
                + "2.-Restar "
                + "3.-Multiplicar "
                + "4.-Dividir "
                + "5.-Modulo "
                + "Otro numero.-Salir");
        System.out.println("Seleccione la opcion deseada: ");
        operacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Opcion"));

        if (operacion > 0 && operacion <= 5) {
            dato1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er numero: "));
            dato2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese en 2do numero: "));
            if (operacion != 0) {
                    if (operacion == 1) {
                        resultado = dato1 + dato2;
                    }
                    if (operacion == 2) {
                        resultado = dato1 - dato2;
                    }
                    if (operacion == 3) {
                        resultado = dato1 * dato2;
                    }
                    if (operacion == 4) {
                        resultado = dato1 / dato2;
                    }
                    if (operacion == 5) {
                        resultado = dato1 % dato2;
                    }

                    System.out.println("El resultado es: " + resultado);
                    JOptionPane.showMessageDialog(parentComponent, "El resultado es: " + resultado);

                }

            }

        }

    }


