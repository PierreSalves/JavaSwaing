import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
public class Tabuleiro extends JFrame{
    public JTable tblTabuleiro = new JTable(3,3);
    public Tabuleiro(){
        super("Jogo da Velha");
            tblTabuleiro.setRowHeight(100);
            tblTabuleiro.setRowSelectionAllowed(false);
            tblTabuleiro.setToolTipText("Clique em um Campo e Digite X ou O");
            tblTabuleiro.setFont(new Font("Console", Font.BOLD, 70));
            tblTabuleiro.setCellSelectionEnabled(false);
            tblTabuleiro.setBackground(new Color(250,240,230));
            tblTabuleiro.setGridColor(new Color(128,0,0));
            tblTabuleiro.setBorder(BorderFactory.createLineBorder(new Color(128,0,0)));
        TableCellRenderer celula = new PersonalizarCelula();
        for(int i = 0; i <= 2; i++) {
            TableColumn coluna = tblTabuleiro.getColumnModel().getColumn(i);
            coluna.setCellRenderer(celula);
        }
        final JButton btnReset = new JButton("Recomeçar");
            btnReset.setToolTipText("Recomeça a Partida");
            btnReset.setBackground(new Color(240,230,220));
            btnReset.setBorderPainted(false);
            btnReset.addActionListener(
                    click -> {
                            tblTabuleiro.clearSelection();
                            for (int i = 0; i <= 2; i++) {
                                for (int d = 0; d <= 2; d++) {
                                    tblTabuleiro.setValueAt("", i, d);
                                }
                            }
                    });

        Container tela = getContentPane();
            tela.setLayout(new FlowLayout(FlowLayout.CENTER));
            tela.setBackground(new Color(255,192,203));
            tela.add(tblTabuleiro);
            tela.add(btnReset);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("velha.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(300,400);
        setVisible(true);
    }
    public int Vencedor() {
        if (tblTabuleiro.getValueAt(0, 0) == null) {
            for (int i = 0; i <= 2; i++) {
                for (int d = 0; d <= 2; d++) {
                    tblTabuleiro.setValueAt("", i, d);
                }
            }
        }
        //
        //VERIFICA COLUNAS
        if ((tblTabuleiro.getValueAt(0, 0).equals("x")) &&
                (tblTabuleiro.getValueAt(1, 0).equals("x")) &&
                (tblTabuleiro.getValueAt(2, 0).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(0, 1).equals("x")) &&
                (tblTabuleiro.getValueAt(1, 1).equals("x")) &&
                (tblTabuleiro.getValueAt(2, 1).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(0, 2).equals("x")) &&
                (tblTabuleiro.getValueAt(1, 2).equals("x")) &&
                (tblTabuleiro.getValueAt(2, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(0, 0).equals("o")) &&
                (tblTabuleiro.getValueAt(1, 0).equals("o")) &&
                (tblTabuleiro.getValueAt(2, 0).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(0, 1).equals("o")) &&
                (tblTabuleiro.getValueAt(1, 1).equals("o")) &&
                (tblTabuleiro.getValueAt(2, 1).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(0, 2).equals("o")) &&
                (tblTabuleiro.getValueAt(1, 2).equals("o")) &&
                (tblTabuleiro.getValueAt(2, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        //
        //VERIFICA LINHAS
        if ((tblTabuleiro.getValueAt(0, 0).equals("x")) &&
                (tblTabuleiro.getValueAt(0, 1).equals("x")) &&
                (tblTabuleiro.getValueAt(0, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(1, 0).equals("x")) &&
                (tblTabuleiro.getValueAt(1, 1).equals("x")) &&
                (tblTabuleiro.getValueAt(1, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(2, 0).equals("x")) &&
                (tblTabuleiro.getValueAt(2, 1).equals("x")) &&
                (tblTabuleiro.getValueAt(2, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(0, 0).equals("o")) &&
                (tblTabuleiro.getValueAt(0, 1).equals("o")) &&
                (tblTabuleiro.getValueAt(0, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(1, 0).equals("o")) &&
                (tblTabuleiro.getValueAt(1, 1).equals("o")) &&
                (tblTabuleiro.getValueAt(1, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(2, 0).equals("o")) &&
                (tblTabuleiro.getValueAt(2, 1).equals("o")) &&
                (tblTabuleiro.getValueAt(2, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        //
        //VERIFICA DIAGONAIS
        if ((tblTabuleiro.getValueAt(0, 0).equals("x")) &&
                (tblTabuleiro.getValueAt(1, 1).equals("x")) &&
                (tblTabuleiro.getValueAt(2, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(2, 0).equals("x")) &&
                (tblTabuleiro.getValueAt(1, 1).equals("x")) &&
                (tblTabuleiro.getValueAt(0, 2).equals("x"))) {
            JOptionPane.showMessageDialog(null, "Jogador X Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(0, 0).equals("o")) &&
                (tblTabuleiro.getValueAt(1, 1).equals("o")) &&
                (tblTabuleiro.getValueAt(2, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        if ((tblTabuleiro.getValueAt(2, 0).equals("o")) &&
                (tblTabuleiro.getValueAt(1, 1).equals("o")) &&
                (tblTabuleiro.getValueAt(0, 2).equals("o"))) {
            JOptionPane.showMessageDialog(null, "Jogador O Venceu");
            return 1;
        }
        return 0;
    }
    static class PersonalizarCelula extends DefaultTableCellRenderer{
        public PersonalizarCelula(){
            setHorizontalAlignment(CENTER);
        }
    }
}
