package model;

import java.util.*;
import java.io.IOException;
public class Operations {
  final static String[] ORDINALS = {"primer","segundo","tercer"};
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
    System.out.println("Ingrese los elementos del " + ORDINALS[next] + " arreglo:\n");
    for (int i = 0; i < currentArray.length; i++) {
      System.out.println("Ingrese el elemnto #" + (i+1));
      currentArray[i] = in.nextInt();
      in.nextLine();
    }
    return currentArray;
  }

  public static int[] findIntersect(int[] arr1, int[] arr2, int[] arr3) {
    int[] intersect = new int[1];
    int index = 0;
    for (int j = 0; j < arr1.length; j++) {
      for (int k = 0; k < arr2.length; k++) {
        for (int l = 0; l < arr3.length; l++) {
          flag = Arrays.asList(intersect).contains(arr1[j]);
          if (arr1[j] == arr2[k] && arr2[k] == arr3[l]) {
            intersect[index] = arr1[j];
            intersect = Arrays.copyOf(intersect, intersect.length + 1);
            index++;
          }
        }
      }
    }
    intersect = Arrays.copyOf(intersect, intersect.length -1);

    return intersect;
  }

  public static int[] formatAndPrint(int[] arr) {
    
  }
}
