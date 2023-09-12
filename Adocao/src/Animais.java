public class Animais {

    String NomeAnimal;
    Integer TipoAnimal;
    Integer IdadeAnimal;
    String ImagemAnimal;
    Integer IDUsuarioDoador;
    Integer Disponivel;

    public Animais(String NomeAnimal, Integer TipoAnimal, Integer IdadeAnimal, String ImagemAnimal, Integer IDUsuarioDoador, Integer Disponivel)
    {
        this.NomeAnimal = this.NomeAnimal;
        this.TipoAnimal = this.TipoAnimal;
        this.IdadeAnimal = this.IdadeAnimal;
        this.ImagemAnimal = this.ImagemAnimal;
        this.IDUsuarioDoador = this.IDUsuarioDoador;
        this.Disponivel = this.Disponivel;
    }

    public String getNomeAnimal() {
        return this.NomeAnimal;
    }
    public void setNomeAnimal(String NomeAnimal) {
        this.NomeAnimal = NomeAnimal;
    }

    public String getImagemAnimal() {
        return this.ImagemAnimal;
    }
    public void setImagemAnimal(String ImagemAnimal) {
        this.ImagemAnimal = ImagemAnimal;
    }

    public Integer getTipoAnimal() {
        return this.TipoAnimal;
    }
    public void setTipoAnimal(Integer TipoAnimal) {
        this.TipoAnimal = TipoAnimal;
    }

    public Integer getIdadeAnimal() {
        return this.IdadeAnimal;
    }
    public void setIdadeAnimal(Integer IdadeAnimal) {
        this.IdadeAnimal = IdadeAnimal;
    }

    public Integer getIDUsuarioDoador() {
        return this.IDUsuarioDoador;
    }
    public void setIDUsuarioDoador(Integer IDUsuarioDoador) {
        this.IDUsuarioDoador = IDUsuarioDoador;
    }

    public Integer getDisponivel() {
        return this.Disponivel;
    }
    public void setDisponivel(Integer Disponivel) {this.Disponivel = Disponivel;}

}
