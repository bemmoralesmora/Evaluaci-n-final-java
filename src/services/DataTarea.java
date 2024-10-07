package services;
import model.Tarea;

import java.util.ArrayList;
import java.time.LocalDate;



public class DataTarea {
    public static ArrayList listaTareas (){
        ArrayList<Tarea> tarea = new ArrayList<>();
        tarea.add(new Tarea("ejercicio #10", "resolver 10 problemas de MRUV", LocalDate.of(2024, 2, 20), "pendiente"));
        tarea.add(new Tarea("ejercicio #20", "subir el sello de los ejercicios", LocalDate.of(2024, 5, 15), "completado"));
        tarea.add(new Tarea("ejercicio #2", "exponer sobre la ciencia ficción", LocalDate.of(2024, 8, 10), "en progreso"));
        tarea.add(new Tarea("ejercicio #6", "subir el link del repocitorio", LocalDate.of(2024, 9, 18), "pendiente"));
        tarea.add(new Tarea("ejercicio #8", "mandar captura de lo trabajado", LocalDate.of(2024, 12, 29), "pendiente"));

        return tarea;
    }

}
