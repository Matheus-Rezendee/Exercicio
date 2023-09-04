package solucao1;

public class Produto {

    private Double tamanho;
    private Double peso;

    public Produto() {
    }

    public Produto(Double tamanho, Double peso) {
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}