public class Cilindro extends Super implements  Volume{
    private double altura;

    public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
        super(coordenadaX, coordenadaY, raio);
        this.altura = altura;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Altura: " +altura + "\n";
        return aux;
    }

    @Override
    public double calcularArea() {
        return -2;
    }

    public double calcularVolume() {
        return -1;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
