package br.edu.fateczl.ordenacao.bubblesort.view;

import br.edu.fateczl.ordenacao.bubblesort.BubbleSort;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {100, 99, 85, 61, 44, 33, 17};
		
		BubbleSort sort = new BubbleSort();
		int []vetor1 = sort.bubbleSort(vetor);
		for (int i : vetor1) {
			System.out.print(i + " ");
		}
		System.out.println("Saída do vetor ordenado");

	}

}
