public class Arquivo {
    private String nome, conteudo;
    private int tamanho;

    public Arquivo(String nome) {
        this.nome = nome;
        conteudo = "";
        tamanho = 0;
    }

    public void editar(String conteudo, String nome) {
        this.nome = nome;
        this.conteudo += conteudo;
        bytes();
    }

    // Sobrecarga do método editar, para caso só for editado o conteudo
    public void editar(String conteudo) {
        this.conteudo += conteudo;
        bytes();
    }

    public void limparArquivo() {
        conteudo = "";
        bytes();
    }

    private void bytes() {
        tamanho = conteudo.length();
    }

    public String abrir() {
        return "Arquivo {" +
                "nome='" + nome + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
