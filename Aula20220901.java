/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20220901;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Aula20220901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!"); 
        JOptionPane.showMessageDialog(null, "Primeiro Teste");
        String nome = JOptionPane.showInputDialog("Coloque seu nome:");
        String sobrenome = JOptionPane.showInputDialog("Coloque seu sobrenome");
        JOptionPane.showMessageDialog(null, "Seu nome completo é:\n"+nome+" "+sobrenome);
        System.out.println("Seu nome completo é:\n"+nome+" "+sobrenome);
    }
    
}
