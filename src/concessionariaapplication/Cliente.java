/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariaapplication;

/**
 *
 * @author erik
 */
public class Cliente extends Pessoa {
    
    private String endereco;
    
    private int numeroIdentificacaoFiscal;   

    public Cliente(String endereco, int numeroIdentificacaoFiscal, String nomeCompleto, String numeroIdentificacaoCivil, String contato) {
        super(nomeCompleto, numeroIdentificacaoCivil, contato);
        this.endereco = endereco;
        this.numeroIdentificacaoFiscal = numeroIdentificacaoFiscal;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the numeroIdentificacaoFiscal
     */
    public int getNumeroIdentificacaoFiscal() {
        return numeroIdentificacaoFiscal;
    }
    
    
}
