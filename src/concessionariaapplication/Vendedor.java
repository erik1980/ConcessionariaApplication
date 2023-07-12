/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariaapplication;

/**
 *
 * @author erik
 */
public class Vendedor extends Pessoa {
    
    private String departamento;
    
    private String cargo;

    public Vendedor(String departamento, String cargo, String nomeCompleto, String numeroIdentificacaoCivil, String contato) {
        super(nomeCompleto, numeroIdentificacaoCivil, contato);
        this.departamento = departamento;
        this.cargo = cargo;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }
    
    
    
    
}
