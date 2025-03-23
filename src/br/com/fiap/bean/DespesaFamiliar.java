// Enzo Gaião Real - RM557943, Gabriel Terra Lilla dos Santos - RM554575, Vitor Couto Victorino - RM554965
package br.com.fiap.bean;

public class DespesaFamiliar {
    // instansiação de atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;
    // Métodos
    public double calcularTotalDeDespesas(){
        return gastoComLuz + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);
    }
    public double calcularRendaFamiliarLiquida(){
        return rendaFamiliar - calcularTotalDeDespesas();
    }
}
