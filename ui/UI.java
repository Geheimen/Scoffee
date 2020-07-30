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
		
		final JCheckBox chckbxTorraClara = new JCheckBox("Clara");
		GridBagConstraints gbc_chckbxTorraClara = new GridBagConstraints();
		gbc_chckbxTorraClara.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxTorraClara.gridx = 0;
		gbc_chckbxTorraClara.gridy = 1;
		frame.getContentPane().add(chckbxTorraClara, gbc_chckbxTorraClara);
		checkboxesTorra.add(chckbxTorraClara);
		
		final JCheckBox chckbxTorraMedia = new JCheckBox("M\u00E9dia");
		GridBagConstraints gbc_chckbxTorraMedia = new GridBagConstraints();
		gbc_chckbxTorraMedia.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxTorraMedia.gridx = 1;
		gbc_chckbxTorraMedia.gridy = 1;
		frame.getContentPane().add(chckbxTorraMedia, gbc_chckbxTorraMedia);
		checkboxesTorra.add(chckbxTorraMedia);
		
		final JCheckBox chckbxTorraEscura = new JCheckBox("Escura");
		GridBagConstraints gbc_chckbxTorraEscura = new GridBagConstraints();
		gbc_chckbxTorraEscura.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxTorraEscura.gridx = 2;
		gbc_chckbxTorraEscura.gridy = 1;
		frame.getContentPane().add(chckbxTorraEscura, gbc_chckbxTorraEscura);
		checkboxesTorra.add(chckbxTorraEscura);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha o(s) sabore(s) desejados()");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		final JCheckBox chckbxSaborCacau = new JCheckBox("Noz/Cacau");
		GridBagConstraints gbc_chckbxSaborCacau = new GridBagConstraints();
		gbc_chckbxSaborCacau.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSaborCacau.gridx = 0;
		gbc_chckbxSaborCacau.gridy = 3;
		frame.getContentPane().add(chckbxSaborCacau, gbc_chckbxSaborCacau);
		checkboxesSabores.add(chckbxSaborCacau);
		
		final JCheckBox chckbxSaborDoce = new JCheckBox("Doce");
		GridBagConstraints gbc_chckbxSaborDoce = new GridBagConstraints();
		gbc_chckbxSaborDoce.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSaborDoce.gridx = 1;
		gbc_chckbxSaborDoce.gridy = 3;
		frame.getContentPane().add(chckbxSaborDoce, gbc_chckbxSaborDoce);
		checkboxesSabores.add(chckbxSaborDoce);
		
		final JCheckBox chckbxSaborFloral = new JCheckBox("Floral");
		GridBagConstraints gbc_chckbxSaborFloral = new GridBagConstraints();
		gbc_chckbxSaborFloral.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxSaborFloral.gridx = 2;
		gbc_chckbxSaborFloral.gridy = 3;
		frame.getContentPane().add(chckbxSaborFloral, gbc_chckbxSaborFloral);
		checkboxesSabores.add(chckbxSaborFloral);
		
		final JCheckBox chckbxSaborFrutado = new JCheckBox("Frutado");
		GridBagConstraints gbc_chckbxSaborFrutado = new GridBagConstraints();
		gbc_chckbxSaborFrutado.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSaborFrutado.gridx = 0;
		gbc_chckbxSaborFrutado.gridy = 4;
		frame.getContentPane().add(chckbxSaborFrutado, gbc_chckbxSaborFrutado);
		checkboxesSabores.add(chckbxSaborFrutado);
		
		final JCheckBox chckbxSaborAzedo = new JCheckBox("Azedo/Fermentado");
		GridBagConstraints gbc_chckbxSaborAzedo = new GridBagConstraints();
		gbc_chckbxSaborAzedo.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSaborAzedo.gridx = 1;
		gbc_chckbxSaborAzedo.gridy = 4;
		frame.getContentPane().add(chckbxSaborAzedo, gbc_chckbxSaborAzedo);
		checkboxesSabores.add(chckbxSaborAzedo);
		
		final JCheckBox chckbxSaborVegetal = new JCheckBox("Verde/Vegetal");
		GridBagConstraints gbc_chckbxSaborVegetal = new GridBagConstraints();
		gbc_chckbxSaborVegetal.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxSaborVegetal.gridx = 2;
		gbc_chckbxSaborVegetal.gridy = 4;
		frame.getContentPane().add(chckbxSaborVegetal, gbc_chckbxSaborVegetal);
		checkboxesSabores.add(chckbxSaborVegetal);
		
		final JCheckBox chckbxSaborEspeciarias = new JCheckBox("Especiarias");
		GridBagConstraints gbc_chckbxSaborEspeciarias = new GridBagConstraints();
		gbc_chckbxSaborEspeciarias.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSaborEspeciarias.gridx = 0;
		gbc_chckbxSaborEspeciarias.gridy = 5;
		frame.getContentPane().add(chckbxSaborEspeciarias, gbc_chckbxSaborEspeciarias);
		checkboxesSabores.add(chckbxSaborEspeciarias);
		
		final JCheckBox chckbxSaborAssado = new JCheckBox("Assado");
		GridBagConstraints gbc_chckbxSaborAssado = new GridBagConstraints();
		gbc_chckbxSaborAssado.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSaborAssado.gridx = 1;
		gbc_chckbxSaborAssado.gridy = 5;
		frame.getContentPane().add(chckbxSaborAssado, gbc_chckbxSaborAssado);
		checkboxesSabores.add(chckbxSaborAssado);
		
		final JCheckBox chckbxSaborOutros = new JCheckBox("Outros");
		GridBagConstraints gbc_chckbxSaborOutros = new GridBagConstraints();
		gbc_chckbxSaborOutros.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxSaborOutros.gridx = 2;
		gbc_chckbxSaborOutros.gridy = 5;
		frame.getContentPane().add(chckbxSaborOutros, gbc_chckbxSaborOutros);
		checkboxesSabores.add(chckbxSaborOutros);
		
		
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
				if(chckbxTorraClara.isSelected()) t.add(Torra.CLARA);
				if(chckbxTorraMedia.isSelected()) t.add(Torra.MEDIA);
				if(chckbxTorraEscura.isSelected()) t.add(Torra.ESCURA);
				if(chckbxSaborAssado.isSelected()) s.add(Sabores.ASSADO);
				if(chckbxSaborAzedo.isSelected()) s.add(Sabores.AZEDO_FERMENTADO);
				if(chckbxSaborDoce.isSelected()) s.add(Sabores.DOCE);
				if(chckbxSaborEspeciarias.isSelected()) s.add(Sabores.ESPECIARIAS);
				if(chckbxSaborFloral.isSelected()) s.add(Sabores.FLORAL);
				if(chckbxSaborFrutado.isSelected()) s.add(Sabores.FRUTADO);
				if(chckbxSaborCacau.isSelected()) s.add(Sabores.NOZ_CACAU);
				if(chckbxSaborOutros.isSelected()) s.add(Sabores.OUTROS);
				if(chckbxSaborVegetal.isSelected()) s.add(Sabores.VERDE_VEGETAL);
				
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
