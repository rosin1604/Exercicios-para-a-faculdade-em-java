public class Main {
    public static void main(String[] args) {
        // Criação de Variáveis
        String nome = "Maria"; // Nome da pessoa
        int idade = 30; // Idade da pessoa
        double salarioBrutoMensal = 5000.00; // Salário bruto mensal da pessoa
        int mesesTrabalhados = 12; // Quantidade de meses trabalhados em um ano
        int quantidadeProdutosComprados = 20; // Quantidade de produtos comprados
        double valorTotalCompras = 1000.00; // Valor total gasto nas compras

        // Atribuição de Valores
        // (Valores já foram atribuídos acima)

        // Operações Simples
        // Salário anual bruto
        double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados;

        // Desconto fixo
        double desconto = 2000.00;

        // Salário anual líquido
        double salarioAnualLiquido = salarioAnualBruto - desconto;

        // Média do valor gasto por produto
        double mediaValorPorProduto = valorTotalCompras / quantidadeProdutosComprados;

        // Concatenação de String com mensagem personalizada
        String mensagem = "Olá, " + nome + ". Seu salário anual líquido é R$ " + salarioAnualLiquido + ".";

        // Exibição de Resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto Mensal: R$ " + salarioBrutoMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Quantidade de Produtos Comprados: " + quantidadeProdutosComprados);
        System.out.println("Valor Total das Compras: R$ " + valorTotalCompras);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido: R$ " + salarioAnualLiquido);
        System.out.println("Média de Valor por Produto: R$ " + mediaValorPorProduto);
        System.out.println(mensagem);
    }
}
