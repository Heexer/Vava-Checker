/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sk.stu.fiit.View.MainView;

/**
 *
 * @author Adam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.setVisible(true);
    }
    
    public static boolean emptyFields(String text1, String text2){
        return (text1.isEmpty() || text2.isEmpty());
    }
    
    
    public static void validator(String regex, String text, JTextField result){
        if (!emptyFields(regex, text)){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                result.setForeground(new java.awt.Color(45, 166, 38));
                result.setText("OK");
            }
            else{
                result.setForeground(new java.awt.Color(232, 0, 0));
                result.setText("NG");
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Pole nemôže byť prázdne",
                    "Chyba", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
