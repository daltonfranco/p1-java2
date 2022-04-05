public class Principal {
    
    public static void main(String[] args) {
        
        Gerente g = new Gerente();

        g.setNome("Dalton");
        g.setCpf("12312312345");
        g.setSalario(1200.0);
        g.setDepartamento("Tecnologia");
        g.setSenha(12332);
        

        System.out.println();

        System.out.println(g.getNome());
        System.out.println(g.getCpf());
        System.out.println(g.bonificacao());
        System.out.println(g.getSalario() + g.bonificacao());
        System.out.println(g.getDepartamento());
        g.autentificacao(12332);


        System.out.println();

        Funcionario f = new Funcionario();

        f.setNome("Roberto");
        f.setCpf("56756756789");
        f.setSalario(6200.0);
        f.setDepartamento("Administracao");

        System.out.println(f.getNome());
        System.out.println(f.getCpf());
        System.out.println(f.bonificacao());
        System.out.println(f.getSalario() + f.bonificacao());
        System.out.println(f.getDepartamento());

    }

}
