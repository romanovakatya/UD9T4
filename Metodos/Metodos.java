package Metodos;

import Clases.*;

public class Metodos {
////	**** TAREA 1 ****
//		public static void metodoTarea1() {
////			Creamos un array de electrodomesticos con 10 objetos
//			Electrodomestico[] electrodomesticos = {new Electrodomestico(500, "negro", 'Z', 80), 
//													new Lavadora(),
//													new Television(800, "gris", 'A', 20, 60, true),
//													new Electrodomestico(400, "rojo", 'D', 10), 
//													new Lavadora(650, "marron", 'D', 60, 10),
//													new Television(),
//													new Electrodomestico(), 
//													new Lavadora(1200, "negro", 'A', 100, 30),
//													new Television(2000, "negro", 'A', 30, 60, true),
//													new Television(300, "blanco", 'E', 8, 20, false)
//													};
//			
//			int precioTotal = 0;
//			int precioLavadoras = 0;
//			int precioTeles = 0;
//			
////			Recorremos el array, comprobamos el tipo de objeto con instanceof y sumamos el precio a la variable correspondiente
//				for (int i = 0; i < electrodomesticos.length; i++) {
////					System.out.println(electrodomesticos[i].precioFinal());
//					if(electrodomesticos[i] instanceof Lavadora) {
//						precioLavadoras += electrodomesticos[i].precioFinal();
//					} else if (electrodomesticos[i] instanceof Television) {
//						precioTeles += electrodomesticos[i].precioFinal();
//					}
//					precioTotal += electrodomesticos[i].precioFinal();
//				}
//				
//				System.out.println("Precio total: "+precioTotal+" €");
//				System.out.println("Precio lavadoras: "+precioLavadoras+" €");
//				System.out.println("Precio televisores: "+precioTeles+" €");
//		}
//		
////		**** TAREA 2 ****
//		public static void metodoTarea2() {
////			Creamos dos arrays de series y videojuegos con 5 objetos cada uno
//				Serie[] series = {new Serie("Fleabag", 2, "Comedia Dramática", "Phoebe Waller-Bridge"), 
//						new Serie(),
//						new Serie("Juego de Tronos", 8, "Fantasía", "David Benioff & D.B. Weiss"),
//						new Serie("The Witcher", 1, "Fantasía", "Lauren Schmidt Hissrich"), 
//						new Serie("Westworld", "Jonathan Nolan & Lisa Joy")
//						};
//				
//				Videojuego[] videojuegos = {new Videojuego("God of War", 21, "Acción", "Santa Monica Studio"), 
//						new Videojuego(),
//						new Videojuego("The Legend of Zelda: Majora's Mask", 20, "Acción/Fantasía", "Nintendo EAD"),
//						new Videojuego("The Witcher 3: Wild Hunt", 51, "Acción/Fantasía", "CD Projekt Red"), 
//						new Videojuego("Portal 2", 8, "Puzzles", "Valve")
//						};
//				
////				Entregamos algunas series y videojuegos
//				series[2].entregar();
//				series[4].entregar();
//				videojuegos[2].entregar();
//				videojuegos[3].entregar();
//				videojuegos[4].entregar();
//				
//				int numS = 0;
//				int numV = 0;
//				Serie masTemp = series[0];
//				Videojuego masHoras = videojuegos[0];
//				
////				Bucle para contar series y videojuegos entregados
////				y encontrar el videojuego con mas horas y la serie con mas temporadas
//				for (int i = 0; i < videojuegos.length; i++) {
////					Comprobamos que series y videojuegos estan entregados
//					if(series[i].isEntregado()) {
//						numS++;
//						series[i].devolver();
//					}
//					
//					if(videojuegos[i].isEntregado()) {
//						numV++;
//						videojuegos[i].devolver();
//					}
//					
////					Comparamos las series y videojuegos para encontrar y guardar
////					las que tienen mas horas/temporadas
//					if(series[i].getNumTemporadas() > masTemp.getNumTemporadas()) {
//						masTemp = series[i];
//					}
//					
//					if(videojuegos[i].getHorasEstimadas() > masHoras.getHorasEstimadas()) {
//						masHoras = videojuegos[i];
//					}
//				}
//				
//				System.out.println("Hay un total de "+numS+" series entregadas y "+numV+" videojuegos entregados.");
//				System.out.println("La serie con más temporadas es "+masTemp.getTitulo());
//				System.out.println("El videojuego con más horas estimadas es "+masHoras.getTitulo());
//
//		}
		
//		**** TAREA 4 ****
		public static void metodoTarea4(){
			Raices raiz1 = new Raices(2,-6,4);
			raiz1.calcular();
		}
}
