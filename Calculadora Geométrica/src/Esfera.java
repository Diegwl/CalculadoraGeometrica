public class Esfera extends FigurasEspaciais{
    private double raio;
    public Esfera(double raio){
        this.raio = raio;
    }


    @Override
    public double calculaArea(){
        return 4.0/3.0 * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public double calculaVolume(){
        return 4 * Math.PI * Math.pow(raio, 2);
    }
}
