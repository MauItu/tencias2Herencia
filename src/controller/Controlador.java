package controller;

import java.util.ArrayList;

import model.*;
import view.Ventana;

public class Controlador {

	ArrayList <Forma> misFiguritas = new ArrayList();
	
	public void arrancar() {
		
		registrarFiguras();
		for (Forma circulito : misFiguritas) {
			Ventana.mostrarArea(circulito.getArea());
		}
		
        
		
	}
	
	public void registrarFiguras() {//Precargar datos
		Circulo circulito = new Circulo(2.3, 3.5, 15);
		misFiguritas.add(circulito);
		misFiguritas.add(new Circulo(3.3, 1.5, 5));
		misFiguritas.add(new Forma(4, 1.5));
		misFiguritas.add(new Rectangulo(2,3));
	}

}
