/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.sistemas.operativos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author J-ALS
 */
public class Areas {
    
    
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame jf   =   new JFrame("Text area"); 
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String text = "Un objeto JTextArea es una área multilínea para escribir texto. "

+ "Se puede cambiar el número de líneas que se mostrarán, "

+ "y también el numero de columnas. Puedes cambiar las fuentes y tamaños de letras. "

+ "Y puedes agregar tu TextArea en un JScrollPane para poder mover las zonas de texto." ;

JTextArea textAreal = new JTextArea(text,20,10);

textAreal.setPreferredSize(new Dimension (10,100));
JTextArea textArea2 = new JTextArea(text,20,10);


JScrollPane scroll = new JScrollPane(textArea2);

jf.getContentPane().add(scroll, BorderLayout.CENTER);

jf.add(scroll);
//El método setLineWrap lo que hace es ordenar las palabras para que no se salgan de los márgenes,

//si lo desactivamos(false), el texto se escribirá hacia el lado(en una línea) y no se vería todo si el //texto es muy largo

textAreal.setLineWrap (true);

textArea2.setLineWrap (true);

textAreal.setWrapStyleWord(true);

textArea2.setWrapStyleWord(true);
        
        //agregamos los area de texto al frame principal,

//nota: el textArea2 está dentro de un JScrollPane, por eso éste es el que agregamos al frame

jf.add(textAreal);

jf.add(scroll);



//el metodo pack sirve para dejar todo dentro del frame

jf.pack();



//y finalmente el metodo setVisible es para que se visualice la ventana

jf.setVisible(true) ;
        
    }
    
}
