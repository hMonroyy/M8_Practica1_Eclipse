import java.io.*;

/*
  
Calcula el precio final de un producto después de aplicar un descuento.
El precio inicial y el tanto por ciento de descuento se leen del teclado.
El precio final debe estar redondeado a los céntimos de euro.
  
 Crea un método double calculaPrecio(double precio, double dto)
  
Salida del programa
----------------------------------------
Entra el precio inicial : 123.6
Entra el descuento : 3
El precio final es 119.89
  
*/

public class E02_Descuento {

	double calcPrecio (double precio, double desc) {
		double preFin = 0;
		preFin = precio - ((precio*desc)/100);
		preFin = preFin * 100;
		preFin = Math.round(preFin);
		preFin = preFin / 100;
		return preFin;		
	}
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		E02_Descuento programa = new E02_Descuento();
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Aplicar descuento a productos, creado por Héctor Monroy");
		System.out.println("========================================================");
		
		System.out.println("Entra el precio inicial: ");
		double preIni = Double.parseDouble(entrada.readLine());
		
		System.out.println("Entra el descuento: ");
		double descuento = Double.parseDouble(entrada.readLine());
		
		double preFin = programa.calcPrecio(preIni, descuento);
		System.out.println("El precio final es: " +preFin+ "€");
		
	}

}
