package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion,suma = 0,promedio,numMayor = 0,numMenor = 0;
        int[] array = new int[5];
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
                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Número " + (i + 1) + ": ");
                        array[i] = entrada.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Array 1:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    suma = 0;
                    for (int i = 0; i < array.length; i++) {
                        suma = suma + array[i];
                    }
                    System.out.println(suma);
                    break;
                case 4:
                    promedio = suma / array.length;
                    System.out.println(promedio);
                    break;
                case 5:
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] > numMayor){
                            numMayor = array[i];
                        }
                    }
                    System.out.println("El número mayor es: " + numMayor);

                    for (int i = 0; i < array.length; i++) {
                        if (numMenor < array.length){
                            numMenor = array[i];
                        }
                    }
                    System.out.println("El número menor es: " + numMenor);

                    break;
                default:
                    System.out.println("La opción no es válida");
            }
                entrada.nextLine();

                System.out.print("Pulsa INTRO para continuar...");
                entrada.nextLine();
                System.out.println();
        } while (opcion != 0);
    }
}