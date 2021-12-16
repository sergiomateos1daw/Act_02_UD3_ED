/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 */
public class CCuenta {

/**
 * AQUÍ ESTAMOS DECLARANDO LAS VARIABLES
 * @author Sergio
 * @version 1.0.0
 */
     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * es el constructor sin parametros
     */
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Numero de cuenta
    * @param sal Cantidad de dinero en la cuenta
    * @param tipo Tipo de cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Nombre del titular de la cuenta
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * 
    * @return nombre del titular de la cuenta 
    */
    public String obtenerNombre()
    {
        return nombre;
    }
    
    /**
     * 
     * @return saldo del saldo que tiene la cuenta
     */
    
     public double estado ()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad cantidad a ingresar
     * @throws Exception control de excepcion
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * 
    * @param cantidad cantidad a retirar
    * @throws Exception control de excepcion
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * 
     * @return devuelve el numero de cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * 
   * @param cuenta añade el valor que le pasamos a la instancia cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }
/**
 * 
 * @param saldo añade el valor que le pasamos a la instancia slado
 */
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /*
  * @return devuelve el tipo de interes
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
 * 
 * @param tipoInterés añade el valor que le pasamos a la instancia tipoInterés
 */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
