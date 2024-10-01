package com.campusdual.classroom;
import java.util.Scanner;

public class Exercise18 {

	public static int [] createAndInitializeArray(int posiciones){
		int [] arrayCreado = new int [posiciones];
		for (int i = 0; i<posiciones; i++){
			arrayCreado [i]= i+1;
		}
		return arrayCreado;
	}

	public static void showInLineArray (int[] arrayEnteros){
		for (int i = 0; arrayEnteros.length > i; i++) {
				System.out.print(arrayEnteros[i]+ " ");

		}



	}


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el número de posiciones del array: ");
		int numPosArray = sc.nextInt();
		int [] nuevoArray = createAndInitializeArray (numPosArray);
		showInLineArray(nuevoArray);
	}
}
