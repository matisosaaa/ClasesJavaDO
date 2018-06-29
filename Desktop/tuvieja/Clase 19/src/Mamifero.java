
public abstract class Mamifero {

	private int cantidadDePatas;
	
	public abstract String Hablar(String Palabra);
	public abstract String Caminar();
	public abstract String Respirar();
	
	
	public Mamifero(int cantidadDePatas) {
		this.cantidadDePatas = cantidadDePatas;
	} 
	public int getCantidadDePatas() {
		return cantidadDePatas;
	}
	
}
