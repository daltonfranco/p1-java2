public class Gerente extends Funcionario {
    
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentificacao(){
        return true;
    }

}
