package paquete;


public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia de Rectangulo
        Rectangulo rectangulo = new Rectangulo(5.0, 10.0);

        // Imprimir las dimensiones del rectángulo
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());

        // Modificar la base y altura del rectángulo
        rectangulo.setBase(7.0);
        rectangulo.setAltura(12.0);

        // Imprimir las nuevas dimensiones del rectángulo
        System.out.println("Nueva Base: " + rectangulo.getBase());
        System.out.println("Nueva Altura: " + rectangulo.getAltura());

        // Calcular y imprimir el área del rectángulo
        double area = rectangulo.calcularArea();
        System.out.println("Área del rectángulo: " + area);
    }
}
