public class Papagaio {
    private String nome;
    public int idade;
    private String cor;
    public String raca;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void cantar() {
        System.out.println("O papagaio está cantando!");
    }
}
