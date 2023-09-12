    public class Login {
        String email;
        String senha;
        Integer IDUsuario;

        public Login(String email, String senha, Integer IDUsuario) {
            this.email = email;
            this.senha = senha;
            this.IDUsuario = IDUsuario;
        }

        public String getEmail() {
            return this.email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public Integer getIDUsuario() {
            return this.IDUsuario;
        }
        public void setIDUsuario(Integer IDUsuario) {
            this.IDUsuario = IDUsuario;
        }

        public String getSenha() {
            return this.senha;
        }
        public void setSenha(String senha) {
            this.senha = senha;
        }

        public boolean verificaUsuario() {
            boolean validacao = false;
            if (this.email.equals("email@email.com.br")) {
                if (this.senha.equals("senha1234")) {
                    System.out.println("\nLogin Realizado com sucesso!");
                    validacao = true;
                } else {
                    System.out.println("**Login incorreto**");
                }
            } else {
                System.out.println("Login incorreto");
                validacao = false;
            }

            return validacao;
        }
    }


