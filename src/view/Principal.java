package view;

import controller.Ordena;

public class Principal {
	public static void main(String args []) {
		Ordena o = new Ordena();
		int recebe;
		int teste [] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1}; 
		o.bubblesort(teste);
		for (int i = 0; i<teste.length; i++) {
			recebe = teste[i];
			System.out.println(recebe);
		}
	}
}
