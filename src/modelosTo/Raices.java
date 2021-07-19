package modelosTo;

public class Raices {

	// atributos,
	protected double a;
	protected double b;
	protected double c;
	protected double discriminante;
	protected double raizCuadrada;
	protected double raiz1;
	protected double raiz2;

	// constructor con atributos,
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;				
	}

	// métodos,

	// devuelve el valor del discriminante (double)
	// (b^2)-4*a*c,
	private double getDiscriminante() {

		// en el caso cuando a es igual a zero y b es igual a b,
		// no hay ningúna ecuación,
		if (this.a == 0 && this.b == 0) {

			return -1;
		}
		// en otros casos calculamos el discriminante,
		else {

			return Math.pow(this.b, 2) - (4 * this.a * this.c);
		}
	}

	// devuelve un booleano indicando si tiene dos soluciones,
	// true: el discriminante es mayor que 0,
	private boolean tieneRaices() {

		return this.discriminante > 0 ? true : false;

	}

	// devuelve un booleano indicando si tiene una única solución,
	// true: el discriminante es igual que 0,
	private boolean tieneRaiz() {

		return this.discriminante == 0 ? true : false;
	}

	// imprime las 2 posibles soluciones,
	// cuando tieneRaices() es true,
	private String obtenerRaices() {

		return "Las soluciones: " + this.raiz1 + " y " + this.raiz2;
	}

	// imprime única raíz, que será cuando solo tenga una,
	// solución posible, cuando tieneRaiz() es true,
	private String obtenerRaiz() {

		return "La solución: " + this.raiz1;
	}

	// metódo que devuelve raiz guadrada del discriminante,
	private double raizCuadrada() {

		return Math.sqrt(this.discriminante);
	}

	// método que calcula ecuación 2º grado,
	private double getEcuacion(String signo) {
						
		if (signo.equalsIgnoreCase("+")) {

			return ((-this.b + this.raizCuadrada) / (2 * this.a));
		} 
		else {

			return ((-this.b - this.raizCuadrada) / (2 * this.a));
		}
	}

	// mostrara por consola las posibles soluciones que tiene nuestra ecuación,
	// en caso de no existir solución, mostrarlo también
	public void calcular() {
		
		//inicializamos variables necesarias para realizar calculos,
		this.discriminante = this.getDiscriminante();
		this.raizCuadrada = this.raizCuadrada();		
		this.raiz1 = this.getEcuacion("+");
		this.raiz2 = this.getEcuacion("-");	

		//imprimimos resultado en el caso cuando hay dos soluciones,
		if (this.tieneRaices()) {
			System.out.println(this.obtenerRaices());
		} 
		//imprimimos resultado en el caso cuando hay una solución,
		else if (this.tieneRaiz()) {
			System.out.println(this.obtenerRaiz());
		} 
		//imprimimos resultado en el caso cuando no hay soluciones,
		else {
			System.out.println("La solución no existe");
		}
	}
}
