import java.util.ArrayList;
import java.util.List;

public class Monstro {
    private String nome;
    private int poder;
    private String fraqueza1;
    private String fraqueza2;

    public Monstro(String nome, int poder, String fraqueza1, String fraqueza2) {
        this.nome = nome;
        this.poder = poder;
        this.fraqueza1 = fraqueza1;
        this.fraqueza2 = fraqueza2;
    }

    public Monstro(String nome) {
        this.nome = nome;
    }

    public Monstro() {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPoder() {
        return poder;
    }
    public void setPoder(int poder) {
        this.poder = poder;
    }
    public String getFraqueza1() {
        return fraqueza1;
    }
    public void setFraqueza1(String fraqueza1) {
        this.fraqueza1 = fraqueza1;
    }
    public String getFraqueza2() {
        return fraqueza2;
    }
    public void setFraqueza2(String fraqueza2) {
        this.fraqueza2 = fraqueza2;
    }

    public List<Monstro> createPilha() {
        List<Monstro> pilha = new ArrayList<Monstro>();
        pilha.add(new Monstro("Monstro 1", 1, "tocha", ""));
        pilha.add(new Monstro("Monstro 1", 1, "tocha", ""));
        pilha.add(new Monstro("Monstro 2", 2, "santo-graal", "tocha"));
        pilha.add(new Monstro("Monstro 2", 2, "santo-graal", "tocha"));
        pilha.add(new Monstro("Monstro 3", 3, "tocha", ""));
        pilha.add(new Monstro("Monstro 3", 3, "tocha", ""));
        pilha.add(new Monstro("Monstro 4", 4, "santo-graal", ""));
        pilha.add(new Monstro("Monstro 4", 4, "santo-graal", ""));
        pilha.add(new Monstro("Monstro 5", 5, "", ""));
        pilha.add(new Monstro("Monstro 5", 5, "", ""));
        pilha.add(new Monstro("Monstro 6", 6, "santo-graal", ""));
        pilha.add(new Monstro("Monstro 7", 7, "", ""));
        pilha.add(new Monstro("Monstro 9", 9, "lanca", ""));
        return pilha;
    }
}
