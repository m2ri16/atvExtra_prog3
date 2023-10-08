public class Caixa{
    private int identificador;
    private String conteudo;
    private double pesoKg;
    private double alturaCm;

    public Caixa(int identificador, String conteudo, double pesoKg, double alturaCm) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.pesoKg = pesoKg;
        this.alturaCm = alturaCm;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg > 0) {
            this.pesoKg = pesoKg;
        } else {
            System.out.println("O peso deve ser maior que zero.");
        }
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        if (alturaCm > 0) {
            this.alturaCm = alturaCm;
        } else {
            System.out.println("A altura deve ser maior que zero.");
        }
    }

    public String exibir(){
       return("Identificador: " +  this.identificador + "\n" + 
       "Conteúdo: " + this.conteudo + "\n" + 
       "Peso em kg: " + this.pesoKg + "\n" + 
       "Altura em Cm:" + this.alturaCm + "\n");
    }

    
    

}