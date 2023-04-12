package area;

public class Principal {
	public static void main(String[]args) {
		
		Triangulo triangulo = new Triangulo (3, 5);
		Quadrado quadrado = new Quadrado(4, 10);
		
		System.out.println("Area do triangulo:" + triangulo.calcularArea());
		System.out.println("Perimetro do triangulo:" + triangulo.calcularPerimetro());
		System.out.println("Area do quadrado:" + quadrado.calcularArea());
		System.out.println("Perimetro do quadrado:" + quadrado.calcularPerimetro());
				
	}
}
