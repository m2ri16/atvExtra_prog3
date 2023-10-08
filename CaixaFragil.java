public class CaixaFragil extends Caixa {
    
    private double pesoMax;

    public CaixaFragil(int identificador, String conteudo, double pesoKg, double alturaCm, double pesoMax){
        super(identificador, conteudo, pesoKg, alturaCm);
        this.pesoMax = pesoMax;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        if (pesoMax > 0) {
            this.pesoMax = pesoMax;
        } else {
            System.out.println("O peso deve ser maior que zero.");
        }
    }

    public String exibir(){
        String exibir = super.exibir();
         return("Peso maximo suportrado em kg: " + this.pesoMax + "\n");
    }

}
