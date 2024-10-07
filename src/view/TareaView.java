package view;

import model.Tarea;
import services.DataTarea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TareaView extends JPanel{
    private ArrayList<Tarea> ListaTareas;

    public TareaView(ArrayList<Tarea> listaTareas) {
        this.ListaTareas = listaTareas;
        setLayout(new BorderLayout());
        add(panelPaciente(), BorderLayout.CENTER);
    }

    private JPanel panelPaciente() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("TAREAS", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        panel.add(titulo, BorderLayout.NORTH);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(ListaTareas.size() + 1, 4, 10, 10)); // (Filas, Columnas, Espaciado Horizontal, Espaciado Vertical)
        gridPanel.setBackground(Color.WHITE);  // Fondo blanco para la tabla

        String[] campos = {"TITULO", "DESCRIPCION", "FECHA", "ESTADO"};
        for (String campo : campos) {
            JLabel label = new JLabel(campo, JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setForeground(Color.BLACK);
            gridPanel.add(label);
        }

        for (Tarea Tarea : ListaTareas) {
            JLabel Titulo = new JLabel(Tarea.getTitulo(), JLabel.CENTER);
            Titulo.setFont(new Font("Arial", Font.PLAIN, 12));
            Titulo.setForeground(Color.BLACK);
            gridPanel.add(Titulo);

            JLabel descripcion = new JLabel(Tarea.getDescripcion(), JLabel.CENTER);
            descripcion.setFont(new Font("Arial", Font.PLAIN, 12));
            descripcion.setForeground(Color.BLACK);
            gridPanel.add(descripcion);

            JLabel fecha = new JLabel(String.valueOf(Tarea.getFechaLimite()), JLabel.CENTER);
            fecha.setFont(new Font("Arial", Font.PLAIN, 12));
            fecha.setForeground(Color.BLACK);
            gridPanel.add(fecha);

            JLabel estado = new JLabel(Tarea.getEstado(), JLabel.CENTER);
            estado.setFont(new Font("Arial", Font.PLAIN, 12));
            estado.setForeground(Color.BLACK);
            gridPanel.add(estado);
        }

        panel.add(gridPanel, BorderLayout.CENTER);

        return panel;
    }
}
