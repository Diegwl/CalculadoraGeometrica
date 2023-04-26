public class Cilindro extends FigurasEspaciais{
    private double raio, altura;
    public Cilindro(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }


    @Override
    public double calculaArea(){
        return (2 * (Math.PI * Math.pow(raio, 2))) + (2 * Math.PI * raio * altura);
    }

    @Override
    public double calculaVolume(){
        return (Math.PI * Math.pow(raio, 2)) * altura;
    }
}
