import java.util.ArrayList;

public class Command {
    private ArrayList<AcaoIF> listaAcao = new ArrayList<AcaoIF>();

    public void adicionaAcao(AcaoIF acao){
        listaAcao.add(acao);
    }

    public void executaAcao(){
        for(AcaoIF acao: listaAcao){
            acao.executar();
        }
        listaAcao.clear();
    }

}
