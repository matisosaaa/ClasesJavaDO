import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner patas = new Scanner(System.in);
		Scanner palabra = new Scanner(System.in);
		
		System.out.println("El menú mistico");
		System.out.println("Que mamifero desea crear hoy?");
		System.out.println("1 --> Perro \n2 --> Gato \n3 --> Humano");
		
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Cuantas patas desea que tenga su perro?");
			Perro primerPerro = new Perro(patas.nextInt());
			System.out.println("Excelente majestad, lo hemos creado \nEl mismo sabe hablar, caminar y respirar.");
			System.out.println(primerPerro.Hablar("guau guau guau dame comida forro guau guau guau"));
			break;
		
		default:
			break;
		}
	}

}
