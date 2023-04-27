public class Cone extends FigurasEspaciais{
    private final double raio, altura, geratriz;
    public Cone(double raio, double altura, double geratriz){
        this.raio = raio;
        this.altura = altura;
        this.geratriz = geratriz;
    }

    @Override
    public double calculaArea(){
        return (Math.PI * Math.pow(raio, 2)) + (Math.PI * raio * geratriz);
    }

    @Override
    public double calculaVolume(){
        return (1.0/3.0 * (Math.PI * Math.pow(raio, 2))) * altura;
    }
}
