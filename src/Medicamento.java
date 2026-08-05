public class Medicamento {
    private String nome;
    private Double preco;
    private Boolean precisaReceita;
    private Integer quantidadeDisponivel;


    public Medicamento(String nome,Double preco,Boolean precisaReceita,Integer quantidadeDisponivel){
        this.nome = nome;
        this.preco = preco;
        this.precisaReceita = precisaReceita;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDisponivel() {
        return this.quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Boolean getPrecisaReceita() {
        return precisaReceita;
    }

    public void setPrecisaReceita(Boolean precisaReceita) {
        this.precisaReceita = precisaReceita;
    }

    @Override
    public String toString() {
        return  "Nome do remédio:"+this.nome+"\n"+
                "Preço R$"+this.preco+"\n"+
                "Necessita de receita? "+this.precisaReceita+"\n"+
                "Quantidade disponível:"+this.quantidadeDisponivel+"\n";
    }
}
