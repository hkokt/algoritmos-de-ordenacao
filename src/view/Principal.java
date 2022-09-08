package view;

import controller.Ordena;

public class Principal {
	public static void main(String args[]) {
		Ordena o = new Ordena();
		int teste[] = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };
		o.quickSort(teste, 0, teste.length - 1);
		for (int i = 0; i < teste.length; i++) {
			System.out.println(i+1 + "# " + teste[i]);
		}
	}
}
