/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributedtaxidriver;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.PrintStream;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Abhishek
 */
public class ServerOutput extends JFrame {
    private JTextArea textArea;
    
    private PrintStream standardOut;
    private PrintStream standardErr;
    
    public void execute() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 600);
        initComponents();
        this.setVisible(true);
    }
    private void initComponents() {
        textArea = new JTextArea(50, 10);
        textArea.setEditable(false);
        textArea.setBackground(Color.black);
        textArea.setFont(new Font("Lucida Sans", Font.BOLD, 15));
        textArea.setForeground(Color.green);
        
        PrintStream outputPrintStream = new PrintStream(new CustomOutputStream(textArea));
        PrintStream errorPrintStream = new PrintStream(new CustomErrorStream(textArea));
        // keeps reference of standard output stream
        standardOut = System.out;
        standardErr = System.err; 
        // re-assigns standard output stream and error output stream
        System.setOut(outputPrintStream);
        System.setErr(errorPrintStream);
        
        this.setLayout(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        
        this.add(new JScrollPane(textArea), constraints);
    }
}
