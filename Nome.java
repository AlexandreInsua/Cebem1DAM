package plataforma;

/** Clase que mostra o meu nome por pantalla, o n�mero de letras que ten, tranf�rmao en mai�sculas e m�strao ao rev�s
 * 
 * @author Alexandre Insua Moreira
 * @version 1.1. 8/12/2016
 */
public class Nome {

	
	public static void main(String[] args) {
		String nome = "alexandre insua moreira";
	
		Nome a = new Nome();
				
		System.out.println (a.mostrarNome(nome));
		System.out.println("O meu nome ten "+a.mostrarLonxitude(nome) +" letras (cen espazos).");
		System.out.println("En mai�sculas � "+a.aMaiusculas(nome));
		System.out.println("O meu nome aor rev�s � " + a.inverter(nome));
	}

	public String mostrarNome(String cadea){
		String nome = cadea;
		return nome;
	}
	
	public int mostrarLonxitude(String cadea){
		int lonxitude = cadea.length(); 
		return lonxitude;
	}
	
	public String aMaiusculas(String cadea){
		String mai=cadea.toUpperCase();
		return mai;
	}
	
	public String inverter(String cadea){
		 	String invertida = "";
		for (int i=cadea.length()-1; i>=0;i--){
			invertida= invertida+ cadea.charAt(i);	
		}
		return invertida;
	}
}
