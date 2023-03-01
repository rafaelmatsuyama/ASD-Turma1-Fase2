package aula1;

public class Casa implements Planta {
    public final String corDaParede;
    private int noDorm;
    private String nomeProprietario;

    private int metragem;



    //public static void marketing(){
    //    System.out.println("Venha visitar essas maravilhosas casas do bairro mais nobre da cidade!");
    //}
    public Casa(String corDaParede, int noDorm, String nomeProprietario){
        this.corDaParede = corDaParede;
        this.noDorm = noDorm;
        this.nomeProprietario = nomeProprietario;
        //System.out.println("Construindo casa com a cor: " + corDaParede);
        //System.out.println("E com " + noDorm + " dormitórios!");
        //System.out.println("Cujo dono(a) se chama: " + nomeProprietario);
    }
    public final String getCorDaParede() {
        return corDaParede;
    }

    //public void setCorDaParede(String corDaParede) {
    //    this.corDaParede = corDaParede;
    //}

    public int getNoDorm() {
        return noDorm;
    }

    public void setNoDorm(int noDorm) {
        this.noDorm = noDorm;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    @Override
    public int getMetragem() {
        return metragem;
    }

    @Override
    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }
}
