package model;

public class Forma {
     private double x;
     private double y;
     private double area;
	
     /*public double area() {
    	  return 0;
     }*/
     
     public double perimetro() {
    	 return 0;
     }
     
     public Forma(double x, double y ) {
		
		this.x = x;
		this.y = y;
	}
     
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Forma() {
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Forma [x=" + x + ", y=" + y + "]";
	}
     
     
}
