public class TestaCarro
{
	public static void main(String[] args) {
		Carro c1 = new Carro("Toyota", "Corolla", -2025);
		Carro c2 = new Carro("BMW", "XC3", 1823);
        //c1.alteraMarca("SW4");
		c1.imprimirCarro();
		c2.imprimirCarro();
	}
}
