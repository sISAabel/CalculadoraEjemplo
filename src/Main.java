public class Main {

    public static void main(String[] args) {
        CalculadoraEjemplo calc = new CalculadoraEjemplo(10, 5);

        System.out.println("Suma: " + calc.suma());
        System.out.println("Resta: " + calc.resta());
        System.out.println("Multiplicación: " + calc.multiplicacion());
        System.out.println("División: " + calc.division());
        System.out.println("Modificación");
    }
}