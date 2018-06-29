
public class Perro extends Mamifero{

	
	
	public Perro(int cantidadDePatas) {
		super(cantidadDePatas);
		
	}

	@Override
	public String Hablar(String Palabra) {
		
		return Palabra;
	}

	@Override
	public String Caminar() {
		
		return "guau guau";
	}

	@Override
	public String Respirar() {
		
		return "guau";
	}

}
