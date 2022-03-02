package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion, suma, promedio, numMayor, numMenor;
        int[] notas = new int[5];
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("MENÚ");
            System.out.println("============================");
            System.out.println("1.- (Re)Crgar.");
            System.out.println("2.- Mostrar.");
            System.out.println("3.- Sumar.");
            System.out.println("4.- Promedio.");
            System.out.println("5.- Máximo y minimo.");
            System.out.println("0.- Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch(opcion) {
                case 1:
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        notas[i] = entrada.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Array 1:");
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print(notas[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    suma = 0;
                    for (int i = 0; i < notas.length; i++) {
                        suma = suma + notas[i];
                    }
                    System.out.println(suma);
                    break;
                case 4:
                    suma = 0;
                    for (int i = 0; i < notas.length; i++) {
                        suma = suma + notas[i];
                    }
                    promedio = suma / notas.length;
                    System.out.println(promedio);
                    break;
                case 5:
                    numMayor = notas[0];
                    numMenor = notas[0];
                    for (int i = 1; i < notas.length; i++) {
                        if (notas[i] > numMayor){
                            numMayor = notas[i];
                        }
                        if (notas[i] < numMenor){
                            numMenor = notas[i];
                        }
                    }
                    System.out.println("El número mayor es: " + numMayor);
                    System.out.println("El número menor es: " + numMenor);
                    break;
                case 0:
                    System.out.println("¡Hasta Pronto!");
                    break;
                default:
                    System.out.println("La opción no es válida");
            }

            entrada.nextLine();

            System.out.print("Pulsa INTRO para continuar...");
            entrada.nextLine();
            System.out.println();
        } while (opcion != 0);

        entrada.close();
    }
}