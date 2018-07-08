package com.fooduca.fooduca.POJO;

public class Creadores {
    String nombre;
    String git;
    String carrera;
    int foto;
    String email;

    public Creadores(String nombre, String git, String carrera, String email, int foto) {
        this.nombre = nombre;
        this.git = git;
        this.carrera = carrera;
        this.email = email;
        this.foto = foto;
    }

    public Creadores(String nombre, String git, String carrera, int foto) {
        this.nombre = nombre;
        this.git = git;
        this.carrera = carrera;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
