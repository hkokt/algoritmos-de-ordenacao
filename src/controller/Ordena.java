package controller;

public class Ordena {
	public void bubblesort(int vet[]) {
		int size = vet.length;
		int i = 0;
		int aux = 0;
		for (i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		for (i= 0; i < size ; i++) {
			System.out.println(vet[i]);
		}		
	}
}
