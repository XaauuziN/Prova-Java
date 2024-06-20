package pagamento;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pagamento extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField tfNome;
    private JTextField tfSalario;
    private JTextField tfQuantidade;
    private final ButtonGroup btnSn = new ButtonGroup();
    private JButton btnCalcular;

    double imposto = 0;
    double bruto = 0;
    double salario = 0;
    double resultado = 0;
    double inss = 0;
    double dependentes = 0;
    double dep=0;
    private JLabel lblQnt;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Pagamento frame = new Pagamento();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Pagamento() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 865, 441);
        setResizable(false); // Não permitir redimensionar a tela
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.WHITE, 1, true));
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(107, 11, 603, 71);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("DEMONSTRATIVO DE PAGAMENTO");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel.setBounds(68, 11, 525, 64);
        panel.add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(Color.WHITE, 1, true));
        panel_1.setBackground(Color.DARK_GRAY);
        panel_1.setBounds(107, 113, 603, 71);
        contentPane.add(panel_1);

        JLabel lblNewLabel_1 = new JLabel("Nome do Funcionário");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(10, 11, 151, 14);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Salário Bruto");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setBounds(10, 46, 124, 14);
        panel_1.add(lblNewLabel_1_1);

        tfNome = new JTextField();
        tfNome.setBounds(185, 8, 394, 20);
        panel_1.add(tfNome);
        tfNome.setColumns(10);

        tfSalario = new JTextField();
        tfSalario.setColumns(10);
        tfSalario.setBounds(185, 39, 394, 20);
        panel_1.add(tfSalario);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBorder(new LineBorder(Color.WHITE, 1, true));
        panel_1_1.setBackground(Color.DARK_GRAY);
        panel_1_1.setBounds(107, 206, 603, 71);
        contentPane.add(panel_1_1);

        JLabel lblNewLabel_2 = new JLabel("Possui Dependentes");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setBounds(151, 0, 279, 21);
        panel_1_1.add(lblNewLabel_2);

        JRadioButton rdSim = new JRadioButton("Sim");
        rdSim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdSim.isSelected()) {
                    tfQuantidade.setEditable(true);
                    lblQnt.setEnabled(true);
                    btnCalcular.setEnabled(true);
                }
            }
        });
        btnSn.add(rdSim);
        rdSim.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rdSim.setForeground(Color.WHITE);
        rdSim.setBackground(Color.DARK_GRAY);
        rdSim.setBounds(65, 35, 53, 35);
        panel_1_1.add(rdSim);

        JRadioButton rdN = new JRadioButton("Não");
        rdN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdN.isSelected()) {
                    tfQuantidade.setEditable(false);
                    tfQuantidade.setText("");
                    lblQnt.setEnabled(false);
                    btnCalcular.setEnabled(true);
                }
            }
        });
        btnSn.add(rdN);
        rdN.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rdN.setForeground(Color.WHITE);
        rdN.setBackground(Color.DARK_GRAY);
        rdN.setBounds(151, 41, 53, 23);
        panel_1_1.add(rdN);

        lblQnt = new JLabel("Quantos?");
        lblQnt.setEnabled(false);
        lblQnt.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblQnt.setForeground(Color.WHITE);
        lblQnt.setBounds(255, 38, 131, 21);
        panel_1_1.add(lblQnt);

        tfQuantidade = new JTextField();
        tfQuantidade.setEditable(false);
        tfQuantidade.setBounds(375, 41, 206, 23);
        panel_1_1.add(tfQuantidade);
        tfQuantidade.setColumns(10);

        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBorder(new LineBorder(Color.WHITE, 1, true));
        panel_2.setBackground(Color.DARK_GRAY);
        panel_2.setBounds(107, 301, 603, 71);
        contentPane.add(panel_2);

        btnCalcular = new JButton("Calcular Salário");
        btnCalcular.setEnabled(false);
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    salario = Double.parseDouble(tfSalario.getText());
                    dependentes = tfQuantidade.getText().isEmpty() ? 0 : Integer.parseInt(tfQuantidade.getText() );

                    calcularINSS();
                    calcularImposto();
                    calcularDependentes();

                    resultado = salario - inss - imposto + dependentes;

                    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
                    Resultados resultados = new Resultados(
                        tfNome.getText(), 
                        df.format(salario), 
                        df.format(resultado),
                        df.format(inss),
                        df.format(imposto),
                        df.format(dependentes)
                    );

                    resultados.setVisible(true);
                    setVisible(false);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores válidos.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnCalcular.setBounds(49, 11, 158, 49);
        panel_2.add(btnCalcular);

        JButton btnExit = new JButton("Sair");
        btnExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja Sair do Programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
				if (confirm ==JOptionPane.YES_OPTION) {
					System.exit(1);	
				}
				
			}
		
        });
        btnExit.setBounds(435, 11, 158, 49);
        panel_2.add(btnExit);
        
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		tfQuantidade.setText("");
        		tfNome.setText("");
        		tfSalario.setText("");
        		btnSn.clearSelection();
        		
        	}
        });
        btnLimpar.setBounds(242, 11, 158, 49);
        panel_2.add(btnLimpar);
    }

    public void calcularINSS() {
        if (salario <= 1412) {
            inss = salario * 0.075;
        } else if (salario <= 2666.68) {
            inss = salario * 0.09;
        } else if (salario <= 4000.03) {
            inss = salario * 0.12;
        } else if (salario <= 7786.02) {
            inss = salario * 0.14;
        }
    }

    public void calcularImposto() {
        if (salario <= 2259.20) {
            imposto = 0;
        } else if (salario <= 2826.65) {
            imposto = salario * 0.075;
        } else if (salario <= 3751.05) {
            imposto = salario * 0.15;
        } else if (salario <= 4664.68) {
            imposto = salario * 0.225;
        } else {
            imposto = salario * 0.275;
        }
    }

    public void calcularDependentes() {
        if (salario <= 1819.26) {
            dependentes = dependentes * 62.04;
        } else {
            dependentes = 0;
        }
    }

    // Classe para exibir os resultados
    public class Resultados extends JFrame {
        private static final long serialVersionUID = 1L;
        private JPanel contentPane;
        private JLabel lblNome;
        private JLabel lblSalarioBruto;
        private JLabel lblSalarioLiquido;
        private JLabel lblInss;
        private JLabel lblImposto;
        private JLabel lblDependentes;

        public Resultados(String nome, String salarioBruto, String salarioLiquido, String inss, String imposto, String dependentes) {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            setResizable(false);
            contentPane = new JPanel();
            contentPane.setBackground(Color.DARK_GRAY);
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lblTitulo = new JLabel("Resultado do Cálculo");
            lblTitulo.setForeground(Color.WHITE);
            lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
            lblTitulo.setBounds(100, 11, 250, 29);
            contentPane.add(lblTitulo);

            lblNome = new JLabel("Nome: " + nome);
            lblNome.setForeground(Color.WHITE);
            lblNome.setBounds(50, 50, 350, 14);
            contentPane.add(lblNome);

            lblSalarioBruto = new JLabel("Salário Bruto: " + salarioBruto);
            lblSalarioBruto.setForeground(Color.WHITE);
            lblSalarioBruto.setBounds(50, 80, 350, 14);
            contentPane.add(lblSalarioBruto);

            lblSalarioLiquido = new JLabel("Salário Líquido: " + salarioLiquido);
            lblSalarioLiquido.setForeground(Color.WHITE);
            lblSalarioLiquido.setBounds(50, 110, 350, 14);
            contentPane.add(lblSalarioLiquido);

            lblInss = new JLabel("INSS: " + inss);
            lblInss.setForeground(Color.WHITE);
            lblInss.setBounds(50, 140, 350, 14);
            contentPane.add(lblInss);

            lblImposto = new JLabel("Imposto: " + imposto);
            lblImposto.setForeground(Color.WHITE);
            lblImposto.setBounds(50, 170, 350, 14);
            contentPane.add(lblImposto);

            lblDependentes = new JLabel("Dependentes: " + dependentes);
            lblDependentes.setForeground(Color.WHITE);
            lblDependentes.setBounds(50, 200, 350, 14);
            contentPane.add(lblDependentes);

            JButton btnVoltar = new JButton("Voltar");
            btnVoltar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Pagamento.this.setVisible(true);
                    Resultados.this.dispose();
                }
            });
            btnVoltar.setBounds(150, 230, 150, 30);
            contentPane.add(btnVoltar);
        }
    }
}
