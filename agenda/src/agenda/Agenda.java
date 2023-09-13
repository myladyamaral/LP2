package agenda;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
	//array de contatos
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	//adicionar contato pessoa fisica e p pessoa juridica
	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}
	
	public void removerContato(){}
//	public Contato pesquisarContato() {}
	
	public void imprimirAgenda() {
		for (int i = 0; i<contatos.size();i++) {
			System.out.println("Nome: "+contatos.get(i).getNome()+"\n"
					+"Endereço: "+ contatos.get(i).getNome()+"\n"
					+ "Email: "+ contatos.get(i).getEmail());
			
		}
	}
}
