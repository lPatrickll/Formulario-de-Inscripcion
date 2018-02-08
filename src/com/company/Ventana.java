package com.company;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JProgressBar progressBar;
    private JRadioButton radioButton;
    private JCheckBox Tecnologia;
    private JCheckBox Musica;
    private JCheckBox Deporte;
    private JComboBox comboBox;
    private JPasswordField passwordField;
    private JTextArea textArea;
    public Ventana(){

        label =new JLabel("Nombre");
        setSize(700,500);
        setLayout(new FlowLayout());
        add(label);
        setLayout(new FlowLayout());
        textField=new JTextField(8);
        setSize(800,600);
        add(textField);
        label =new JLabel("Apellido");
        setSize(700,500);
        setLayout(new FlowLayout());
        add(label);
        setLayout(new FlowLayout());
        textField=new JTextField(8);
        setSize(800,600);
        add(textField);
        label =new JLabel("CI     ");
        setSize(700,500);
        setLayout(new FlowLayout());
        add(label);
        setLayout(new FlowLayout());
        textField=new JTextField(8);
        setSize(800,600);
        add(textField);
        label =new JLabel("Emitido");
        setSize(700,500);
        setLayout(new FlowLayout());
        add(label);
        setLayout(new FlowLayout());
        textField=new JTextField(8);
        setSize(800,600);
        add(textField);
        label =new JLabel("Interes");
        setSize(700,500);
        setLayout(new FlowLayout());
        add(label);
        Tecnologia=new JCheckBox("Tecnologia");
        Deporte=new JCheckBox("deporte");
        Musica=new JCheckBox("Musica");
        add(Tecnologia);
        add(Musica);
        add(Deporte);
        super.setTitle("Formulario de Inscripcion");
        setSize(800,600);
        setLayout(new FlowLayout());
        button = new JButton(("Presionar"));
        add(button);
    }
}

