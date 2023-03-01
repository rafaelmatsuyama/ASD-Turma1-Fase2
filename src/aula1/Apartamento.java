package aula1;

public class Apartamento extends Casa {
    private int noBloco;
    private int noApart;
    public Apartamento(String corDaParede, int noDorm, String nomeProprietario) {
        super(corDaParede, noDorm, nomeProprietario);
    }

    public int getNoBloco() {
        return noBloco;
    }

    public void setNoBloco(int noBloco) {
        this.noBloco = noBloco;
    }

    public int getNoApart() {
        return noApart;
    }

    public void setNoApart(int noApart) {
        this.noApart = noApart;
    }
}
