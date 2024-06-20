package pagamento;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Resultados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pgSalLiq;
	private JTextField pgImp;
	private JTextField pgInss;
	private JTextField pgSalFal;
	private JTextField pgDep;
	private JTextField pgSalBruto;
	private JTextField pgNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultados frame = new Resultados();
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
	public Resultados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 636);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Funcionário");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 51, 199, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblSalarioBruto = new JLabel("Salarío Bruto");
		lblSalarioBruto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalarioBruto.setForeground(Color.WHITE);
		lblSalarioBruto.setBounds(10, 129, 157, 28);
		contentPane.add(lblSalarioBruto);
		
		JLabel lblNumeroDeDependentes = new JLabel("Número De Dependentes");
		lblNumeroDeDependentes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNumeroDeDependentes.setForeground(Color.WHITE);
		lblNumeroDeDependentes.setBounds(10, 207, 199, 28);
		contentPane.add(lblNumeroDeDependentes);
		
		JLabel lblSalarioFamilia = new JLabel("Salarío Família");
		lblSalarioFamilia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalarioFamilia.setForeground(Color.WHITE);
		lblSalarioFamilia.setBounds(10, 285, 157, 28);
		contentPane.add(lblSalarioFamilia);
		
		JLabel lblInss = new JLabel("INSS");
		lblInss.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInss.setForeground(Color.WHITE);
		lblInss.setBounds(10, 363, 157, 28);
		contentPane.add(lblInss);
		
		JLabel lblImposto = new JLabel("Imposto");
		lblImposto.setForeground(Color.WHITE);
		lblImposto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblImposto.setBounds(10, 441, 157, 28);
		contentPane.add(lblImposto);
		
		JLabel lblSalLiquido = new JLabel("Sal. Liquido");
		lblSalLiquido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalLiquido.setForeground(Color.WHITE);
		lblSalLiquido.setBounds(10, 519, 157, 28);
		contentPane.add(lblSalLiquido);
		
		pgSalLiq = new JTextField();
		pgSalLiq.setEditable(false);
		pgSalLiq.setEnabled(false);
		pgSalLiq.setBounds(10, 558, 324, 28);
		contentPane.add(pgSalLiq);
		pgSalLiq.setColumns(10);
		
		pgImp = new JTextField();
		pgImp.setEditable(false);
		pgImp.setEnabled(false);
		pgImp.setColumns(10);
		pgImp.setBounds(10, 480, 324, 28);
		contentPane.add(pgImp);
		
		pgInss = new JTextField();
		pgInss.setEditable(false);
		pgInss.setEnabled(false);
		pgInss.setColumns(10);
		pgInss.setBounds(10, 402, 324, 28);
		contentPane.add(pgInss);
		
		pgSalFal = new JTextField();
		pgSalFal.setEditable(false);
		pgSalFal.setEnabled(false);
		pgSalFal.setColumns(10);
		pgSalFal.setBounds(10, 324, 324, 28);
		contentPane.add(pgSalFal);
		
		pgDep = new JTextField();
		pgDep.setEditable(false);
		pgDep.setEnabled(false);
		pgDep.setColumns(10);
		pgDep.setBounds(10, 246, 324, 28);
		contentPane.add(pgDep);
		
		pgSalBruto = new JTextField();
		pgSalBruto.setEditable(false);
		pgSalBruto.setEnabled(false);
		pgSalBruto.setColumns(10);
		pgSalBruto.setBounds(10, 168, 324, 28);
		contentPane.add(pgSalBruto);
		
		pgNome = new JTextField();
		pgNome.setEnabled(false);
		pgNome.setEditable(false);
		pgNome.setColumns(10);
		pgNome.setBounds(10, 90, 324, 28);
		contentPane.add(pgNome);
	}
	
	public void receber() {
		
	}

}
