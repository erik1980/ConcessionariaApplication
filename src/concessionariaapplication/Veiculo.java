/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariaapplication;

/**
 *
 * @author erik
 */
public class Veiculo {

    private int codigo;

    private String marca;

    private String modelo;

    private int ano;

    private String cor;

    private int numeroPortas;

    private int numeroAssentos;

    private float preco;

    private Motor motor;

    public Veiculo(int codigo, String marca, String modelo, int ano, String cor, int numeroPortas, int numeroAssentos, float preco, Motor motor) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numeroPortas = numeroPortas;
        this.numeroAssentos = numeroAssentos;
        this.preco = preco;
        this.motor = motor;
    }

    public int getCodigo() {
        return codigo;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @param numeroPortas the numeroPortas to set
     */
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    /**
     * @param numeroAssentos the numeroAssentos to set
     */
    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public float obterEficienciaMotor() {
        return motor.calcularEficiencia();

    }

    public boolean isEletrico() {

        return (motor instanceof MotorEletrico);
    }

    public Motor getMotor() {
        return motor;

    }

    public TipoMotor getTipoMotor() {
        if (motor instanceof MotorEletrico) {
            return TipoMotor.ELETRICO;

        } else {
            return TipoMotor.COMBUSTAO;
        }
    }

}
