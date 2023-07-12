/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariaapplication;

/**
 *
 * @author erik
 */
public class Pessoa { 
    
    private String nomeCompleto;
    
    private String numeroIdentificacaoCivil;
    
    private String contato; 

    public Pessoa(String nomeCompleto, String numeroIdentificacaoCivil, String contato) {
        this.nomeCompleto = nomeCompleto;
        this.numeroIdentificacaoCivil = numeroIdentificacaoCivil;
        this.contato = contato;
    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @return the numeroIdentificacaoCivil
     */
    public String getNumeroIdentificacaoCivil() {
        return numeroIdentificacaoCivil;
    }

    /**
     * @return the contato
     */
    public String getContato() {
        return contato;
    }
    
    
}
