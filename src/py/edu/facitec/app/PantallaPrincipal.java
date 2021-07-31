package py.edu.facitec.app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;

import py.edu.facitec.controller.PantallaPrincipalController;

public class PantallaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblSapo;
	private JLabel lblPremio;
	private JLabel lblRayo1;
	private JLabel lblRayo2;
	private JLabel lblRayo3;
	private JLabel lblRayo4;
	private JLabel lblRayo5;
	private JLabel lblRayo6;
	private JButton btnReintentar;
	private JButton btnSaltar;
	private JButton btnGirar;
	private JButton btnPaso;
	private JTextArea tfAlgoritmo;
	private JMenuItem mntmNivel1;
	private JMenuItem mntmNivel2;
	private JMenuItem mntmNivel3;
	private JMenuItem mntmNivel4;
	private JMenuItem mntmNivel5;
	private JMenuItem mntmNivel6;
	private JMenu mnNivelesAvanzados;
	private JMenuItem mntmNivel7;
	private JMenuItem mntmNivel8;
	private JMenuItem mntmNivel9;
	private JMenuItem mntmNivel10;
	private JMenuItem mntmInstrucciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// PARA QUITAR EL TEXTO DEL JTATTOO
					Properties props = new Properties();
					props.put("logoString", "");
					GraphiteLookAndFeel.setCurrentTheme(props);
					UIManager.setLookAndFeel(GraphiteLookAndFeel.class.getName());
					// PARA QUITAR EL BORDE DEL TEMA JTATTOO
//					DecorationHelper.decorateWindows(false);
					PantallaPrincipal frame = new PantallaPrincipal();
					frame.setUpController();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void setUpController() {
		new PantallaPrincipalController(this);
	}

	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setTitle("Atrapa a la mosca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		setLocationRelativeTo(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Niveles Basicos");
		mnNewMenu.setMargin(new Insets(2, 10, 2, 10));
		menuBar.add(mnNewMenu);
		
		mntmNivel1 = new JMenuItem("Nivel 1");
		mnNewMenu.add(mntmNivel1);
		
		mntmNivel2 = new JMenuItem("Nivel 2");
		mnNewMenu.add(mntmNivel2);
		
		mntmNivel3 = new JMenuItem("Nivel 3");
		mnNewMenu.add(mntmNivel3);
		
		mntmNivel4 = new JMenuItem("Nivel 4");
		mnNewMenu.add(mntmNivel4);
		
		mntmNivel5 = new JMenuItem("Nivel 5");
		mnNewMenu.add(mntmNivel5);
		
		mntmNivel6 = new JMenuItem("Nivel 6");
		mnNewMenu.add(mntmNivel6);
		
		mnNivelesAvanzados = new JMenu("Niveles Avanzados");
		mnNivelesAvanzados.setMargin(new Insets(2, 10, 2, 10));
		menuBar.add(mnNivelesAvanzados);
		
		mntmNivel7 = new JMenuItem("Nivel 7");
		mnNivelesAvanzados.add(mntmNivel7);
		
		mntmNivel8 = new JMenuItem("Nivel 8");
		mnNivelesAvanzados.add(mntmNivel8);
		
		mntmNivel9 = new JMenuItem("Nivel 9");
		mnNivelesAvanzados.add(mntmNivel9);
		
		mntmNivel10 = new JMenuItem("Nivel 10");
		mnNivelesAvanzados.add(mntmNivel10);
		
		JMenu mnNewMenu_1 = new JMenu("Ayuda");
		mnNewMenu_1.setMargin(new Insets(2, 10, 2, 10));
		menuBar.add(mnNewMenu_1);
		
		mntmInstrucciones = new JMenuItem("Instrucciones");
		mnNewMenu_1.add(mntmInstrucciones);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(150, 29, 800, 601);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblSapo = new JLabel("");
		lblSapo.setBounds(96, 123, 67, 54);
		panel.add(lblSapo);
		
		lblPremio = new JLabel("");
		lblPremio.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/mosca.png")));
		lblPremio.setBounds(325, 186, 67, 54);
		panel.add(lblPremio);
				
		lblRayo1 = new JLabel("");
		lblRayo1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/electrico.png")));
		lblRayo1.setBounds(96, 501, 67, 54);
		panel.add(lblRayo1);
		
		lblRayo2 = new JLabel("");
		lblRayo2.setBounds(172, 501, 67, 54);
		lblRayo2.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/electrico.png")));
		panel.add(lblRayo2);
		
		lblRayo3 = new JLabel("");
		lblRayo3.setBounds(248, 501, 67, 54);
		lblRayo3.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/electrico.png")));
		panel.add(lblRayo3);
		
		lblRayo4 = new JLabel("");
		lblRayo4.setBounds(325, 501, 67, 54);
		lblRayo4.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/electrico.png")));
		panel.add(lblRayo4);
		
		lblRayo5 = new JLabel("");
		lblRayo5.setBounds(402, 501, 67, 54);
		lblRayo5.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/electrico.png")));
		panel.add(lblRayo5);
		
		lblRayo6 = new JLabel("");
		lblRayo6.setBounds(479, 501, 67, 54);
		lblRayo6.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/electrico.png")));
		panel.add(lblRayo6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/fondo.png")));
		lblNewLabel.setBounds(89, 49, 625, 515);
		panel.add(lblNewLabel);
		
		tfAlgoritmo = new JTextArea();
		tfAlgoritmo.setEditable(false);
		tfAlgoritmo.setFont(new Font("Arial", Font.PLAIN, 20));
		tfAlgoritmo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tfAlgoritmo.setBounds(960, 29, 208, 597);
		contentPane.add(tfAlgoritmo);
		
		btnGirar = new JButton("GIRAR");
		btnGirar.setBounds(25, 66, 89, 23);
		contentPane.add(btnGirar);
		
		btnPaso = new JButton("PASO");
		btnPaso.setBounds(25, 131, 89, 23);
		contentPane.add(btnPaso);
		
		btnSaltar = new JButton("SALTAR");
		btnSaltar.setBounds(25, 200, 89, 23);
		contentPane.add(btnSaltar);
		
		btnReintentar = new JButton("Reintentar");
		btnReintentar.setBounds(10, 272, 120, 40);
		contentPane.add(btnReintentar);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getLblSapo() {
		return lblSapo;
	}

	public JLabel getLblPremio() {
		return lblPremio;
	}

	public JLabel getLblRayo1() {
		return lblRayo1;
	}

	public JLabel getLblRayo2() {
		return lblRayo2;
	}

	public JLabel getLblRayo3() {
		return lblRayo3;
	}

	public JLabel getLblRayo4() {
		return lblRayo4;
	}

	public JLabel getLblRayo5() {
		return lblRayo5;
	}

	public JLabel getLblRayo6() {
		return lblRayo6;
	}

	public JButton getBtnReintentar() {
		return btnReintentar;
	}

	public JButton getBtnSaltar() {
		return btnSaltar;
	}

	public JButton getBtnGirar() {
		return btnGirar;
	}

	public JButton getBtnPaso() {
		return btnPaso;
	}

	public JTextArea getTfAlgoritmo() {
		return tfAlgoritmo;
	}

	public JMenuItem getMntmNivel1() {
		return mntmNivel1;
	}

	public JMenuItem getMntmNivel2() {
		return mntmNivel2;
	}

	public JMenuItem getMntmNivel3() {
		return mntmNivel3;
	}

	public JMenuItem getMntmNivel4() {
		return mntmNivel4;
	}

	public JMenuItem getMntmNivel5() {
		return mntmNivel5;
	}

	public JMenuItem getMntmNivel6() {
		return mntmNivel6;
	}

	public JMenu getMnNivelesAvanzados() {
		return mnNivelesAvanzados;
	}

	public JMenuItem getMntmNivel7() {
		return mntmNivel7;
	}

	public JMenuItem getMntmNivel8() {
		return mntmNivel8;
	}

	public JMenuItem getMntmNivel9() {
		return mntmNivel9;
	}

	public JMenuItem getMntmNivel10() {
		return mntmNivel10;
	}

	public JMenuItem getMntmInstrucciones() {
		return mntmInstrucciones;
	}

}
