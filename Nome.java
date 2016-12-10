package plataforma;

/** Clase que mostra o meu nome por pantalla, o número de letras que ten, tranfórmao en maiúsculas e móstrao ao revés
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
		System.out.println("En maiúsculas é "+a.aMaiusculas(nome));
		System.out.println("O meu nome aor revés é " + a.inverter(nome));
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
