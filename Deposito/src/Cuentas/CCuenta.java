/**
 * La clase representa una cuenta bancaria
 * @author isard
 * @version 1.0
 */
package Cuentas;
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    /**
     * Obtiene el nombre del titular de la cuenta
     * @return Nombre del titular
     */
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtiene el nímero de la cuenta bancaria
	 * @return Número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Obtiene el saldo actual de la cuenta bancaria
	 * @return Saldo disponible
	 */
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtiene el tipo de interés de la cuenta
	 * @return Tipo de interés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Consulta el saldo actual de la cuenta
	 * @return Saldo actual
	 */
	public double estado()
    {
        return saldo;
    }

	/**
	 * Método para ingresar dinero en la cuenta
	 * @param cantidad debe ser positiva
	 * @throws Exception si la cantidad es negariva o 0
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad debe ser positiva
     * @throws Exception si la cantidad es negativa, 0 o superior al saldo actual
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
