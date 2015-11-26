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
public class Boletin10_1_2 {

    public static void main(String[] args) {
        int num1;
        String modo;
        float intentos;
        String novoIntento;
           
        Juego juego1 = new Juego();

        boolean volverEmpezar=true;
        boolean empezarNuevo;
        
        do {
            
            modo = JOptionPane.showInputDialog("Quieres jugar solo o con un amigo");

            switch (modo) {
                case "solo":
                    num1 = (int) (Math.random() * 50 + 1);
                    intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos"));
                    juego1.juego1();
                   
                    break;
                case "amigo":
                    juego1.validar();
                    juego1.juego1();
                   
                    break;
                default:
                    juego1.imprimir ("Las unicas opciones validas son amigo o solo");
                    volverEmpezar = true;
                    break;
            }
            do {
                
            novoIntento = (JOptionPane.showInputDialog("¿Quieres volver a jugar"));
            switch (novoIntento) {

                case "si":
                    empezarNuevo=false;
                    volverEmpezar=true;
                    
                    break;
                case "no":
                    juego1.imprimir ( "Gracias por jugar");
                    empezarNuevo=false;
                    volverEmpezar=false;
                    break;
                    
                default:
                    juego1.imprimir ( "Las unicas opciones validas son si o no");
                    empezarNuevo = true;
                    break;
            }
        } while (empezarNuevo == true);
            
        } while (volverEmpezar == true);

    }

}
