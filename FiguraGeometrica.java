import java.util.*;

public abstract class FiguraGeometrica implements CalculosGeometricos {
private int id;
private String cor;
private static int totalFiguras = 0;

public FiguraGeometrica(String cor) {
this.cor = cor;
totalFiguras = totalFiguras + 1;
id = totalFiguras;
}

public String getCor() {
	return cor;
}

public int getId() {
return id;
}

public void setCor(String cor) {
	this.cor = cor;
}

public static int getTotalFiguras() {
return totalFiguras;
}

public String getInfo() {
return "Cor: " + cor + " Id: " + Integer.toString(id) + " Total figuras: " + Integer.toString(getTotalFiguras());
}

public abstract String getDetalhes();

}