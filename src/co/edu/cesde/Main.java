package co.edu.cesde;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carro_clase mercedes= new Carro_clase();
        mercedes.arrancar();
        mercedes.placa = "ABC123";
        //para verificar que si quede grabado el cambio
        System.out.println(mercedes.placa);
        Carro_clase chevrolet = new Carro_clase();
        chevrolet.color = "rojo";
        chevrolet.placa= "BCD123";
        mercedes.color= "verde";
    }
}
