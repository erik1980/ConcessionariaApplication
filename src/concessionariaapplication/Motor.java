/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariaapplication;

/**
 *
 * @author erik
 */
public abstract class Motor {
    
    private String marca; 
    
    private int cilindrada;
    
    private float torque;
    
    private float peso;
    
    private float autonomia;    
   

    public Motor(String marca, int cilindrada, float torque, float peso, float autonomia) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.torque = torque;
        this.peso = peso;
        this.autonomia = autonomia;     
    }
    
    
    
    
    
    public abstract float calcularEficiencia();

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return the torque
     */
    public float getTorque() {
        return torque;
    }

    /**
     * @param torque the torque to set
     */
    public void setTorque(float torque) {
        this.torque = torque;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the autonomia
     */
    public float getAutonomia() {
        return autonomia;
    }

    /**
     * @param autonomia the autonomia to set
     */
    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }
    
}
