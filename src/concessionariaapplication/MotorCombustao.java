/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariaapplication;

/**
 *
 * @author erik
 */
public class MotorCombustao extends Motor{
    
    private TipoCombustivel tipoCombustivel;
    
    private TipoTransmissao transmisao;
    
    private float volumeTanque;

    public MotorCombustao(TipoCombustivel tipoCombustivel, String marca, int cilindrada, 
            float torque, float peso, float autonomia) {
        super(marca, cilindrada, torque, peso, autonomia);
        this.tipoCombustivel = tipoCombustivel;
    }
    
    

    @Override
    public float calcularEficiencia() {
        return (volumeTanque/getAutonomia())*100;
    }
    
}
