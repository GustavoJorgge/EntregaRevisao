package area;

public abstract class PoligonoRegular {
	
	int numLados;
	float tamLado;
	
	
	public PoligonoRegular(int numLados, float tamLado) {
		super();
		this.numLados = numLados;
		this.tamLado = tamLado;
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

	public abstract float calcularPerimetro();
	
	public abstract float calcularArea();
	
}
