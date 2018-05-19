/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.sistemas.operativos;

/**
 *
 * @author J-ALS
 */
public class MiColeccion <T>{
    private Object datos[];
    private int len =   0;

    public MiColeccion(int capacidadInicial) {
        datos   =   new Object[capacidadInicial];
    }
    public void Agregar(T elem){
        insertar(elem,len);
    }
    
    public void insertar(T elem, int i){
        if (len==datos.length) {
            Object aux[]    =   datos;
            datos   =   new Object[datos.length*2];
            for (int j = 0; j < len; j++) {
                datos[j]    =   aux[j];
            }
            aux =   null;
        }
        for (int j = len-1; j >= i; j--) {
            datos[j+1]  =   datos[j];
        }
        datos[i]    =   elem;
        len++;
    }
    
    public int buscar(T elem){
        int i   =   0;
        for (;i<len && !datos[i].equals(elem);i++);
            return i<len?i:-1;
        
    }
    

  
    
}
