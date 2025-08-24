import org.junit.Test;

import static org.junit.Assert.assertEquals;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        @Test
        public void deveTraduzirCarroELivroDoInglesParaPortuguesEDoPortuguesParaOIngles() throws PalavraNaoEncontradaException {
            Dicionario dicionario = new Dicionario();
            dicionario.adicionarPalavra("Carro", "Car", TipoDicionario.INGLES);
            dicionario.adicionarPalavra("Livro", "Book", TipoDicionario.INGLES);
            dicionario.adicionarPalavra("Tiger", "Tigre", TipoDicionario.PORTUGUES);
            dicionario.adicionarPalavra("Paper", "Papel", TipoDicionario.PORTUGUES);
            assertEquals("Car", dicionario.traduzir("carro", TipoDicionario.INGLES));
            assertEquals("Book", dicionario.traduzir("lIVRO",
                    TipoDicionario.INGLES));
            assertEquals("Papel", dicionario.traduzir("pApEr",
                    TipoDicionario.PORTUGUES));
            assertEquals("Tigre", dicionario.traduzir("TIGER",
                    TipoDicionario.PORTUGUES));
    }
    @Test(expected = PalavraNaoEncontradaException.class)
    public void deveLancarExceptionQuandoUmaPalavraNaoForEncontrada() throws PalavraNaoEncontradaException {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Carro", "Car", TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Livro", "Book", TipoDicionario.INGLES);
        String traducao = dicionario.traduzir("Caneta", TipoDicionario.INGLES);
    }

}