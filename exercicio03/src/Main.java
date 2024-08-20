import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Criação de Variáveis
        String nomeProduto = "Notebook"; // Nome do produto
        double precoUnitario = 2999.99; // Preço unitário do produto
        int quantidadeComprada = 3; // Quantidade de produtos comprados
        double taxaImposto = 0.15; // Taxa de imposto sobre o produto (15%)
        double margemLucro = 0.20; // Margem de lucro desejada (20%)

        // Atribuição de Valores
        // (Valores já foram atribuídos acima)

        // Operações Simples
        // Valor total sem impostos
        double valorTotalSemImpostos = precoUnitario * quantidadeComprada;

        // Valor do imposto
        double valorImposto = valorTotalSemImpostos * taxaImposto;

        // Valor total com impostos
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;

        // Preço de venda necessário para alcançar a margem de lucro desejada
        double precoVendaNecessario = valorTotalComImpostos / (1 - margemLucro);

        // Desafio Extra: Arredondar para duas casas decimais e formatar como moeda
        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");

        String valorTotalComImpostosFormatado = formatoMoeda.format(valorTotalComImpostos);
        String precoVendaFormatado = formatoMoeda.format(precoVendaNecessario);

        // Mensagem final formatada
        String mensagemFinal = String.format("Produto: %s\nValor Total com Impostos: %s\nPreço de Venda Sugerido: %s",
                nomeProduto, valorTotalComImpostosFormatado, precoVendaFormatado);

        // Exibição de Resultados
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: " + formatoMoeda.format(precoUnitario));
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Taxa de Imposto: " + (taxaImposto * 100) + "%");
        System.out.println("Margem de Lucro: " + (margemLucro * 100) + "%");
        System.out.println("Valor Total Sem Impostos: " + formatoMoeda.format(valorTotalSemImpostos));
        System.out.println("Valor do Imposto: " + formatoMoeda.format(valorImposto));
        System.out.println("Valor Total com Impostos: " + valorTotalComImpostosFormatado);
        System.out.println("Preço de Venda Necessário: " + precoVendaFormatado);
        System.out.println(mensagemFinal);
    }
}
