public class MovimentoCorrer implements AcaoIF{
    private Deslocamento deslocar;
    public MovimentoCorrer(Deslocamento deslocar){
        this.deslocar = deslocar;
    }

    public void executar(){
        this.deslocar.correr();
    }

}
