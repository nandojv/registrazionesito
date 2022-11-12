package corsoiniziodacapo;

public class utenti {

	public String nome;
	public String cognome;
	public String email;
	public String controllo;
	
	
	utenti(String nome,String cognome,String email,String controllo){
		
		this.nome=nome;
		this.cognome=cognome;
		this.email=email;
		this.controllo=controllo;
		
	}
	public String toString() {
	return "utente registrato";
	
	}
	
}
