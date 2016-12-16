import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;


public class TestaPrototype {

	public static void main(String[] args) {
		String nome = "infoCristian";

		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("Curso");
		hashSet.add("Java");
		hashSet.add("InfoCristian");
		System.out.println(hashSet);
		
		Campanha campanha = new Campanha(nome , vencimento, hashSet);
		System.out.println(campanha);
		
		Campanha clone = campanha.clone();
		System.out.println(clone);
	}

}
