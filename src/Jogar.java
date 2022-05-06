import javax.swing.*;

public class Jogar {
    private Tabuleiro tabuleiro;

    public Jogar(){
        tabuleiro = new Tabuleiro();

        while (jogando()==true);
    }
    public boolean jogando(){
        if(tabuleiro.Vencedor() == 0){
            return true;
        }else return false;

    }

}
