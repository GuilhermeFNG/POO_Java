import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Super> lista = new ArrayList<>();
        lista.add(new Cilindro(1,1,1,1));
        lista.add(new Circulo(1,1,1));
        lista.add(new Cilindro(2,2,2,2));

        for(Super forma : lista) {
            System.out.println(forma.getClass().getName()); // forma.toString()
            System.out.print(forma); // forma.toString()
            System.out.println("Área: " + forma.calcularArea());
            if(forma instanceof Cilindro) {
                System.out.println("Volume: " + ((Cilindro) forma).calcularVolume());
            }
            System.out.println("--------------------------");
        }


    }
}
