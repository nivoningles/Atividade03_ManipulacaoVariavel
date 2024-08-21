import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        String nomeDoProduto = "Gasolina";
        double precoDoProdutoSemImpostos = 2.9;
        double quantDeProdutosComprados = 16870;
        double taxaDoProduto = (float) 61 /100;
        double margemDoProduto = 27;
        double taxaDeLucro = (float) margemDoProduto/100;

        double valorTotalPagoSemImpostos = (float) precoDoProdutoSemImpostos*quantDeProdutosComprados;
        double valorTotalPagoComImposto = (float) ((valorTotalPagoSemImpostos * taxaDoProduto)+valorTotalPagoSemImpostos);
        double precoDoProdutoComImposto = (float) (precoDoProdutoSemImpostos * taxaDoProduto)+precoDoProdutoSemImpostos;
        double valorDeVendaDaUnidadeComMargemDeLucroEImposto = (float) ((precoDoProdutoComImposto*taxaDeLucro)+precoDoProdutoComImposto);
        double valorTotalPagoComImpostoELucroPrecoDeVenda = (float) (valorDeVendaDaUnidadeComMargemDeLucroEImposto*quantDeProdutosComprados);

        DecimalFormat df = new DecimalFormat("#.00");
        String valorDeVendaDaUnidadeComMargemDeLucroEImpostoFormatado = df.format(valorDeVendaDaUnidadeComMargemDeLucroEImposto);
        String valorTotalPagoComImpostoFormatado = df.format(valorTotalPagoComImposto);
        String valorTotalPagoComImpostoELucroPrecoDeVendaFormatado = df.format(valorTotalPagoComImpostoELucroPrecoDeVenda);
        String margemDoProdutoFormatado = df.format(margemDoProduto);
        String quantDeProdutosCompradosFormatado = df.format(quantDeProdutosComprados);

        String mensagemFinal = "\n Ola! Na compra de "+quantDeProdutosCompradosFormatado+" Litros de "+nomeDoProduto + " o valor total pago com impostos foi: "+valorTotalPagoComImpostoFormatado+" \n Sugerimos que venda por "+valorTotalPagoComImpostoELucroPrecoDeVendaFormatado+" para obter uma margem de lucro de "+ margemDoProdutoFormatado+"%"+"\n Então a valor do litro deve ser vendido por "+valorDeVendaDaUnidadeComMargemDeLucroEImpostoFormatado+" para ter essa margem de lucro.";

        System.out.println(mensagemFinal);
        System.out.println("\n Todas as Variaveis 'printadas'------\n");

        System.out.println("Nome do Produto: "+nomeDoProduto);
        System.out.println("Quantidade de Produtos Comprados: "+quantDeProdutosComprados+" Litros");
        System.out.println("Imposto do Produto: "+taxaDoProduto);
        System.out.println("Margem do Produto: "+margemDoProduto);
        System.out.println("Valor de Venda Da Unidade do Produto com Margem de Lucro: "+valorDeVendaDaUnidadeComMargemDeLucroEImposto);
        System.out.println("Valor Total pago com Impostos Formatado: "+valorTotalPagoComImpostoFormatado);
        System.out.println("Valor Total Da Venda Com Lucros: "+valorTotalPagoComImpostoELucroPrecoDeVenda);
        System.out.println("Preço do Prduto Sem Impostos: "+precoDoProdutoSemImpostos);
        System.out.println("Margem de Lucro: "+taxaDeLucro);
        System.out.println("Valor Total Sem Impostos: "+valorTotalPagoSemImpostos);
        System.out.println("Valor Total Com Impostos: "+valorTotalPagoComImposto);
        System.out.println("Preço do Produto Com Impostos: "+precoDoProdutoComImposto);
        System.out.println("Valor de Venda Da Unidade do Produto com Margem de Lucro Formatado: "+valorDeVendaDaUnidadeComMargemDeLucroEImpostoFormatado);
        System.out.println("Valor Total Da Venda Com Lucros Formatado: "+valorTotalPagoComImpostoELucroPrecoDeVendaFormatado);
        System.out.println("Margem do Produto Formatado: "+margemDoProdutoFormatado);
        System.out.println("Quantidade de Produtos Comprados Formatado: "+quantDeProdutosCompradosFormatado+" Litros");

    }
}