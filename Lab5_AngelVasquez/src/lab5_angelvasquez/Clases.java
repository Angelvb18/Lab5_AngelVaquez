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
public class Clases {
    String Nombre, sección;
    int edificio, salón;
    char sino;

    public Clases(String Nombre, String sección, int edificio, int salón, char sino) {
        this.Nombre = Nombre;
        this.sección = sección;
        this.edificio = edificio;
        this.salón = salón;
        this.sino = sino;
    }

    public Clases() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSección() {
        return sección;
    }

    public void setSección(String sección) {
        this.sección = sección;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getSalón() {
        return salón;
    }

    public void setSalón(int salón) {
        this.salón = salón;
    }

    public char getSino() {
        return sino;
    }

    public void setSino(char sino) {
        this.sino = sino;
    }

    @Override
    public String toString() {
        return "Clases{" + "Nombre=" + Nombre + ", secci\u00f3n=" + sección + ", edificio=" + edificio + ", sal\u00f3n=" + salón + ", sino=" + sino + '}';
    }
    
}
