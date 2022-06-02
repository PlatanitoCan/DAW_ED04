public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() {
    }
    /**
     *
     * @param nom asigna el contenido dentro de él al atributo de la clase.
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }
    /**
     *
     * @return devuelve nombre.
     */
    public String obtenerNombre() {
        return nombre;
    }
    /**
     *
     * @return devuelve el estado de la cuenta.
     */
    public double estado() {
        return saldo;
    }
    /**
     *
     * @return devuelve lo acumulado en la cuenta.
     */

    public String obtenerCuenta() {
        return cuenta;
    }
    /**
     *
     * @param cantidad evalúa en una condición si el saldo disponible de la cuenta es positivo o no.
     * @throws Exception si se cumple la condición mostrará un mensaje.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
    /**
     *
     * @param cantidad evalúa en dos condiciones si se puede retirar o no hay suficiente saldo en la cuenta.
     * @throws Exception si se cumple la condición mostrará un mensaje.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }

}
