package ui;

import model.*;
import java.util.*;
import java.io.IOException;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //Entrada, escaner
    Operations.clsm();
    int[][] arrGroup = Operations.setArrays(in); //Entrada, arreglo 3x{x,y,z} que contiene los arreglos
    int[] arr1 = arrGroup[0]; //Entrada, arreglos que
    int[] arr2 = arrGroup[1]; //serán intersectados
    int[] arr3 = arrGroup[2]; //

    int next = 0;
    arr1 = Operations.fillArray(in,arr1,next);
    next++;
    arr2 = Operations.fillArray(in,arr2,next);
    next++;
    arr3 = Operations.fillArray(in,arr3,next);

    int[] intersect = Operations.findIntersect(arr1,arr2,arr3); //Salida, arreglo de intersección
    System.out.println("El arreglo interseccion es:\n" + Arrays.toString(intersect));
  }

}
