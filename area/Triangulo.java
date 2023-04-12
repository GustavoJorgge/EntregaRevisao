package area;

public class Triangulo extends PoligonoRegular {

	public Triangulo(int numLados, float tamLado) {
		super(numLados, tamLado);
		// TODO Auto-generated constructor stub
	}
	
	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	public float getTamLado() {
		return tamLado;
	}

	public void setTamLado(float tamLado) {
		this.tamLado = tamLado;
	}

	@Override
	public float calcularPerimetro() {
		
		return tamLado*numLados;
	}

	@Override
	public float calcularArea() {
		
		return ((tamLado*tamLado)/2);	
	}

}
