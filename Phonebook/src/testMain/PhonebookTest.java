package testMain;
import phonebook.*;

public class PhonebookTest {

	public static void main(String[] args) {
		
		Rubrica rub = new Rubrica("Cellulare");
		
		Contatto c1 = new Contatto("Tizio","Qualunque","12345");
		Contatto c2 = new Contatto("Caio","Unico","67890");
		Contatto c3 = new Contatto("Maria","Maddalena","24680");
		
		rub.addContatto(c1);
		rub.addContatto(c2);
		rub.addContatto(c3);
		
		rub.getRubrica();	
		
		String tel=rub.getTelefono("Tizio","Qualunque");
		System.out.println("\n"+tel);
	}
}

