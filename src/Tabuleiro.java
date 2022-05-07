import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class Tabuleiro extends JFrame{
    JogoDaVelha jogoDaVelha = new JogoDaVelha();
    public JTable tabuleiro = new JTable(3,3);
    public Tabuleiro(){                                                 //Construct
        super("Jogo da Velha");
            tabuleiro.setRowHeight(100);
            tabuleiro.setRowSelectionAllowed(false);
            tabuleiro.setToolTipText("Clique em um Campo e Digite X ou O");
            tabuleiro.setFont(new Font("Console", Font.BOLD, 70));
            tabuleiro.setCellSelectionEnabled(false);
            tabuleiro.setBackground(new Color(250,240,230));
            tabuleiro.setGridColor(new Color(128,0,0));
            tabuleiro.setBorder(BorderFactory.createLineBorder(new Color(128,0,0)));
        TableCellRenderer celula = new PersonalizarCelula();
        for(int i = 0; i <= 2; i++) {
            TableColumn coluna = tabuleiro.getColumnModel().getColumn(i);
            coluna.setCellRenderer(celula);
        }
        final JButton btnReset = new JButton("Recomeçar");
            btnReset.setToolTipText("Recomeça a Partida");
            btnReset.setBackground(new Color(240,230,220));
            btnReset.setBorderPainted(false);
            btnReset.addActionListener(
                    click -> {
                        tabuleiro.clearSelection();
                        for(int i = 0; i <= 2; i++) {
                            for(int d = 0; d<= 2; d++) {
                                tabuleiro.setValueAt("", i, d);
                            }
                        }
                        jogoDaVelha.Recomecar();
                    }
            );
        Container tela = getContentPane();
            tela.setLayout(new FlowLayout(FlowLayout.CENTER));
            tela.setBackground(new Color(255,192,203));
            tela.add(tabuleiro);
            tela.add(btnReset);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("velha.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(350,400);
        setVisible(true);
    }
    public int Vencedor() {
        if (tabuleiro.getValueAt(0, 0) == null) {
            for (int i = 0; i <= 2; i++) {
                for (int d = 0; d <= 2; d++) {
                    tabuleiro.setValueAt("", i, d);
                }
            }
        }
        //VERIFICA COLUNAS
        if ((tabuleiro.getValueAt(0, 0).equals("x")) &&
                (tabuleiro.getValueAt(1, 0).equals("x")) &&
                (tabuleiro.getValueAt(2, 0).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(0, 1).equals("x")) &&
                (tabuleiro.getValueAt(1, 1).equals("x")) &&
                (tabuleiro.getValueAt(2, 1).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(0, 2).equals("x")) &&
                (tabuleiro.getValueAt(1, 2).equals("x")) &&
                (tabuleiro.getValueAt(2, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(0, 0).equals("o")) &&
                (tabuleiro.getValueAt(1, 0).equals("o")) &&
                (tabuleiro.getValueAt(2, 0).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(0, 1).equals("o")) &&
                (tabuleiro.getValueAt(1, 1).equals("o")) &&
                (tabuleiro.getValueAt(2, 1).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(0, 2).equals("o")) &&
                (tabuleiro.getValueAt(1, 2).equals("o")) &&
                (tabuleiro.getValueAt(2, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        //
        //VERIFICA LINHAS
        if ((tabuleiro.getValueAt(0, 0).equals("x")) &&                            //VERIFICA LINHAS
                (tabuleiro.getValueAt(0, 1).equals("x")) &&
                (tabuleiro.getValueAt(0, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(1, 0).equals("x")) &&
                (tabuleiro.getValueAt(1, 1).equals("x")) &&
                (tabuleiro.getValueAt(1, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(2, 0).equals("x")) &&
                (tabuleiro.getValueAt(2, 1).equals("x")) &&
                (tabuleiro.getValueAt(2, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(0, 0).equals("o")) &&
                (tabuleiro.getValueAt(0, 1).equals("o")) &&
                (tabuleiro.getValueAt(0, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(1, 0).equals("o")) &&
                (tabuleiro.getValueAt(1, 1).equals("o")) &&
                (tabuleiro.getValueAt(1, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(2, 0).equals("o")) &&
                (tabuleiro.getValueAt(2, 1).equals("o")) &&
                (tabuleiro.getValueAt(2, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        //
        //VERIFICA DIAGONAIS
        if ((tabuleiro.getValueAt(0, 0).equals("x")) &&
                (tabuleiro.getValueAt(1, 1).equals("x")) &&
                (tabuleiro.getValueAt(2, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(2, 0).equals("x")) &&
                (tabuleiro.getValueAt(1, 1).equals("x")) &&
                (tabuleiro.getValueAt(0, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(0, 0).equals("o")) &&
                (tabuleiro.getValueAt(1, 1).equals("o")) &&
                (tabuleiro.getValueAt(2, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tabuleiro.getValueAt(2, 0).equals("o")) &&
                (tabuleiro.getValueAt(1, 1).equals("o")) &&
                (tabuleiro.getValueAt(0, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        return 0;
    }
    static class PersonalizarCelula extends DefaultTableCellRenderer{
        public PersonalizarCelula(){                                    //Construct
            setHorizontalAlignment(CENTER);
        }
    }
}
