/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_angelvasquez;

import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Maestros{
    private String  Nombre, Apellido;
    private ArrayList<Clases>a;
    private double Salario; 
    private int Edad;

    public Maestros() {
    }

    public Maestros(String Nombre, String Apellido, ArrayList<Clases> a, double Salario, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.a = a;
        this.Salario = Salario;
        this.Edad = Edad;
    }

    public Maestros(String Nombre, String Apellido, double Salario, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Salario = Salario;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public ArrayList<Clases> getA() {
        return a;
    }

    public void setA(ArrayList<Clases> a) {
        this.a = a;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Maestros{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", a=" + a + ", Salario=" + Salario + ", Edad=" + Edad + '}';
    }
    
}
