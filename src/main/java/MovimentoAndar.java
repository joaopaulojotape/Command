public class MovimentoAndar implements AcaoIF{
    private Deslocamento deslocar;

    public MovimentoAndar(Deslocamento deslocamento){
        this.deslocar = deslocar;
    }

    public void executar(){
        this.deslocar.andar();
    }
}
