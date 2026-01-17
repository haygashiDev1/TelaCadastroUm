import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaCadastro extends JFrame {
    private JTextField campoNome;
    private JTextField campoEmail;
    private JTextArea areaResultado;

    public  TelaCadastro() {

        setTitle("Central de Cadastro");

        setSize(400,350);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        // Painel Arrendondados//

        JPanel painel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(new Color(230, 230, 230));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);


            }
        };
        painel.setBounds(20,20,350,150);
        painel.setLayout(null);

        add(painel);

        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setBounds(20,20,100,25);
        painel.add(lblNome);

        campoNome =new JTextField();
        campoNome.setBounds(120,20,200,25);
        painel.add(campoNome);

        JLabel lblEmail = new JLabel("Email: ");
        lblEmail.setBounds(20, 60, 100, 25);
        painel.add(lblEmail);

        campoEmail = new JTextField();
        campoEmail.setBounds(120, 60,200, 25);
        painel.add(lblEmail);

        campoEmail = new JTextField();
        campoEmail.setBounds(120, 60, 200, 25);
        painel.add(campoEmail);
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(120, 100,120,30);
        painel.add(botaoCadastrar);

        areaResultado = new JTextArea();
        areaResultado.setBounds(20, 190, 350, 120);
        areaResultado.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(areaResultado);

        botaoCadastrar.addActionListener(new ActionListener(){
            @Override
                    public void actionPerformed(ActionEvent e){

                String nome = campoNome.getText();
                String email = campoEmail.getText();
                areaResultado.setText("Usuário Cadastrado:\n");
                areaResultado.append("Nome: " + nome + "\n");
                areaResultado.append("Email: " + email + "\n");

    }
 });
}

public static void main(String[]args){
    new TelaCadastro().setVisible(true);
}
}


