public class Circulo extends FigurasPlanas{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }
}
