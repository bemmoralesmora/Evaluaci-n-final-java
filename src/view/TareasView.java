package view;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TareasView extends JFrame{

    private JButton crearTarea;

    public TareasView (){
        this.setTitle("ROCKEMMA");
        this.setBounds(0,0,800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2,1));

        JPanel controles = new JPanel(new GridLayout(1,2));
        controles.setBackground(Color.GREEN);
        this.add(controles);

        JPanel crear = new JPanel(new GridBagLayout());
        crear.setBackground(Color.YELLOW);
        controles.add(crear);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(2,10,5,10);

        JTextField titulo = new JTextField();
        titulo.setPreferredSize(new Dimension(200,30));
        restricciones.gridx= 1;
        restricciones.gridy= 1;
        crear.add(titulo, restricciones);

        JTextField descripcion = new JTextField();
        descripcion.setPreferredSize(new Dimension(200,30));
        restricciones.gridx= 1;
        restricciones.gridy= 2;
        crear.add(descripcion, restricciones);

        JTextField fecha = new JTextField();
        fecha.setPreferredSize(new Dimension(200,30));
        restricciones.gridx= 1;
        restricciones.gridy= 3;
        crear.add(fecha, restricciones);

        JTextField estado = new JTextField();
        estado.setPreferredSize(new Dimension(200,30));
        restricciones.gridx= 1;
        restricciones.gridy= 4;
        crear.add(estado, restricciones);

        JButton crearTarea = new JButton("crear");
        crearTarea.setPreferredSize(new Dimension(80,30));
        restricciones.gridx= 1;
        restricciones.gridy= 5;
        crearTarea.addActionListener(e -> mostrarinfoTarea());
        crear.add(crearTarea, restricciones);

        JPanel eliminar = new JPanel(new GridBagLayout());
        eliminar.setBackground(Color.GREEN);
        controles.add(eliminar);

        JTextField textoDeEliminar = new JTextField();
        textoDeEliminar.setPreferredSize(new Dimension(200,30));
        restricciones.gridx= 1;
        restricciones.gridy= 1;
        eliminar.add(textoDeEliminar, restricciones);

        JButton botonEliminar = new JButton("eliminar");
        botonEliminar.setPreferredSize(new Dimension(100,30));
        restricciones.gridx= 1;
        restricciones.gridy= 2;
        eliminar.add(botonEliminar, restricciones);

        JPanel tareas = new JPanel();
        tareas.setBackground(Color.BLUE);
        this.add(tareas);

        JPanel formulario = new JPanel();

        this.setVisible(true);

    }

    private JButton boton(String texto) {
        JButton boton = new JButton(texto);
        boton.addActionListener(e -> {
            System.out.println(texto);
        });
        return boton;
    }

    private void mostrarinfoTarea(){

    }
}
