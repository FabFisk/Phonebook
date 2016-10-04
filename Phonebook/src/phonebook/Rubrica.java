package phonebook;
import java.util.*;

public class Rubrica {
	private String nome;
	private List<Contatto> elenco = new ArrayList<>();
	
	public Rubrica() {}
	public Rubrica (String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Contatto> getElenco() {
		return elenco;
	}
	public void setElenco(List<Contatto> elenco) {
		this.elenco = elenco;
	}

	public void addContatto(Contatto cont){
		elenco.add(cont);
	}
	
	public void getRubrica(){
		System.out.println("Rubrica: "+ this.nome);
		for(Contatto c: elenco){
			String nome, cognome, telefono;
			cognome = c.getCognome();
			nome = c.getNome();
			telefono = c.getTelefono();
			
			System.out.println("Cognome: "+cognome+
					"\tNome: "+nome +
					"\tTelefono: "+telefono);
		}
	}

	public String getTelefono(String cognome, String nome) {
		String tel = null;
		for(Contatto c: elenco){
			if(c.getNome().equals(nome) && c.getCognome().equals(cognome)){
				
				tel = c.getTelefono();
			}
		}
		return tel;
	}
}
