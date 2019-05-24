/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_angelvasquez;

/**
 *
 * @author Angel
 */
public abstract class Carrera {
   private String  nombre, facultad,   jefe;
   private double costom;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, String jefe, double costom) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.jefe = jefe;
        this.costom = costom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public double getCostom() {
        return costom;
    }

    public void setCostom(double costom) {
        this.costom = costom;
    }
    public abstract void mod();

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", facultad=" + facultad + ", jefe=" + jefe + ", costom=" + costom + '}';
    }
   
}
