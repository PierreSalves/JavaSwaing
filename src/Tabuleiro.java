
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

public class Tabuleiro extends JFrame{
    public JTable tabuleiro = new JTable(3,3);
    public Tabuleiro(){                                                 //Construct
        super("Jogo da Velha");
            tabuleiro.setRowHeight(100);
            tabuleiro.setRowSelectionAllowed(false);
            tabuleiro.setToolTipText("Clique em um Campo e Digite X ou O");
            tabuleiro.setFont(new Font("Console", Font.BOLD, 70));
        TableCellRenderer celula = new PersonalizarCelula();
        for(int i = 0; i <= 2; i++) {
            TableColumn coluna = tabuleiro.getColumnModel().getColumn(i);
            coluna.setCellRenderer(celula);
        }

        final JButton btnReset = new JButton("Recomeçar");
            btnReset.setToolTipText("Recomeça a Partida");
            btnReset.setVisible(true);
            btnReset.addActionListener(                                 //Event
                new ActionListener() {
                    public void actionPerformed(ActionEvent click) {    //Construct
                        tabuleiro.clearSelection();
                        JOptionPane.showMessageDialog(null,tabuleiro.getValueAt(0,0));

                        for(int i = 0; i <= 2; i++) {
                            for(int d = 0; d<= 2; d++) {
                                tabuleiro.setValueAt("", i, d);
                            }
                        }
                    }
                }
            );

        Container tela = getContentPane();
            tela.setVisible(true);
            tela.setLayout(new FlowLayout(0));
            tela.add(tabuleiro);
            tela.add(btnReset);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,350);
        setVisible(true);
    }
    public int Vencedor(){
            /*if(tabuleiro.getValueAt(0,0) == null) {
                for (int i = 0; i <= 2; i++) {
                    for (int d = 0; d <= 2; d++) {
                        tabuleiro.setValueAt("", i, d);
                    }
                }
            }*/
        if((tabuleiro.getValueAt(0,0) == String.valueOf('x'))&&
                (tabuleiro.getValueAt(1,0) == String.valueOf('x'))&&
                    (tabuleiro.getValueAt(2,0) == String.valueOf('x'))){
            JOptionPane.showMessageDialog(null,"Jogador X Venceu");
            return 1;
        }

  /*      for(int i = 0; i < 3; i++){


            if((coluna0[0] + coluna0[1] + coluna0[2]  == 3)||
                    (coluna1[0] + coluna1[1] + coluna1[2]  == 3)||
                    (coluna2[0] + coluna2[1] + coluna2[2]  == 3)){

                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu");
                return 1;
            }
            if((coluna0[0] + coluna0[1] + coluna0[2]  == -3)||
                    (coluna1[0] + coluna1[1] + coluna1[2]  == -3)||
                    (coluna2[0] + coluna2[1] + coluna2[2]  == -3)){

                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu");
                return -1;
            }

            linha0[i] = (Integer) tabuleiro.getValueAt(0,i);
            linha1[i] = (Integer) tabuleiro.getValueAt(1,i);
            linha2[i] = (Integer) tabuleiro.getValueAt(2,i);
            if((linha0[0] + linha0[1] + linha0[2]  == 3)||
                    (linha1[0] + linha1[1] + linha1[2]  == 3)||
                    (linha2[0] + linha2[1] + linha2[2]  == 3)){

                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu");
                return 1;
            }
            if((linha0[0] + linha0[1] + linha0[2]  == -3)||
                    (linha1[0] + linha1[1] + linha1[2]  == -3)||
                    (linha2[0] + linha2[1] + linha2[2]  == -3)){

                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu");
                return -1;
            }

            if((coluna0[0] + coluna1[1] + coluna2[2] == 3)||
                    (coluna0[2] + coluna1[1] + coluna2[0] == 3)){

                JOptionPane.showMessageDialog(null,"Jogador 1 Venceu");
                return 1;
            }
            if((coluna0[0] + coluna1[1] + coluna2[2] == -3)||
                    (coluna0[2] + coluna1[1] + coluna2[0] == -3)){

                JOptionPane.showMessageDialog(null,"Jogador 2 Venceu");
                return -1;
            }
        }*/
        return 0;
    }

    class PersonalizarCelula extends DefaultTableCellRenderer{
        public PersonalizarCelula(){                                    //Construct
            setHorizontalAlignment(CENTER);
        }
    }
}
