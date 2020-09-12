package model;

import java.util.*;
import java.io.IOException;
public class Operations {
  final static String[] ORDINALS = {"primer","segundo","tercer"};
  public static int[][] setArrays(Scanner in) {
    System.out.println("Ingrese el tamanio del primer arreglo: ");
    int size = in.nextInt();
    in.nextLine();
    int[] arr1 = new int[size]; //Entrada, guarda el primer arreglo
    clsm();
    System.out.println("Ingrese el tamanio del segundo arreglo: ");
    size = in.nextInt();
    in.nextLine();
    int[] arr2 = new int[size]; //Entrada, guarda el segundo arreglo
    clsm();
    System.out.println("Ingrese el tamanio del tercer arreglo: ");
    size = in.nextInt();
    in.nextLine();
    int[] arr3 = new int[size]; //Entrada, guarda el tercer arreglo
    clsm();
    int[][] arrGroup = {arr1,arr2,arr3}; //Entrada, le pasa todos los areglos en una matriz al main
    return arrGroup;
  }

  public static int[] fillArray(Scanner in, int[] currentArray, int next) {
    for (int i = 0; i < currentArray.length; i++) {
      System.out.println("Ingrese los elementos del " + ORDINALS[next] + " arreglo:\n");
      System.out.println("Ingrese el elemnto #" + (i+1));
      currentArray[i] = in.nextInt();
      in.nextLine();
      clsm();
    }
    clsm();
    return currentArray;
  }

  public static int[] findIntersect(int[] arr1, int[] arr2, int[] arr3) {
    int[] intersect = new int[1];
    int index = 0;
    for (int j = 0; j < arr1.length; j++) {
      for (int k = 0; k < arr2.length; k++) {
        for (int l = 0; l < arr3.length; l++) {
          if (arr1[j] == arr2[k] && arr2[k] == arr3[l]) {
            intersect[index] = arr1[j];
            intersect = Arrays.copyOf(intersect, intersect.length + 1);
            index++;
          }
        }
      }
    }
    intersect = Arrays.copyOf(intersect, intersect.length -1);
    intersect = formatArray(intersect);

    return intersect; //Salida, le pasa el intersect al main con el formato adecuado
  }

  private static int[] formatArray(int[] arr) { //formatea el array de interseccion
    Arrays.sort(arr);
    for (int m = 0; m < arr.length; m++) {
      if (arr[m] == arr[m+1]) {
        arr[m+1] = 0;
        for (int n = m+1; n < arr.length -1; n++) {
          arr[n] = arr[n+1];
        }
        arr = Arrays.copyOf(arr, arr.length -1);
      }
    }

    return arr;
  }

  public static void clsm() {
    try {
      new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
