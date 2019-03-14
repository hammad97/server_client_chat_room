/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cngui;

/**
 *
 * @author Dell
 */
public class CNGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerGUI cn = new ServerGUI();
        cn.setVisible(true);
        ClientGUI cnn = new ClientGUI();
        cnn.setVisible(true);
    }
    
}
