/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariaapplication;

import java.time.LocalDate;

/**
 *
 * @author erik
 */
public class Contrato {
    
    private int numeroContrato;
    
    private MetodoPagamento metodoPagamentoUtilizado;
    
    private LocalDate dataCompra;
    
    private LocalDate prazoPagamento;
    
    private Cliente cliente;
    
    private Veiculo veiculo;
    
    private Vendedor vendedor;    

    public Contrato(int numeroContrato, MetodoPagamento metodoPagamentoUtilizado, 
            LocalDate dataCompra, LocalDate prazoPagamento, Cliente cliente, 
            Veiculo veiculo, Vendedor vendedor) {
        this.numeroContrato = numeroContrato;
        this.metodoPagamentoUtilizado = metodoPagamentoUtilizado;
        this.dataCompra = dataCompra;
        this.prazoPagamento = prazoPagamento;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.vendedor = vendedor;
    }

    /**
     * @return the numeroContrato
     */
    public int getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * @param numeroContrato the numeroContrato to set
     */
    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    /**
     * @return the metodoPagamentoUtilizado
     */
    public MetodoPagamento getMetodoPagamentoUtilizado() {
        return metodoPagamentoUtilizado;
    }

    /**
     * @param metodoPagamentoUtilizado the metodoPagamentoUtilizado to set
     */
    public void setMetodoPagamentoUtilizado(MetodoPagamento metodoPagamentoUtilizado) {
        this.metodoPagamentoUtilizado = metodoPagamentoUtilizado;
    }

    /**
     * @return the dataCompra
     */
    public LocalDate getDataCompra() {
        return dataCompra;
    }

    /**
     * @param dataCompra the dataCompra to set
     */
    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     * @return the prazoPagamento
     */
    public LocalDate getPrazoPagamento() {
        return prazoPagamento;
    }

    /**
     * @param prazoPagamento the prazoPagamento to set
     */
    public void setPrazoPagamento(LocalDate prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }


    
}
