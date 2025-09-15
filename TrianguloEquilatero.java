import java.util.*;
import java.lang.*;

public class TrianguloEquilatero extends FiguraGeometrica {
private double lado;

public TrianguloEquilatero(String cor, double lado) {
super(cor);
this.lado = lado;
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

public double calcularArea() {
return lado*lado* Math.sqrt(3) / 4;
}

public double calcularPerimetro() {
	return lado*3;
}

public String getTipoFigura() {
return  "Triangulo Equilatero";
}

public String getInfo() {
return "Cor: " + getCor() + " Id: " + Integer.toString(getId()) + " Total de figuras: " + Integer.toString(getTotalFiguras()) +  " Lado: " + Double.toString(lado);
}

public String getDetalhes() {
return "Cor: " + getCor() + " Id: " +  Integer.toString(getId()) + " Tipo figura: " + getTipoFigura() + " Lado: " + Double.toString(lado) + " Area: " + Double.toString(calcularArea()) + " Perimetro: " + Double.toString(calcularPerimetro());
}

}