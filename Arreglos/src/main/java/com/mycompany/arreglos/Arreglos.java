/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-09
 */
public class Arreglos {
int[] edades; 
public void crearArreglo(int n){
    edades=new int[n];// se crea el arreglo vacio
    for (int i=0; i<n; i++){
        edades[i]= Integer.parseInt( JOptionPane.showInputDialog("Ingresar valor para la posicion" + i));
        
    }
      JOptionPane.showMessageDialog(null,"Arreglo LLeno");
}
public void consultar(int n){
    for(int i=0; i<n; i++){
        JOptionPane.showMessageDialog(null,edades[i]);
       
    }  
    
}
   
}
