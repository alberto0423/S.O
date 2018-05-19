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
public class TicTac {
    
    private int value;

    public TicTac(int valorInicial){
        this.value=valorInicial;
    }
    
    public TicTac(){
        this.value=0;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }
    
    public void increment(){
        this.value++;
    }
}
