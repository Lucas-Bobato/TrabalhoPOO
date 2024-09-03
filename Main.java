public class Main {
    public static void main(String[] args) {
        EquacaoSegundoGrau c1 = new EquacaoSegundoGrau(1, 3, -4);

        System.out.println("----------- || -----------");
        System.out.println("Resultado Equação de Segundo Grau");
        var conta = c1.calcular();
        System.out.println(conta);
        System.out.println("----------- || -----------");

        double[] dados = {2, 4, 4, 4, 5, 5, 7, 9};
        DesvioPadrao desvioPadrao = new DesvioPadrao(dados);
        double resultado = desvioPadrao.calcularDesvioPadrao();
        System.out.println("Resultado Desvio de Padrão");
        System.out.println("O desvio de padrão é " + resultado);
        System.out.println("----------- || -----------");

        double capitalInicial = 1000.0;
        double taxaJuros = 0.05;
        int tempo = 5;
        int frequencia = 12;

        JurosCompostos jurosCompostos = new JurosCompostos(capitalInicial, taxaJuros, tempo, frequencia);
        double montante = jurosCompostos.calcularMontante();
        double juros = jurosCompostos.calcularJuros();

        System.out.println("Resultado Cálculo de Juros Compostos");
        System.out.println("Montante total após " + tempo + " anos: R$ " + String.format("%.2f", montante));
        System.out.println("Valor dos juros: R$ " + String.format("%.2f", juros));
        System.out.println("----------- || -----------");
    }

}