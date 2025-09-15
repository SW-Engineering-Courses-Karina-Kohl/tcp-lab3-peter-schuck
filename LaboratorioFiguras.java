public class LaboratorioFiguras {
    public static void main(String[] args) {
        // Criando figuras geométricas
        FiguraGeometrica triangulo = new TrianguloEquilatero("Vermelho", 5);
        FiguraGeometrica retangulo = new Retangulo("Azul", 10, 5);
        // FiguraGeometrica circulo = new Circulo("Verde", 3);
        
        // Array polimórfico
        // FiguraGeometrica[] figuras = {triangulo, retangulo, circulo};

        FiguraGeometrica[] figuras = {triangulo, retangulo};
        
        System.out.println("=== LABORATORIO DE FIGURAS GEOMETRICAS ===\n");
        
        // Demonstrando polimorfismo dinâmico
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getInfo());
            System.out.println("Detalhes: " + figura.getDetalhes());
            System.out.printf("Area: %.2f%n", figura.calcularArea());
            System.out.printf("Perimetro: %.2f%n", figura.calcularPerimetro());
            System.out.println("-----------------------------------");
        }
        
        // Demonstrando atributo de classe
        System.out.println("Total de figuras criadas: " + FiguraGeometrica.getTotalFiguras());
        
        
    }
}
