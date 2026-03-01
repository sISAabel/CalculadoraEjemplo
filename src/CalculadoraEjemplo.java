/**
 * Clase que implementa operaciones matemáticas básicas usando dos operandos.
 *
 * Permite realizar suma, resta, multiplicación y división y obtener el resultado.
 *
 * @author Sara Rodriguez
 * @version 1.0
 * @since 1.0
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {

    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor que inicializa los operandos de la calculadora.
     *
     * @param operando1 primer operando
     * @param operando2 segundo operando
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = 0;
    }

    /**
     * Realiza la suma de los operandos.
     *
     * @return resultado de la suma
     */
    public double suma() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de los operandos.
     *
     * @return resultado de la resta
     */
    public double resta() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de los operandos.
     *
     * @return resultado de la multiplicación
     */
    public double multiplicacion() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de los operandos.
     *
     * @return resultado de la división
     */
    public double division() {
        resultado = operando1 / operando2;
        return resultado;
    }
}
