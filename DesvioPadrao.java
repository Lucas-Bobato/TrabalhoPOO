public class DesvioPadrao {

    private double[] dados;

    public DesvioPadrao(double[] dados) {
        this.dados = dados;
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (double num : dados) {
            soma += num;
        }
        return soma / dados.length;
    }

    public double calcularDesvioPadrao() {
        double media = calcularMedia();
        double somaDiferencasAoQuadrado = 0.0;

        for (double num : dados) {
            somaDiferencasAoQuadrado += Math.pow(num - media, 2); // Math.pow é potenciação (base, expoente)
        }

        double variancia = somaDiferencasAoQuadrado / (dados.length - 1);
        return Math.sqrt(variancia);
    }

    public double[] getDados() {
        return dados;
    }

    public void setDados(double[] dados) {
        this.dados = dados;
    }
}
