package view;

import java.util.Arrays;

import controller.QuickSort; 

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {2,0,1,3,7,8,5,4,9,6};
	
		QuickSort oCont = new QuickSort();
		vetor = oCont.quickSort(vetor, 0, vetor.length - 1);
		
		System.out.println("");
		System.out.println("=======================================");
		for (int valor : vetor) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("=======================================");
		
	}

}
