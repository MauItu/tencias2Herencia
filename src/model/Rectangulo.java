package model;

public class Rectangulo extends Forma {
	protected double lado1;
	protected double lado2;

	public double calcularArea() {
		return lado1*lado2;
	}
	
	public double calcularPerimetro() {
		return 2*(lado1+lado2);
	}
	
	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(double x, double y, double lado1, double lado2) {
		super(x, y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}

}
