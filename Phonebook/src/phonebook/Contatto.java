package phonebook;

public class Contatto {
	private String cognome;
	private String nome;
	private String telefono;

	public Contatto() {}
	public Contatto (String cognome, String nome, String telefono){
		this.cognome = cognome;
		this.nome = nome;
		this.telefono = telefono;
	}

	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
