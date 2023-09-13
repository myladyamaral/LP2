package agenda;

public class App {

	public static void main(String[] args) {
		//faça um menu com as opções adicionar contato, remover e pesquisar
		
		Agenda ag =  new Agenda();
		
		PessoaFisica c = new PessoaFisica();
		ag.adicionarContato(c);
		
		System.out.println(c.getCpf());

	}

}
