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
public class Licenciaturas extends Carrera{
    String es;

    public Licenciaturas(String es) {
        this.es = es;
    }

    public Licenciaturas(String es, String nombre, String facultad, String jefe, double costom) {
        super(nombre, facultad, jefe, costom);
        this.es = es;
    }

    public Licenciaturas() {
        super();
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }
    
    public  void mod()
    {
    
    }
}
