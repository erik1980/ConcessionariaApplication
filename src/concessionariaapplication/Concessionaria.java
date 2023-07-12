/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concessionariaapplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erik
 */
public class Concessionaria {

    private String nomeEmpresa;

    private int numeroItentificacaoFiscal;

    private final List<Veiculo> listaVeiculos = new ArrayList<>();

    private final List<Contrato> listaContratos = new ArrayList<>();

    private final List<Vendedor> listaVendedores = new ArrayList<>();

    private final List<Cliente> listaClientes = new ArrayList<>();

    public Concessionaria(String nomeEmpresa, int numeroItentificacaoFiscal) {
        this.nomeEmpresa = nomeEmpresa;
        this.numeroItentificacaoFiscal = numeroItentificacaoFiscal;
    }

    private Veiculo findVeiculoByCodigo(int codigo) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getCodigo() == codigo) {
                return veiculo;
            }

        }
        return null;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        listaVeiculos.add(veiculo);
    }

    public void adicionarVeiculo(int codigo, String marca, String modelo, int ano,
            String cor, int numeroPortas, int numeroAssentos, float preco,
            Motor motor) {
        Veiculo veiculo = new Veiculo(codigo, marca, modelo, ano, cor,
                numeroPortas, numeroAssentos, preco, motor);
        adicionarVeiculo(veiculo);
    }

    public void adicionarVeiculo(int codigo, String marca, String modelo, int ano,
            String cor, int numeroPortas, int numeroAssentos, float preco,
            String marcaMotor, int cilindrada, float torque, float peso, float autonomia,
            float capacidadeBateria) {
        Motor motor = new MotorEletrico(capacidadeBateria, marca, cilindrada,
                torque, peso, autonomia);
        adicionarVeiculo(codigo, marca, modelo, ano, cor, numeroPortas,
                numeroAssentos, preco, motor);

    }

    public void adicionarVeiculo(int codigo, String marca, String modelo, int ano,
            String cor, int numeroPortas, int numeroAssentos, float preco,
            String marcaMotor, int cilindrada, float torque, float peso, float autonomia,
            TipoCombustivel tipoCombustivel) {
        Motor motor = new MotorCombustao(tipoCombustivel, marca, cilindrada, torque,
                peso, autonomia);
        adicionarVeiculo(codigo, marca, modelo, ano, cor, numeroPortas, numeroAssentos,
                preco, motor);

    }

    public void atualizarVeiculo(int codigo, String marca, String modelo, int ano,
            String cor, int numeroPortas, int numeroAssentos, float preco,
            Motor motor) {
        Veiculo veiculo = findVeiculoByCodigo(codigo);
        veiculo.setAno(ano);
        veiculo.setCor(cor);
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setMotor(motor);
        veiculo.setNumeroAssentos(numeroAssentos);
        veiculo.setNumeroPortas(numeroPortas);
        veiculo.setPreco(preco);

    }

    public void removerVeiculo(int codigo) {
        Veiculo veiculo = findVeiculoByCodigo(codigo);
        listaVeiculos.remove(veiculo);
    }

    public void adicionarContrato(int numeroContrato, MetodoPagamento metodoPagamentoUtilizado,
            LocalDate dataCompra, LocalDate prazoPagamento, String nicCliente,
            String nicVendedor, int codigoVeiculo) {
        Veiculo veiculo = findVeiculoByCodigo(codigoVeiculo);
        Vendedor vendedor = findVendedorByNIC(nicVendedor);
        Cliente cliente = findClienteByNIC(nicCliente);
        Contrato contrato = new Contrato(numeroContrato, metodoPagamentoUtilizado,
                dataCompra, prazoPagamento, cliente, veiculo, vendedor);
        listaContratos.add(contrato);
    }

    public void atializarContrato(int numeroContrato, MetodoPagamento metodoPagamentoUtilizado,
            LocalDate dataCompra, LocalDate prazoPagamento, String nicCliente,
            String nicVendedor, int codigoVeiculo) {
        Veiculo veiculo = findVeiculoByCodigo(codigoVeiculo);
        Vendedor vendedor = findVendedorByNIC(nicVendedor);
        Cliente cliente = findClienteByNIC(nicCliente);
        Contrato contrato = findContratoByNumero(numeroContrato);
        contrato.setCliente(cliente);
        contrato.setDataCompra(dataCompra);
        contrato.setMetodoPagamentoUtilizado(metodoPagamentoUtilizado);
        contrato.setVeiculo(veiculo);
        contrato.setVendedor(vendedor);
        contrato.setPrazoPagamento(prazoPagamento);

    }

    private void cancelarContrato(int numeroContrato) {
        Contrato contrato = findContratoByNumero(numeroContrato);
        listaContratos.remove(contrato);
    }

    private Contrato findContratoByNumero(int numeroContrato) {
        for (Contrato contrato : listaContratos) {
            if (contrato.getNumeroContrato() == numeroContrato) {
                return contrato;
            }

        }
        return null;

    }

    private Cliente findClienteByNIC(String nic) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getNumeroIdentificacaoCivil().equals(nic)) {
                return cliente;
            }

        }
        return null;
    }

    private Vendedor findVendedorByNIC(String nic) {
        for (Vendedor vendedor : listaVendedores) {
            if (vendedor.getNumeroIdentificacaoCivil().equals(nic)) {
                return vendedor;
            }

        }
        return null;
    }

    public Veiculo obterVeiculoMaiorEficiencia() {
        Veiculo veiculo = listaVeiculos.get(0);
        for (int i = 1; i < listaVeiculos.size(); i++) {
            if (listaVeiculos.get(i).obterEficienciaMotor() > veiculo.obterEficienciaMotor()) {
                veiculo = listaVeiculos.get(i);
            }
        }
        return veiculo;

    }

//    public Veiculo obterVeiculoMaisVendido(){
//        int quantidadeMaiorVendido =-1; 
//        Veiculo veiculoMaisVendido = null;
//        for(Veiculo veiculo : listaVeiculos){
//            int quantidade = 0;
//            for (Contrato contrato : listaContratos) {
//                if(contrato.getVeiculo().getCodigo() == veiculo.getCodigo()){
//                    quantidade++;                
//                }                                
//            }
//            if(quantidade > quantidadeMaiorVendido){
//                veiculoMaisVendido = veiculo;
//            }        
//        }
//        return veiculoMaisVendido;    
//    }
    private int obterQuantidadeVezesVendidos(Veiculo veiculo) {
        int quantidade = 0;
        for (Contrato contrato : listaContratos) {
            if (contrato.getVeiculo().getCodigo() == veiculo.getCodigo()) {
                quantidade++;
            }

        }
        return quantidade;
    }

    public Veiculo obterVeiculoMaisVendido() {
        Veiculo veiculoMaisVendido = listaVeiculos.get(0);
        int quantidadeMaiorVendido = obterQuantidadeVezesVendidos(veiculoMaisVendido);
        for (Veiculo veiculo : listaVeiculos) {
            int quantidade = obterQuantidadeVezesVendidos(veiculo);
            if (quantidade > quantidadeMaiorVendido) {
                veiculoMaisVendido = veiculo;
            }

        }
        return veiculoMaisVendido;
    }
//    
//    public List<Veiculo> obterVeiculosEletricos(String marca, int numeroAsientos){
//        List<Veiculo> veiculosEletricos = new ArrayList<>();
//        for (Veiculo veiculo : listaVeiculos) {
//            if(veiculo.isEletrico()){
//                veiculosEletricos.add(veiculo);
//            
//            }
//            
//        }
//        return veiculosEletricos;    
//    }

//    public List<Veiculo> obterVeiculosEletricos(String marca, int numeroAsientos) {
//        List<Veiculo> veiculosEletricos = new ArrayList<>();
//        for (Veiculo veiculo : listaVeiculos) {
//            if (veiculo.getMotor() instanceof MotorEletrico) {
//                veiculosEletricos.add(veiculo);
//
//            }
//
//        }
//        return veiculosEletricos;
//    }
    public List<Veiculo> obterVeiculosEletricos(String marca, int numeroAsientos) {
        List<Veiculo> veiculosEletricos = new ArrayList<>();
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getTipoMotor().equals(TipoMotor.ELETRICO)) {
                veiculosEletricos.add(veiculo);

            }

        }
        return veiculosEletricos;
    }
    public List<Contrato> obterContratos(Vendedor v){
        List<Contrato> contratosVendedor = new ArrayList<>();
        for (Contrato contrato : listaContratos) {
            Vendedor vendedor = contrato.getVendedor();
            if(vendedor.getNumeroIdentificacaoCivil().equals(v.getNumeroIdentificacaoCivil())){
                contratosVendedor.add(contrato);
            
            }
            
        }
        return contratosVendedor;
        
    }
}
