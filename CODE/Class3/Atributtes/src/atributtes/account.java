/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributtes;

/**
 *
 * @author Estudiante
 */
public class account {
   private double saldoInicial;

   public boolean  hayerror;
    
    public account()
    {
        saldoInicial=0;
        hayerror = false;
    }
    /*
     * Este metodos irve oara aumantar la cuenta del usuario..
     * @ param monto Parametro para recibir el metodo...
     */
    public void Deposito(double Pmonto)
    {
        setSaldoInicial(getSaldoInicial()+Pmonto);
    }
    /*
     * Este metodos irve oara disminuir la cuenta del usuario..
     * @ param monto Parametro para recibir el metodo...
     */
    public void reTIRO(double  Pmonto)
    {
        if (getSaldoInicial()>=Pmonto)
        {
            setSaldoInicial(getSaldoInicial()-Pmonto);
            setHayerror(false);
        }
        else
        {
            setHayerror(true);
        }
    }
    
    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public boolean isHayerror() {
        return hayerror;
    }

    public void setHayerror(boolean hayerror) {
        this.hayerror = hayerror;
    }
}
