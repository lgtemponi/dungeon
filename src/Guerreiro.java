public class Guerreiro {

    int pv = 3;
    boolean escudo = true;
    boolean armadura = true;
    boolean espada = true;
    boolean lanca = true;
    boolean santograal = true;
    boolean tocha = true;
    int decisaoEspada;
    int vitorias = 0;
    int derrotas = 0;

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public boolean isEscudo() {
        return escudo;
    }

    public void setEscudo(boolean escudo) {
        this.escudo = escudo;
    }

    public boolean isArmadura() {
        return armadura;
    }

    public void setArmadura(boolean armadura) {
        this.armadura = armadura;
    }

    public boolean isEspada() {
        return espada;
    }

    public void setEspada(boolean espada) {
        this.espada = espada;
    }

    public boolean isLanca() {
        return lanca;
    }

    public void setLanca(boolean lanca) {
        this.lanca = lanca;
    }

    public boolean isSantograal() {
        return santograal;
    }

    public void setSantograal(boolean santograal) {
        this.santograal = santograal;
    }

    public boolean isTocha() {
        return tocha;
    }

    public void setTocha(boolean tocha) {
        this.tocha = tocha;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDecisaoEspada() {
        return decisaoEspada;
    }

    public void setDecisaoEspada(int decisaoEspada) {
        this.decisaoEspada = decisaoEspada;
    }
}
