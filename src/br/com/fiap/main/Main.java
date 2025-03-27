package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciar novo objeto com base na DespesaFamiliar
        DespesaFamiliar novoCalculo = new DespesaFamiliar();
        // Instanciar objeto da classe Scan
        Scanner scan = new Scanner(System.in);

        try {
            // pegar inputs do usuário e implementar nos atributos do objeto novoCalculo instanciado da classe DespesaFamiliar
            System.out.println("Digite o total que a família recebe no mês: ");
            novoCalculo.rendaFamiliar = scan.nextDouble();
            System.out.println("Digite o número de moradores da casa: ");
            novoCalculo.numeroDeMoradores = scan.nextInt();
            System.out.println("Digite o gasto com luz: ");
            novoCalculo.gastoComLuz = scan.nextDouble();
            System.out.println("Digite o gasto com internet: ");
            novoCalculo.gastoComInternet = scan.nextDouble();
            System.out.println("Digite o valor da mensalidade da academia por pessoa: ");
            novoCalculo.valorMensalidadeDaAcademia = scan.nextDouble();
            // print dos dados em Format
            System.out.printf("Dados Fornecidos:\nRenda Familiar Bruta: %.3f\nNúmero de moradores da casa: %d\nGasto mensal da casa com luz: %.3f\nGasto mensal da casa com internet: %.3f\nGasto mensal da casa com academia: %.3f\n Total em gastos mensais: %.3f\nRenda Familiar Líquida: %.3f", novoCalculo.rendaFamiliar, novoCalculo.numeroDeMoradores, novoCalculo.gastoComLuz, novoCalculo.gastoComInternet, novoCalculo.valorMensalidadeDaAcademia, novoCalculo.calcularTotalDeDespesas(), novoCalculo.calcularRendaFamiliarLiquida());

//  Se tiver erro, vai vir pra cá e printa a mensagem de erro
        } catch (Exception e) {
            System.out.println("Formato de dado inválido");
        }
    }
}
