package com.mycompany.mercadomaven_hibernate_jpa.utilities;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Utils {

    //desativa e ativa os botões
    public static void ativa(boolean estadoComponente, JPanel painel) {

        Component[] componentes = painel.getComponents();

        for (Component componente : componentes) {

            if (componente instanceof JButton) {

                if (((JButton) componente).getActionCommand() == "0") {
                    componente.setEnabled(estadoComponente);

                }else {
                     componente.setEnabled(!estadoComponente);

                
                }

            }

        }

    }
    
    
    
    public static  void ligaDesliga(boolean estadoComponente, JPanel painel) {

        Component[] componentes = painel.getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            } else if (componente instanceof JFormattedTextField) {
                ((JFormattedTextField) componente).setText("");
            } else if (componente instanceof JTextArea) {
                ((JTextArea) componente).setText("");
            } else if (componente instanceof JComboBox) {
                ((JComboBox) componente).setSelectedIndex(-1);
            }
            //  else if (componente instanceof JScrollPane){
            //    ((JScrollPane)componente).get
            // }
            componente.setEnabled(estadoComponente);
        }
       

    }
       

}
