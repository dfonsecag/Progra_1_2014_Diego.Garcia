    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_burbuja;

/**
 *
 * @author DIEGO
 */
public class clsBusquedaBinaria {

    public int BuscarNombre(String[] Nombres, String busqueda) {
        int inicial = 0;
        int elementofinal = Nombres.length - 1;
        while (inicial < elementofinal) {
            int central = (inicial + elementofinal) / 2;
            if (busqueda.compareTo(Nombres[central]) > 0)
            {
                    inicial=central+1;
            }
            else
            {
                if(busqueda.compareTo(Nombres[central])<0)
                {
                    elementofinal= central-1;
                }
                else
                {
                    return  central;
                }
            }
        }
       return -1;
    }
}
