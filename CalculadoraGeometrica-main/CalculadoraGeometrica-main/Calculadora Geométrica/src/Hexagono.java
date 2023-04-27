public class Hexagono extends FigurasPlanas{
    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea(){
        return (3 * Math.pow(lado, 2) * Math.pow(3, 0.5)) / 2;
    }

    @Override
    public double calculaPerimetro(){
        return lado * 6;
    }
}
