package model;

import java.time.LocalDate;

public class Tarea {
    private String titulo;
    private String descripcion;
    private LocalDate fechaLimite;
    private String estado;

    public Tarea(String titulo, String descripcion, LocalDate fechaLimite, String estado){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public String getEstado() {
        return estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

