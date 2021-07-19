package main;

import modelosTo.Raices;

public class RaicesApp {

	public static void main(String[] args) {
		
		Raices raices = new Raices(1, -5, 6);
		
		raices.calcular();
	}
}

//una solución: 1, 2, 1 = -1
//dos soluciones: 1, -5, 6 = 3 y 2
//no existe: 0, 0, 9
//no existe: 4, 2, 3