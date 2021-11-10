import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {
    @Test
    public void testeAndar() {
       Deslocamento deslocar = new Deslocamento();
//       MovimentoCorrer movCorrer = new MovimentoCorrer(deslocar);
//       MovimentoAndar movAndar = new MovimentoAndar(deslocar);//
//       Command br = new Command();
//       br.adicionaAcao(movAndar);
//       br.adicionaAcao(movCorrer);
//       br.executaAcao();
       assertEquals("andar",deslocar.andar());
    }

    @Test
    public void testeCorrer() {
        Deslocamento deslocar = new Deslocamento();
        assertEquals("correr",deslocar.correr());
    }
}