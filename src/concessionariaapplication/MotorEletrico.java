package concessionariaapplication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import concessionariaapplication.Motor;

/**
 *
 * @author erik
 */
public class MotorEletrico extends Motor {
    
    private float capacidadeBateria;

    public MotorEletrico(float capacidadeBateria, String marca, int cilindrada, 
            float torque, float peso, float autonomia) {
        super(marca, cilindrada, torque, peso, autonomia);
        this.capacidadeBateria = capacidadeBateria;
    }
    
    

    @Override
    public float calcularEficiencia() {
        return (capacidadeBateria/getAutonomia())*100;

    }


    
    
    
}
