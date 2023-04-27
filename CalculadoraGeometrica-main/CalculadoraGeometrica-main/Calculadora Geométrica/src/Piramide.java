public class Piramide extends FigurasEspaciais{
    private double ladoBase, altura;
    public Piramide(double ladoBase, double altura){
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    double geratriz = Math.pow(((ladoBase*ladoBase) + (altura*altura)),1.0/2.0);
    double areaBase = ladoBase*ladoBase;
    double areaLateral = (ladoBase*geratriz) / 3;

    @Override
    public double calculaArea(){
        return areaBase+(areaLateral*4);
    }

    @Override
    public double calculaVolume(){
        return (1.0/3.0)*(areaBase*altura);
    }
}
