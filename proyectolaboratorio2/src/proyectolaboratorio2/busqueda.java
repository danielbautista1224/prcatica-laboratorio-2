/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolaboratorio2;

/**
 *
 * @author ASUS
 */
public class busqueda {
    //busqueda en un listado desorganizado
    public int busquedaSecuencial(int[] array,int elemento){
        for(int i=0; i < array.length;i++){
            if(array[i]==elemento){
                return array[i];
            }
        }
        return 0;
    }
    
}
