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
    int edificio, salon;
    boolean sino;

    public Clases(String Nombre, String sección, int edificio, int salon, boolean sino) {
        this.Nombre = Nombre;
        this.sección = sección;
        this.edificio = edificio;
        this.salon = salon;
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

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    

    public boolean isSino() {
        return sino;
    }

    public void setSino(boolean sino) {
        this.sino = sino;
    }

   

    @Override
    public String toString() {
        return "Clases{" + "Nombre=" + Nombre + ", secci\u00f3n=" + sección + ", edificio=" + edificio + ", salon" + salon + ", sino=" + sino + '}';
    }
    
}
