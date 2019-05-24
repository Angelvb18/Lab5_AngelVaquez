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
public class Estudiantes {
    private String nombre, apellido,carrera,tc;
    private int ncuenta , edad;
    private char gen;
    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, String carrera, int ncuenta, int edad, char gen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.ncuenta = ncuenta;
        this.edad = edad;
        this.gen = gen;
    }

    public Estudiantes(String nombre, String carrera, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
    }

    public Estudiantes(String nombre, String apellido, String carrera, int ncuenta, int edad, char gen,String tc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.tc = tc;
        this.ncuenta = ncuenta;
        this.edad = edad;
        this.gen = gen;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", apellido=" + apellido + ", Genero=" + gen + ", carrera=" + carrera + ", ncuenta=" + ncuenta + ", edad=" + edad + '}';
    }
    
}
