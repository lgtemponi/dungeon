import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dungeon {


    public static void main(String[] args) {

        int countMonstros = 0;
        Guerreiro guerreiro = new Guerreiro();
        Monstro iniciar = new Monstro();
        List<Monstro> monstros = iniciar.createPilha();
        List<Monstro> conhecidos = new ArrayList<Monstro>();
        List<Integer> indiceDesconhecios = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        StringTokenizer st;
        String token, leitura;
        List<Monstro> possibildadesDaEspada = new ArrayList<Monstro>();

        while (true) {

            System.out.println();
            System.out.println("===> Digite sua Acao <===");

            leitura = s.nextLine();
            st = new StringTokenizer(leitura);
            token = st.nextToken();

            if(token.equals("q")){
                System.exit(0);
            }

            if(token.equals("?")){
                System.out.println("[1-7,9]: digite o poder do monstro para coloca-lo na masmorra");
                System.out.println("[item m]: digite o nome do item e o poder do monstro para remover item (ex: armadura 7)");
                System.out.println("[t]: digite t para testar probabilidades");
                System.out.println("[d]: digite d quando seus adversarios colocarem um monstro desconhecido na masmorra");
                System.out.println("[item]: digite o nome do item quando seus adversarios retirarem um item");
                System.out.println("[d]: digite d quando seus adversarios colocarem um monstro desconhecido na masmorra");
                System.out.println("[?]: ver essas instrucoes novamentes");
                System.out.println("[q]: sair");
                System.out.println("Itens: armadura, escudo, tocha, graal, espada, lanca");
                System.out.println();
                continue;
            }

            if (token.equals("1")) {
                for (Monstro c : monstros) {
                    if (c.getNome().equals("Monstro 1")) {
                        conhecidos.add(c);
                        monstros.remove(c);
                        countMonstros++;
                        break;
                    }
                }
            }

            if (token.equals("2")) {
                for (Monstro c : monstros) {
                    if (c.getNome().equals("Monstro 2")) {
                        conhecidos.add(c);
                        monstros.remove(c);
                        countMonstros++;
                        break;
                    }
                }
            }

            if (token.equals("3")) {
                for (Monstro c : monstros) {
                    if (c.getNome().equals("Monstro 3")) {
                        conhecidos.add(c);
                        monstros.remove(c);
                        countMonstros++;
                        break;
                    }
                }
            }

            if (token.equals("4")) {
                for (Monstro c : monstros) {
                    if (c.getNome().equals("Monstro 4")) {
                        conhecidos.add(c);
                        monstros.remove(c);
                        countMonstros++;
                        break;
                    }
                }
            }

            if (token.equals("5")) {
                for (Monstro c : monstros) {
                    if (c.getNome().equals("Monstro 5")) {
                        conhecidos.add(c);
                        monstros.remove(c);
                        countMonstros++;
                        break;
                    }
                }
            }

            if (token.equals("6")) {
                for (Monstro c : monstros) {
                    if (c.getNome().equals("Monstro 6")) {
                        conhecidos.add(c);
                        monstros.remove(c);
                        countMonstros++;
                        break;
                    }
                }
            }

            if (token.equals("7")) {
                for (Monstro c : monstros) {
                    if (c.getNome().equals("Monstro 7")) {
                        conhecidos.add(c);
                        monstros.remove(c);
                        countMonstros++;
                        break;
                    }
                }
            }

            if (token.equals("9")) {
                for (Monstro c : monstros) {
                    if (c.getNome().equals("Monstro 9")) {
                        conhecidos.add(c);
                        monstros.remove(c);
                        countMonstros++;
                        break;
                    }
                }
            }

            if (token.equals("escudo")) {
                guerreiro.setEscudo(false);
            }

            if (token.equals("armadura")) {
                guerreiro.setArmadura(false);
            }

            if (token.equals("tocha")) {
                guerreiro.setTocha(false);
            }

            if (token.equals("graal")) {
                guerreiro.setSantograal(false);
            }

            if (token.equals("espada")) {
                guerreiro.setEspada(false);
            }

            if (token.equals("lanca")) {
                guerreiro.setLanca(false);
            }

            if (token.equals("d")) {
                conhecidos.add(new Monstro("desconhecido", 0, "", ""));
                indiceDesconhecios.add(countMonstros);
                countMonstros++;
            }

            if (token.equals("t")) {

                if (guerreiro.isLanca()) {
                    System.out.print("-> Remover a Lanca:\t");
                    guerreiro.setLanca(false);
                    probabilidade(guerreiro, monstros, conhecidos, indiceDesconhecios, possibildadesDaEspada);
                    guerreiro.setLanca(true);
                }

                if (guerreiro.isSantograal()) {
                    System.out.print("-> Remover o Graal:\t");
                    guerreiro.setSantograal(false);
                    probabilidade(guerreiro, monstros, conhecidos, indiceDesconhecios, possibildadesDaEspada);
                    guerreiro.setSantograal(true);
                }

                if (guerreiro.isTocha()) {
                    System.out.print("-> Remover a Tocha:\t");
                    guerreiro.setTocha(false);
                    probabilidade(guerreiro, monstros, conhecidos, indiceDesconhecios, possibildadesDaEspada);
                    guerreiro.setTocha(true);
                }

                if (guerreiro.isEscudo()) {
                    System.out.print("-> Remover o Escudo:\t");
                    guerreiro.setEscudo(false);
                    probabilidade(guerreiro, monstros, conhecidos, indiceDesconhecios, possibildadesDaEspada);
                    guerreiro.setEscudo(true);
                }

                if (guerreiro.isArmadura()) {
                    System.out.print("-> Remover a Armadura:\t");
                    guerreiro.setArmadura(false);
                    probabilidade(guerreiro, monstros, conhecidos, indiceDesconhecios, possibildadesDaEspada);
                    guerreiro.setArmadura(true);
                }

                if (guerreiro.isEspada()) {
                    System.out.print("-> Remover a Espada:\t");
                    guerreiro.setEspada(false);
                    probabilidade(guerreiro, monstros, conhecidos, indiceDesconhecios, possibildadesDaEspada);
                    guerreiro.setEspada(true);
                }

                continue;
            }


            while (st.hasMoreTokens()) {
                token = st.nextToken();

                if (token.equals("1")) {
                    for (Monstro b : monstros) {
                        if (b.getNome().equals("Monstro 1")) {
                            monstros.remove(b);
                            break;
                        }
                    }
                }

                if (token.equals("2")) {
                    for (Monstro b : monstros) {
                        if (b.getNome().equals("Monstro 2")) {
                            monstros.remove(b);
                            break;
                        }
                    }
                }

                if (token.equals("3")) {
                    for (Monstro b : monstros) {
                        if (b.getNome().equals("Monstro 3")) {
                            monstros.remove(b);
                            break;
                        }
                    }
                }

                if (token.equals("4")) {
                    for (Monstro b : monstros) {
                        if (b.getNome().equals("Monstro 4")) {
                            monstros.remove(b);
                            break;
                        }
                    }
                }

                if (token.equals("5")) {
                    for (Monstro b : monstros) {
                        if (b.getNome().equals("Monstro 5")) {
                            monstros.remove(b);
                            break;
                        }
                    }
                }

                if (token.equals("6")) {
                    for (Monstro b : monstros) {
                        if (b.getNome().equals("Monstro 6")) {
                            monstros.remove(b);
                            break;
                        }
                    }
                }

                if (token.equals("7")) {
                    for (Monstro b : monstros) {
                        if (b.getNome().equals("Monstro 7")) {
                            monstros.remove(b);
                            break;
                        }
                    }
                }

                if (token.equals("9")) {
                    for (Monstro b : monstros) {
                        if (b.getNome().equals("Monstro 9")) {
                            monstros.remove(b);
                            break;
                        }
                    }
                }
            }

            probabilidade(guerreiro, monstros, conhecidos, indiceDesconhecios, possibildadesDaEspada);
        }


    }

    private static void probabilidade(Guerreiro guerreiro, List<Monstro> monstros, List<Monstro> conhecidos, List<Integer> indiceDesconhecios, List<Monstro> possibildadesDaEspada) {
        int poderEscolhaEspada = 0;

        if (guerreiro.isEspada()) {

            possibildadesDaEspada.addAll(conhecidos);
            possibildadesDaEspada.addAll(monstros);

            for (Monstro escolhido : possibildadesDaEspada) {
                if (guerreiro.isTocha() && (escolhido.getFraqueza1().equals("tocha") || escolhido.getFraqueza2().equals("tocha"))) {
                    if (escolhido.getFraqueza1().equals("tocha") || escolhido.getFraqueza2().equals("tocha")) {
                        continue;
                    }
                }

                if (guerreiro.isSantograal() && (escolhido.getFraqueza1().equals("santo-graal") || escolhido.getFraqueza2().equals("santo-graal"))) {
                    if (escolhido.getFraqueza1().equals("santo-graal") || escolhido.getFraqueza2().equals("santo-graal")) {
                        continue;
                    }
                }

                if (guerreiro.isLanca() && (escolhido.getFraqueza1().equals("lanca") || escolhido.getFraqueza2().equals("lanca"))) {
                    if (escolhido.getFraqueza1().equals("lanca") || escolhido.getFraqueza2().equals("lanca")) {
                        continue;
                    }
                }

                if (escolhido.getPoder() > poderEscolhaEspada)
                    guerreiro.setDecisaoEspada(escolhido.getPoder());
            }
        }

        recurssaoMasmorra(indiceDesconhecios, monstros, conhecidos, 0, guerreiro);

        System.out.print("V: " + guerreiro.getVitorias());
        System.out.print("\tD: " + guerreiro.getDerrotas());
        float prob = ((float) guerreiro.getVitorias() / (float) (guerreiro.getVitorias() + guerreiro.getDerrotas())) * 100;
        System.out.print("\tProb.: " + prob + "%");
        System.out.println();

        possibildadesDaEspada.clear();
        guerreiro.setDerrotas(0);
        guerreiro.setVitorias(0);
        guerreiro.setDecisaoEspada(0);
    }

    static void recurssaoMasmorra(List<Integer> desconhecidos, List<Monstro> monstros, List<Monstro> conhecidos, int ciclo, Guerreiro guerreiro) {

        List<Monstro> atualizada = new ArrayList<Monstro>(monstros);

        if (desconhecidos.size() > ciclo) {
            Monstro removido = null;
            for (Monstro j : monstros) {
                removido = j;
                conhecidos.set(desconhecidos.get(ciclo), j);
                atualizada.remove(j);

                if (desconhecidos.size() > ciclo + 1) {
                    ciclo++;
                    recurssaoMasmorra(desconhecidos, atualizada, conhecidos, ciclo, guerreiro);
                } else {
                    if (testMasmorra(guerreiro, conhecidos)) guerreiro.setVitorias(guerreiro.getVitorias() + 1);
                    else guerreiro.setDerrotas(guerreiro.getDerrotas() + 1);
                }
            }
            atualizada.add(removido);
        } else {
            if (testMasmorra(guerreiro, conhecidos)) guerreiro.setVitorias(guerreiro.getVitorias() + 1);
            else guerreiro.setDerrotas(guerreiro.getDerrotas() + 1);
        }
    }


    static boolean testMasmorra(Guerreiro guerreiro, List<Monstro> masmorra) {

        int totalpv = guerreiro.pv;
        if (guerreiro.isArmadura()) totalpv = totalpv + 5;
        if (guerreiro.isEscudo()) totalpv = totalpv + 3;

        List<Monstro> testemasmorra = new ArrayList<Monstro>(masmorra);

        for (int i = testemasmorra.size() - 1; i >= 0; i--) {

            if (guerreiro.isEspada()) {
                if (testemasmorra.get(i).getPoder() == guerreiro.getDecisaoEspada()) {
                    continue;
                }
            }

            if (guerreiro.isTocha()) {
                if (testemasmorra.get(i).getFraqueza1().equals("tocha") || testemasmorra.get(i).getFraqueza2().equals("tocha")) {
                    continue;
                }
            }

            if (guerreiro.isSantograal()) {
                if (testemasmorra.get(i).getFraqueza1().equals("santo-graal") || testemasmorra.get(i).getFraqueza2().equals("santo-graal")) {
                    continue;
                }
            }

            if (guerreiro.isLanca()) {
                if (testemasmorra.get(i).getFraqueza1().equals("lanca") || testemasmorra.get(i).getFraqueza2().equals("lanca")) {
                    continue;
                }
            }

            totalpv = totalpv - testemasmorra.get(i).getPoder();
        }

        if (totalpv > 0) return true;
        else return false;
    }
}
