public class Contato {
    private String nome;
    private String telefone;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibeContato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
    }


}
