import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;


public class Campanha implements Prototype<Campanha> {
  private String nome;
  private Calendar Vencimento;
  private Set<String> palavrasChave;

 public Campanha(String nome, Calendar vencimento, Set<String> palavrasChave){
	
	 this.nome = nome;
	 this.Vencimento = vencimento;
	 this.palavrasChave = palavrasChave;
	  
 }
  
  public String getNome(){
	  return nome;
  }

public Calendar getVencimento() {
	return Vencimento;
}



public Set<String> getPalavrasChave() {
	return palavrasChave;
}

public Campanha clone(){
	String nome = "Copia da Campanha:" +this.nome;
	Calendar vencimento = (Calendar) this.Vencimento.clone();
	Set<String> palavrasChave = new HashSet<String> (this.palavrasChave);
	Campanha campanha = new Campanha(nome, vencimento, palavrasChave);
	
	
	return campanha;
	
	
}
 public String ToString(){
	 StringBuffer buffer = new StringBuffer();
	 buffer.append("------------------------");
	 buffer.append("\n");
	 buffer.append("Nome da Campanha");
	 buffer.append(this.nome);
	 buffer.append("\n");
	 
	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
	 String format = simpleDateFormat.format(this.Vencimento.getTime());
	 buffer.append("Vencimento:" + format);
	 buffer.append("\n");
	 
	 buffer.append("Palavras-Chave:\n");
	 for (String palavraChave: this.palavrasChave){
		 buffer.append("-" + palavraChave);
		 buffer.append("\n");
	 }
	 
     buffer.append("--------------------------");
     buffer.append("\n");
	return buffer.toString();
 }
 
}