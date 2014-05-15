/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributtes;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Atributtes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean validar= true;
        int opcion;
        double monto;
        char continuar;
        
        account oAccount = new  account();
             
        Scanner teclado = new Scanner(System.in);
        
        while(validar)
        {
            
            System.out.println("Digite 1si quiere realizar un deposito///2. Si quiere realizar un retiro");            
            opcion = Integer.parseInt(teclado.nextLine());
            
            if (opcion==1)
            {
                System.out.println("DIGITE EL MONTO A DEPOSITAR");
               monto = Double.parseDouble(teclado.nextLine());                
                oAccount.Deposito(monto);
            }
            else if (opcion==2)
            {
                System.out.println("DIGITE EL MONTO A RETIRAR");
                monto = Double.parseDouble(teclado.nextLine());                
                oAccount.reTIRO(monto);
                if(oAccount.isHayerror())
                {
                    System.out.println("CUENTA INSUFICIENTE");
                }
                else
                {
                    
                }
            }
            System.out.println("EL SALDO FINAL ES DE "+ oAccount.getSaldoInicial());
            System.out.println("DESEA CONTINUAR CON OTRA TRANSACCION S/N");
            continuar = teclado.nextLine().charAt(0);
              if (continuar=='s'|| continuar== 'S')
              {
                  validar= true;
              }
              else
              {
                  validar = false;
              }
        }      
      
    }
}
