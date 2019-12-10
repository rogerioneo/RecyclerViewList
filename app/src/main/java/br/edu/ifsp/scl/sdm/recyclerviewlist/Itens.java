package br.edu.ifsp.scl.sdm.recyclerviewlist;

public class Itens {

    private String titulo;
    private String subtitulo;
    private Double valor;
    private int imagem;

    public Itens(String titulo, String subtitulo, Double valor, int imagem) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.valor = valor;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subtitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subtitulo = subtitulo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
