public class Quadrado extends FigurasPlanas{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea(){
        return Math.pow(lado, 2);
    }

    @Override
    public double calculaPerimetro(){
        return lado * 4;
    }
}
