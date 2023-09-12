package src;

    public class Doador {
        String nome;
        String endereco;
        int telefone;

        String cidade;

        String email;

        int cpf;

        int DataNascimento;

        public Doador(String nome, String endereco, int telefone, String cidade, String email, int DataNascimento, int cpf) {

            this.nome = nome;

            this.endereco = endereco;

            this.telefone = telefone;

            this.cidade = cidade;

            this.email = email;

            this.DataNascimento = DataNascimento;

            this.cpf = cpf ;
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

        public int getTelefone() {
            return this.telefone;
        }

        public void setTelefone(int telefone) {
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

        public int getDataNascimento(int DataNascimento) {
            return this.DataNascimento;
        }

        public void setDataNascimento(int DataNascimento) {
            this.DataNascimento = DataNascimento;
        }

        public int getCpf(int cpf) {
            return this.DataNascimento;
        }

        public void setCpf(int cpf) {
            this.DataNascimento = cpf;
        }

    }

