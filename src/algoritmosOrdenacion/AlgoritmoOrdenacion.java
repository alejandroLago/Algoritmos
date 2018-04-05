/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosOrdenacion;

import java.util.Arrays;

/**
 *
 * @author Alejandro Lago
 */
public class AlgoritmoOrdenacion {

    public void ordenacionBurbuja(int[] numeros) {
        int aux;

        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {//intercambio de valores
                    aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
            }

        }

    }

    public void ordenacionBurbujaOptimo(int[] numeros) {
        int aux;
        boolean cambia = true;
        int n = 1;
        while (cambia) {//comprueba si ha habido cambios
            cambia = false;
            for (int i = 0; i < numeros.length - n; i++) {
                if (numeros[i] > numeros[i + 1]) {//intercambio de valores
                    aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                    cambia = true;
                }
                System.out.println(Arrays.toString(numeros));

            }
            n++;

        }
    }

    public void insercion(int[] numeros) {
        int aux;
        for (int i = 2; i < numeros.length; i++) {

            aux = numeros[i];
            int j = 0;
            for (j = i - 1; j >= 0 && numeros[j] > aux; j--) {
                numeros[j + 1] = numeros[j];

            }

            numeros[j + 1] = aux;

        }
    }

    public void shellSort(int[] numeros2) {
        int salto, aux;

        for (salto = numeros2.length / 2; salto != 0; salto /= 2) {

            for (int i = salto; i < numeros2.length; i++) {
                if (numeros2[i] < numeros2[i - salto]) {
                    aux = numeros2[i];
                    numeros2[i] = numeros2[i - salto];
                    numeros2[i - salto] = aux;

                }
            }
            int aux2 = (salto +1) * 2;
            if (aux2 < numeros2.length && salto != 1) {
                for (int i = numeros2.length-1 ; i <= salto +1; i -= salto) {
                    if (numeros2[i] < numeros2[i - salto]) {
                        aux = numeros2[i];
                        numeros2[i] = numeros2[i - salto];
                        numeros2[i - salto] = aux;

                    }

                }
            }
            if (salto == 1) {
                for (int i = 2; i < numeros2.length; i++) {

                    aux = numeros2[i];
                    int j = 0;
                    for (j = i - 1; j >= 0 && numeros2[j] > aux; j--) {
                        numeros2[j + 1] = numeros2[j];

                    }

                    numeros2[j + 1] = aux;

                }

            }

        }
        System.out.println(Arrays.toString(numeros2));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmoOrdenacion ejercicios = new AlgoritmoOrdenacion();

        int[] numeros = {57, 22, 11, 13, 21, 7};
        int[] numeros2 = {24, 109, 149, 111, 34, 2, 61, 119, 122, 125, 27, 145};

        ejercicios.shellSort(numeros2);

    }

}
