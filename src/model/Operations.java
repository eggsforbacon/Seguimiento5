package model;

import java.util.*;
import java.io.IOException;
public class Operations {
  static String[] ORDINALS = {"primer","segundo","tercer"};
  public static int[][] setArrays(Scanner in) {
    System.out.println("Ingrese el tamanio del primer arreglo: ");
    int size = in.nextInt();
    in.nextLine();
    int[] arr1 = new int[size];
    System.out.println("Ingrese el tamanio del segundo arreglo: ");
    size = in.nextInt();
    in.nextLine();
    int[] arr2 = new int[size];
    System.out.println("Ingrese el tamanio del tercer arreglo: ");
    size = in.nextInt();
    in.nextLine();
    int[] arr3 = new int[size];
    int[][] arrGroup = {arr1,arr2,arr3};
    return arrGroup;
  }

  public static int[] fillArray(Scanner in, int[] currentArray, int next) {
    System.out.println("Ingrese los elementos del " + ORDINALS[next]);
    for (int i = 0; i < currentArray.length; i++) {
      System.out.println("Ingrese el elemnto #" + i);
      currentArray[i] = in.nextInt();
      in.nextLine();
    }
    return currentArray;
  }
}
