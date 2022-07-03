public class TesteJavaBean {

    public static void main(String[] args) {
        PessoaBean pessoa = new PessoaBean();
        pessoa.setNome("Mary");
        pessoa.setIdade(27);

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos. ");
    }
}
