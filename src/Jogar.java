

public class Jogar {
    private final Tabuleiro tabuleiro;

    public Jogar(){
        tabuleiro = new Tabuleiro();

        while (jogando());
    }
    public boolean jogando(){
        if(tabuleiro.Vencedor() == 0){
            return true;
        }
        return tabuleiro.recomecar;
    }

}
