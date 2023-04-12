package area;

public class Quadrado  extends PoligonoRegular{
	
	public Quadrado(int numLados, float tamLado) {
		super(numLados, tamLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularArea() {
		return tamLado*tamLado;
	}

	@Override
	public float calcularPerimetro() {
		return numLados*tamLado;
	}

}
