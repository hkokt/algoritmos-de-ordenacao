package controller;

public class Ordena {

//=========================================================================================	
	public int[] bubbleSort(int vet[]) {
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
		return vet;
	}

//=========================================================================================

	public int[] mergeSort(int vet[], int ini, int fim) {

		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(vet, ini, meio);
			mergeSort(vet, meio + 1, fim);
			Intercala(vet, ini, meio, fim);
		}
		return vet;
	}

//=========================================================================================

	private void Intercala(int vet[], int ini, int meio, int fim) {
		int vetAux[] = new int[vet.length];
		for (int i = ini; i <= fim; i++) {
			vetAux[i] = vet[i];
		}
		int esq = ini;
		int dir = meio + 1;

		for (int cont = ini; cont <= fim; cont++) {
			if (esq > meio) {
				vet[cont] = vetAux[dir];
				dir++;
			} else if (dir > fim) {
				vet[cont] = vetAux[esq];
				esq++;
			} else if (vetAux[esq] < vetAux[dir]) {
				vet[cont] = vetAux[esq];
				esq++;
			} else {
				vet[cont] = vetAux[dir];
				dir++;
			}
		}
	}

//=========================================================================================	
	public int[] quickSort(int vet[], int ini, int fim) {
		if (fim > ini) {
			int achaPivo = divideQuick(vet, ini, fim);
			quickSort(vet, ini, achaPivo - 1);
			quickSort(vet, achaPivo + 1, fim);
		}
		return vet;
	}

	private int divideQuick(int vet[], int ini, int fim) {
		int esq = ini + 1;
		int dir = fim;
		int pivo = vet[ini];

		while (esq <= dir) {
			while (esq <= dir && vet[esq] <= pivo) {
				esq++;
			}
			while (dir >= esq && vet[dir] > pivo) {
				dir--;
			}
			if (esq < dir) {
				troca(vet, esq, dir);
				esq++;
				dir--;
			}
		}
		troca(vet, ini, dir);
		return dir;
	}

	private void troca(int[] vet, int i, int j) {
		int aux = vet[j];
		vet[j] = vet[i];
		vet[i] = aux;
	}

}
