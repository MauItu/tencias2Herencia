package model;

public class Circulo extends Forma{
	protected double radio;

	public double calcularArea() {
		return Math.PI*radio*radio;
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
		this.setArea(calcularArea());
	}

	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulo(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	

}
