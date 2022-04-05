public class Gerente extends Funcionario {
    
    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void autentificacao(int senha){

        if(this.senha == getSenha()){
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Acesso negado");
        }
    }

}
