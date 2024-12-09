import java.util.*;

public class App {

    static List<Integer> linhasPosicoesLivres(String posicoesLivres) {
        List<Integer> linhas = new ArrayList<>();
        for (char linha = '0'; linha <= '2'; linha++) {
            if (posicoesLivres.indexOf(linha) != -1) {
                linhas.add(Character.getNumericValue(linha));
            }
        }
        return linhas;
    }

    static List<Integer> colunasPosicoesLivres(String posicoesLivres) {
        List<Integer> colunas = new ArrayList<>();
        for (char coluna = '0'; coluna <= '2'; coluna++) {
            if (posicoesLivres.indexOf(coluna) != -1) {
                colunas.add(Character.getNumericValue(coluna));
            }
        }
        return colunas;
    }

    static int[] obterJogadaComputador(String posicoesLivres) {
        Random rand = new Random();
        
        List<Integer> linhasLivres = linhasPosicoesLivres(posicoesLivres);
        List<Integer> colunasLivres = colunasPosicoesLivres(posicoesLivres);

        int linha = linhasLivres.get(rand.nextInt(linhasLivres.size()));
        int coluna = colunasLivres.get(rand.nextInt(colunasLivres.size()));
        
        return new int[]{linha, coluna};
    }

    public static void main(String[] args) {
        
        String posicoesLivres = "00;01;02;10;11;12;20;21;22"; 
        
        int[] jogada = obterJogadaComputador(posicoesLivres);
        System.out.println("A jogada do computador foi na linha " + jogada[0] + " e na coluna " + jogada[1]);
    }
}
