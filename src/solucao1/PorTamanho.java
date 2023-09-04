package solucao1;

public class PorTamanho implements Calc{

    @Override
    public double calcular(Produto produto) {
        return produto.getTamanho() * 1.5;
    }
}