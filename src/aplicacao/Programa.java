package aplicacao;

import solucao1.PorPeso;
import solucao1.PorTamanho;
import solucao1.Produto;
import solucao2.Calculadora;
import solucao2.TipoEnvio;

public class Programa {

    public static void main(String[] args) {


        Produto p1 = new Produto(4.0, 3.3);
        PorTamanho pt = new PorTamanho();
        PorPeso pp = new PorPeso();

        System.out.println(pt.calcular(p1));
        System.out.println(pp.calcular(p1));

        solucao2.Produto p2 = new solucao2.Produto(5.0, 3.2, TipoEnvio.PESO);
        solucao2.Produto p3 = new solucao2.Produto(5.0, 3.2, TipoEnvio.TAMANHO);
        Calculadora c = new Calculadora();

        System.out.println(c.calcular(p2));
        System.out.println(c.calcular(p3));
    }
}