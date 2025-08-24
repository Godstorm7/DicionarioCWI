import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionarioIngles = new HashMap<>();
    Map<String, String> dicionarioPortugues = new HashMap<>();

    public void adicionarPalavra(String palavra, String traducao, TipoDicionario dicionario) {
        if (dicionario == TipoDicionario.INGLES) {
            dicionarioIngles.put(palavra.toLowerCase(), traducao);
        } else {
            dicionarioPortugues.put(palavra.toLowerCase(), traducao);
        }
    }
    public String traduzir(String palavra, TipoDicionario dicionarioDeBusca) throws PalavraNaoEncontradaException {
        String traducao;
        if (dicionarioDeBusca == TipoDicionario.INGLES) {
            traducao = dicionarioIngles.get(palavra.toLowerCase());
        } else if (dicionarioDeBusca == TipoDicionario.PORTUGUES) {
            traducao = dicionarioPortugues.get(palavra.toLowerCase());
        } else {
            traducao = null;
        }
        if (traducao == null) {
            throw new PalavraNaoEncontradaException("Palavra '" + palavra + "' não encontrada no dicionário " + dicionarioDeBusca);
        }
        return traducao;
    }
}
