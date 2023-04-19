public class Retangulo extends FigurasPlanas{
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calculaArea(){
        return comprimento * largura;
    }

    @Override
    public double calculaPerimetro(){
        return (comprimento * 2) + (largura * 2);
    }
}
