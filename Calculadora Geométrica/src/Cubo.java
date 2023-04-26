public class Cubo extends FigurasEspaciais{
    private final double aresta;
    public Cubo(double aresta){
        this.aresta = aresta;
    }

    @Override
    public double calculaArea(){
        return Math.pow(aresta, 2)*6;
    }

    @Override
    public double calculaVolume(){
        return Math.pow(aresta, 3);
    }

}
