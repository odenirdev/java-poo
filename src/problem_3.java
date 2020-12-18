import java.util.LinkedList;

class GerenciadorDeImpostoDeRenda {
    private LinkedList<Double> tributaveis = new LinkedList<Double>();
    private double total = 0;

    public double getTotal() {
        return total;
    }

    public void adicionar(double tributavel) {
        this.tributaveis.add(tributavel);

        this.total += tributavel;
    }

    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda g1 = new GerenciadorDeImpostoDeRenda();
    }
}
