

package src;

public class Receptor {
    String nome;
    String endereco;
    String telefone;

    String cidade;

    String email;

    String DataNascimento;

    public Receptor(String nome, String endereço, String telefone, String cidade, String email, String DataNascimento) {

        this.nome = nome;

        this.endereco = endereço;

        this.telefone = telefone;

        this.cidade = cidade;

        this.email = email;

        this.DataNascimento = DataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return this.endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getcidade(String cidade) {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento(String DataNascimento) {
        return this.DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

}
