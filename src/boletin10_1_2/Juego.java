/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Juego {
    private float num1;
    private float intentos;
    private float num2;
    private float diferencia;
    private String novoIntento;

    public void validar() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 introduce un numero"));
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos"));
        if (num1 > 0 && num1 < 50) {
            this.num1 = num1;
        } else {
            imprimir ( "Introduce solo valores entre 1 y 50");
        }
    }

    public void juego1() {
        int acertado = 0; // no se ha acertado
        for (int i = 0; i < intentos; i++) {
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            if (num1 == num2) {
                imprimir ( "Muy bien has acertado el numero " + num1);
                acertado = 1;
                break;
            } else if (num1 > num2) {
                imprimir ( "Prueba con un numero mayor");
                comparar();
            } else if (num1 < num2) {
                imprimir ("Prueba con un numero mas pequeño");
                comparar();
            }
        }
        if (acertado == 0) {
            imprimir ( "Ohhhhh has perdido");

        } else {
            imprimir ("Enhorabuena has ganado");

        }
    }

    public void comparar() {
        diferencia = Math.abs(num1 - num2);
        if (diferencia >= 20) {
            imprimir ("Aun estas muy lejos");
        } else if (diferencia > 10 && diferencia < 20) {
            imprimir ("Aun estas lejos");
        } else if (diferencia > 5 && diferencia < 10) {
            imprimir ("Estas cerca");
        } else if (diferencia < 5) {
            imprimir ("Estas muy cerca");
        }
    }
    public void imprimir(String imprimir){
    JOptionPane.showMessageDialog(null,imprimir);
    }
    public void introducir (){}
}
