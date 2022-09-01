package view;

import controller.Ordena;

public class Principal {
	public static void main(String args []) {
		Ordena o = new Ordena();
		int teste [] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1}; 
		o.bubblesort(teste);
	}
}
