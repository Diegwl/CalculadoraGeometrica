public class Paralelepipedo extends FigurasEspaciais{
    private final double arestaA, arestaB, arestaC;
    public Paralelepipedo(double arestaA, double arestaB, double arestaC){
        this.arestaA = arestaA;
        this.arestaB = arestaB;
        this.arestaC = arestaC;
    }

    @Override
    public double calculaArea(){
        return 2*(arestaA*arestaB + arestaA*arestaC + arestaB*arestaC);
    }

    @Override
    public double calculaVolume(){
        return arestaA*arestaB*arestaC;
    }
}
