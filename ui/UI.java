package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ToolTipManager;

import cafe.CafeTipos.Sabores;
import cafe.CafeTipos.Torra;
import cafe.comparacao.Comparacao;

public class UI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Inicializando as listas necessárias
		final List<Torra> t = new ArrayList<Torra>();
		final List<Sabores> s = new ArrayList<Sabores>();
		final List<JCheckBox> checkboxesTorra = new ArrayList<>(3);
		final List<JCheckBox> checkboxesSabores = new ArrayList<>(9);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{309, 309, 309, 0};
		gridBagLayout.rowHeights = new int[]{28, 23, 21, 0, 0, 0, 34, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Escolha seu(s) tipo(s) de torra");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		final JCheckBox CLARA = new JCheckBox("Clara");
		CLARA.setToolTipText("CLARA"); // Para simplificar o código que checa se as checkboxes foram selecionadas
		ToolTipManager.sharedInstance().setEnabled(false); //Desabilitando as tooltips, pois não queremos que esse texto apareça de fato
		GridBagConstraints gbc_CLARA = new GridBagConstraints();
		gbc_CLARA.insets = new Insets(0, 0, 5, 5);
		gbc_CLARA.gridx = 0;
		gbc_CLARA.gridy = 1;
		frame.getContentPane().add(CLARA, gbc_CLARA);
		checkboxesTorra.add(CLARA);
		
		final JCheckBox MEDIA = new JCheckBox("M\u00E9dia");
		MEDIA.setToolTipText("MEDIA");
		GridBagConstraints gbc_MEDIA = new GridBagConstraints();
		gbc_MEDIA.insets = new Insets(0, 0, 5, 5);
		gbc_MEDIA.gridx = 1;
		gbc_MEDIA.gridy = 1;
		frame.getContentPane().add(MEDIA, gbc_MEDIA);
		checkboxesTorra.add(MEDIA);
		
		final JCheckBox ESCURA = new JCheckBox("Escura");
		ESCURA.setToolTipText("ESCURA");
		GridBagConstraints gbc_ESCURA = new GridBagConstraints();
		gbc_ESCURA.insets = new Insets(0, 0, 5, 0);
		gbc_ESCURA.gridx = 2;
		gbc_ESCURA.gridy = 1;
		frame.getContentPane().add(ESCURA, gbc_ESCURA);
		checkboxesTorra.add(ESCURA);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha o(s) sabore(s) desejados()");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		final JCheckBox NOZ_CACAU = new JCheckBox("Noz/Cacau");
		NOZ_CACAU.setToolTipText("NOZ_CACAU");
		GridBagConstraints gbc_NOZ_CACAU = new GridBagConstraints();
		gbc_NOZ_CACAU.insets = new Insets(0, 0, 5, 5);
		gbc_NOZ_CACAU.gridx = 0;
		gbc_NOZ_CACAU.gridy = 3;
		frame.getContentPane().add(NOZ_CACAU, gbc_NOZ_CACAU);
		checkboxesSabores.add(NOZ_CACAU);
		
		final JCheckBox DOCE = new JCheckBox("Doce");
		DOCE.setToolTipText("DOCE");
		GridBagConstraints gbc_DOCE = new GridBagConstraints();
		gbc_DOCE.insets = new Insets(0, 0, 5, 5);
		gbc_DOCE.gridx = 1;
		gbc_DOCE.gridy = 3;
		frame.getContentPane().add(DOCE, gbc_DOCE);
		checkboxesSabores.add(DOCE);
		
		final JCheckBox FLORAL = new JCheckBox("Floral");
		FLORAL.setToolTipText("FLORAL");
		GridBagConstraints gbc_FLORAL = new GridBagConstraints();
		gbc_FLORAL.insets = new Insets(0, 0, 5, 0);
		gbc_FLORAL.gridx = 2;
		gbc_FLORAL.gridy = 3;
		frame.getContentPane().add(FLORAL, gbc_FLORAL);
		checkboxesSabores.add(FLORAL);
		
		final JCheckBox FRUTADO = new JCheckBox("Frutado");
		FRUTADO.setToolTipText("FRUTADO");
		GridBagConstraints gbc_FRUTADO = new GridBagConstraints();
		gbc_FRUTADO.insets = new Insets(0, 0, 5, 5);
		gbc_FRUTADO.gridx = 0;
		gbc_FRUTADO.gridy = 4;
		frame.getContentPane().add(FRUTADO, gbc_FRUTADO);
		checkboxesSabores.add(FRUTADO);
		
		final JCheckBox AZEDO_FERMENTADO = new JCheckBox("Azedo/Fermentado");
		AZEDO_FERMENTADO.setToolTipText("AZEDO_FERMENTADO");
		GridBagConstraints gbc_AZEDO_FERMENTADO = new GridBagConstraints();
		gbc_AZEDO_FERMENTADO.insets = new Insets(0, 0, 5, 5);
		gbc_AZEDO_FERMENTADO.gridx = 1;
		gbc_AZEDO_FERMENTADO.gridy = 4;
		frame.getContentPane().add(AZEDO_FERMENTADO, gbc_AZEDO_FERMENTADO);
		checkboxesSabores.add(AZEDO_FERMENTADO);
		
		final JCheckBox VERDE_VEGETAL = new JCheckBox("Verde/Vegetal");
		VERDE_VEGETAL.setToolTipText("VERDE_VEGETAL");
		GridBagConstraints gbc_VERDE_VEGETAL = new GridBagConstraints();
		gbc_VERDE_VEGETAL.insets = new Insets(0, 0, 5, 0);
		gbc_VERDE_VEGETAL.gridx = 2;
		gbc_VERDE_VEGETAL.gridy = 4;
		frame.getContentPane().add(VERDE_VEGETAL, gbc_VERDE_VEGETAL);
		checkboxesSabores.add(VERDE_VEGETAL);
		
		final JCheckBox ESPECIARIAS = new JCheckBox("Especiarias");
		ESPECIARIAS.setToolTipText("ESPECIARIAS");
		GridBagConstraints gbc_ESPECIARIAS = new GridBagConstraints();
		gbc_ESPECIARIAS.insets = new Insets(0, 0, 5, 5);
		gbc_ESPECIARIAS.gridx = 0;
		gbc_ESPECIARIAS.gridy = 5;
		frame.getContentPane().add(ESPECIARIAS, gbc_ESPECIARIAS);
		checkboxesSabores.add(ESPECIARIAS);
		
		final JCheckBox ASSADO = new JCheckBox("Assado");
		ASSADO.setToolTipText("ASSADO");
		GridBagConstraints gbc_ASSADO = new GridBagConstraints();
		gbc_ASSADO.insets = new Insets(0, 0, 5, 5);
		gbc_ASSADO.gridx = 1;
		gbc_ASSADO.gridy = 5;
		frame.getContentPane().add(ASSADO, gbc_ASSADO);
		checkboxesSabores.add(ASSADO);
		
		final JCheckBox OUTROS = new JCheckBox("Outros");
		OUTROS.setToolTipText("OUTROS");
		GridBagConstraints gbc_OUTROS = new GridBagConstraints();
		gbc_OUTROS.insets = new Insets(0, 0, 5, 0);
		gbc_OUTROS.gridx = 2;
		gbc_OUTROS.gridy = 5;
		frame.getContentPane().add(OUTROS, gbc_OUTROS);
		checkboxesSabores.add(OUTROS);
		
		
		JLabel lblNewLabel_2 = new JLabel("Caf\u00E9 Recomendado");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 7;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.gridwidth = 2;
		gbc_textPane.insets = new Insets(0, 0, 5, 0);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 1;
		gbc_textPane.gridy = 7;
		frame.getContentPane().add(textPane, gbc_textPane);
		
		JLabel lblNewLabel_3 = new JLabel("Experimente Tamb\u00E9m");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 8;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		final JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		GridBagConstraints gbc_textPane_1 = new GridBagConstraints();
		gbc_textPane_1.gridwidth = 2;
		gbc_textPane_1.fill = GridBagConstraints.BOTH;
		gbc_textPane_1.gridx = 1;
		gbc_textPane_1.gridy = 8;
		frame.getContentPane().add(textPane_1, gbc_textPane_1);
		
		JButton btnRecomendar = new JButton("Recomendar");
		GridBagConstraints gbc_btnRecomendar = new GridBagConstraints();
		gbc_btnRecomendar.insets = new Insets(0, 0, 5, 0);
		gbc_btnRecomendar.gridwidth = 3;
		gbc_btnRecomendar.gridx = 0;
		gbc_btnRecomendar.gridy = 6;
		frame.getContentPane().add(btnRecomendar, gbc_btnRecomendar);
		btnRecomendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!t.isEmpty()) t.clear();
				if(!s.isEmpty()) s.clear();
				
				//Adicionando torras
				for (JCheckBox cb: checkboxesTorra) {
					if(cb.isSelected()) t.add(Torra.valueOf(cb.getToolTipText()));
				}

				//Adicionando sabores
				for (JCheckBox cb: checkboxesSabores) {
					if(cb.isSelected()) s.add(Sabores.valueOf(cb.getToolTipText()));
				}
				
				if(t.isEmpty()) {
					int j = JOptionPane.showConfirmDialog(frame,
							"Nenhuma torra foi escolhida. Deseja escolher todas?",
							"Aviso!",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.WARNING_MESSAGE);
					if (j == JOptionPane.YES_OPTION) {
						for (JCheckBox cb: checkboxesTorra) {
							cb.setSelected(true);
						}
					}
				}
				
				if(s.isEmpty()) {
					int k = JOptionPane.showConfirmDialog(frame,
							"Nenhum sabor foi escolhido. Deseja escolher todos?",
							"Aviso!",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.WARNING_MESSAGE);
					if (k == JOptionPane.YES_OPTION) {
						for (JCheckBox cb: checkboxesSabores) {
							cb.setSelected(true);
						}
					}
				}
				System.out.println(t);
				System.out.println(s);
				String[] recomendacao = Comparacao.recomendar(t,s);
				textPane.setText(recomendacao[0]);
				textPane_1.setText(recomendacao[1]);
				}
			}
		);
	}
}
