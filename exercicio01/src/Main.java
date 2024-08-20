public class Main {
    public static void main(String[] args) {
        // Criação de Variáveis
        int idade = 25; // Um número inteiro representando a idade de uma pessoa
        double altura = 1.75; // Um número decimal representando a altura em metros
        String nome = "João"; // Uma string representando o nome da pessoa
        boolean eEstudante = true; // Uma variável booleana para indicar se a pessoa é estudante

        // Atribuição de Valores
        // (Valores já foram atribuídos acima)

        // Operações Simples
        // Soma de duas idades
        int idadeAdicional = 30; // Exemplo de outra idade
        int somaIdades = idade + idadeAdicional;

        // Multiplicação da altura por um fator de 2
        double alturaDobrada = altura * 2;

        // Concatenação do nome com uma saudação
        String saudacao = "Olá, " + nome + "!";

        // Exibição de Resultados
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Nome: " + nome);
        System.out.println("É estudante? " + (eEstudante ? "Sim" : "Não"));
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Altura dobrada: " + alturaDobrada + " metros");
        System.out.println("Saudação: " + saudacao);
    }
}
