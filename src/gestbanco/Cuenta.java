/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestbanco;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int id;
    private double credito = 0.0;
    private Cliente dueño = null;

    public Cuenta(int id, double credito) {
        this.id = id;
        this.credito = credito;
        this.dueño = dueño;
    }
    
    public void añadDueño(Cliente owner){
        this.dueño = owner;
    }

    public Cliente getDueño(){
        return dueño;
    }

    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
