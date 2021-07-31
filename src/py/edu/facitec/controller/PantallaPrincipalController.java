package py.edu.facitec.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import py.edu.facitec.app.PantallaPrincipal;

public class PantallaPrincipalController implements ActionListener {
	
	private PantallaPrincipal ventana;
	private int sapo, xs, ys, nivel, xm, ym;
	private int v[] = new int[12];

	public PantallaPrincipalController(PantallaPrincipal pantallaPrincipal) {
		super();
		this.ventana = pantallaPrincipal;
		setUpEvents();
		estadoInicial();
	}
	
	private void setUpEvents() {
		ventana.getBtnGirar().addActionListener(this);
		ventana.getBtnPaso().addActionListener(this);
		ventana.getBtnSaltar().addActionListener(this);
		ventana.getBtnReintentar().addActionListener(this);
		ventana.getMntmNivel1().addActionListener(this);
		ventana.getMntmNivel2().addActionListener(this);
		ventana.getMntmNivel3().addActionListener(this);
		ventana.getMntmNivel4().addActionListener(this);
		ventana.getMntmNivel5().addActionListener(this);
		ventana.getMntmNivel6().addActionListener(this);
		ventana.getMntmNivel7().addActionListener(this);
		ventana.getMntmNivel8().addActionListener(this);
		ventana.getMntmNivel9().addActionListener(this);
		ventana.getMntmNivel10().addActionListener(this);
	}

	private void estadoInicial() {
		ventana.getLblPremio().setVisible(false);
		ventana.getLblSapo().setVisible(false);
		ventana.getLblRayo1().setVisible(false);
		ventana.getLblRayo2().setVisible(false);
		ventana.getLblRayo3().setVisible(false);
		ventana.getLblRayo4().setVisible(false);
		ventana.getLblRayo5().setVisible(false);
		ventana.getLblRayo6().setVisible(false);
		habilitacionDeBotones(false);
	}
	
	private void nivel1() {
		xs = 96; ys = 186;
		xm = 324; ym= 186;
		nivel = 1; sapo = 2;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setVisible(false);
		ventana.getLblRayo2().setVisible(false);
		ventana.getLblRayo3().setVisible(false);
		ventana.getLblRayo4().setVisible(false);
		ventana.getLblRayo5().setVisible(false);
		ventana.getLblRayo6().setVisible(false);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void nivel2() {
		xs = 96; ys = 186; xm = 400; ym= 186; nivel = 2; sapo = 2;
		v[0] = 248; v[1] = 186;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setLocation(v[0], v[1]);
		ventana.getLblRayo1().setVisible(true);
		ventana.getLblRayo2().setVisible(false);
		ventana.getLblRayo3().setVisible(false);
		ventana.getLblRayo4().setVisible(false);
		ventana.getLblRayo5().setVisible(false);
		ventana.getLblRayo6().setVisible(false);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void nivel3() {
		xs = 96; ys = 186; xm = 400; ym= 186; nivel = 3; sapo = 2;
		v[0] = 248; v[1] = 186; v[2] = 324; v[3] = 186;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setLocation(v[0], v[1]);
		ventana.getLblRayo1().setVisible(true);
		ventana.getLblRayo2().setLocation(v[2], v[3]);
		ventana.getLblRayo2().setVisible(true);
		ventana.getLblRayo3().setVisible(false);
		ventana.getLblRayo4().setVisible(false);
		ventana.getLblRayo5().setVisible(false);
		ventana.getLblRayo6().setVisible(false);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void nivel4() {
		xs = 172; ys = 186; xm = 476; ym= 186; nivel = 4; sapo = 4;
		v[0] = 172; v[1] = 123; v[2] = 324; v[3] = 186; v[4] = 476; v[5] = 249;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setLocation(v[0], v[1]);
		ventana.getLblRayo1().setVisible(true);
		ventana.getLblRayo2().setLocation(v[2], v[3]);
		ventana.getLblRayo2().setVisible(true);
		ventana.getLblRayo3().setLocation(v[4], v[5]);
		ventana.getLblRayo3().setVisible(true);
		ventana.getLblRayo4().setVisible(false);
		ventana.getLblRayo5().setVisible(false);
		ventana.getLblRayo6().setVisible(false);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void nivel5() {
		xs = 324; ys = 312; xm = 476; ym= 312; nivel = 5; sapo = 1;
		v[0] = 400; v[1] = 312; v[2] = 400; v[3] = 249; v[4] = 400; v[5] = 375;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setLocation(v[0], v[1]);
		ventana.getLblRayo1().setVisible(true);
		ventana.getLblRayo2().setLocation(v[2], v[3]);
		ventana.getLblRayo2().setVisible(true);
		ventana.getLblRayo3().setLocation(v[4], v[5]);
		ventana.getLblRayo3().setVisible(true);
		ventana.getLblRayo4().setVisible(false);
		ventana.getLblRayo5().setVisible(false);
		ventana.getLblRayo6().setVisible(false);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void nivel6() {
		xs = 324; ys = 312; xm = 476; ym= 312; nivel = 6; sapo = 1;
		v[0] = 400; v[1] = 312; v[2] = 400; v[3] = 249; v[4] = 400; v[5] = 375; v[6] = 324; v[7] = 501;  v[8] = 400; v[9] = 501;  v[10] = 476; v[11] = 375;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setLocation(v[0], v[1]);
		ventana.getLblRayo1().setVisible(true);
		ventana.getLblRayo2().setLocation(v[2], v[3]);
		ventana.getLblRayo2().setVisible(true);
		ventana.getLblRayo3().setLocation(v[4], v[5]);
		ventana.getLblRayo3().setVisible(true);
		ventana.getLblRayo4().setLocation(v[6], v[7]);
		ventana.getLblRayo4().setVisible(true);
		ventana.getLblRayo5().setLocation(v[8], v[9]);
		ventana.getLblRayo5().setVisible(true);
		ventana.getLblRayo6().setLocation(v[10], v[11]);
		ventana.getLblRayo6().setVisible(true);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void nivel7() {
		xs = 324; ys = 249; xm = 476; ym= 186; nivel = 7; sapo = 1;
		v[0] = 400; v[1] = 186; v[2] = 400; v[3] = 249; v[4] = 324; v[5] = 186; v[6] = 476; v[7] = 249; v[8] = 476; v[9] = 123; v[10] = 476; v[11] = 375;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setLocation(v[0], v[1]);
		ventana.getLblRayo1().setVisible(true);
		ventana.getLblRayo2().setLocation(v[2], v[3]);
		ventana.getLblRayo2().setVisible(true);
		ventana.getLblRayo3().setLocation(v[4], v[5]);
		ventana.getLblRayo3().setVisible(true);
		ventana.getLblRayo4().setLocation(v[6], v[7]);
		ventana.getLblRayo4().setVisible(true);
		ventana.getLblRayo5().setLocation(v[8], v[9]);
		ventana.getLblRayo5().setVisible(true);
		ventana.getLblRayo6().setLocation(v[10], v[11]);
		ventana.getLblRayo6().setVisible(true);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void nivel8() {
		xs = 96; ys = 501; xm = 248; ym= 438; nivel = 8; sapo = 4;
		v[0] = 172; v[1] = 438; v[2] = 172; v[3] = 501; v[4] = 172; v[5] = 375;v[6] = 324; v[7] = 312; v[8] = 172; v[9] = 249; v[10] = 248; v[11] = 249;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setLocation(v[0], v[1]);
		ventana.getLblRayo1().setVisible(true);
		ventana.getLblRayo2().setLocation(v[2], v[3]);
		ventana.getLblRayo2().setVisible(true);
		ventana.getLblRayo3().setLocation(v[4], v[5]);
		ventana.getLblRayo3().setVisible(true);
		ventana.getLblRayo4().setLocation(v[6], v[7]);
		ventana.getLblRayo4().setVisible(true);
		ventana.getLblRayo5().setLocation(v[8], v[9]);
		ventana.getLblRayo5().setVisible(true);
		ventana.getLblRayo6().setLocation(v[10], v[11]);
		ventana.getLblRayo6().setVisible(true);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void nivel9() {
		xs = 400; ys = 123; xm = 172; ym= 123; nivel = 9; sapo = 2;
		v[0] = 324; v[1] = 123; v[2] = 248; v[3] = 123; v[4] = 324; v[5] = 186;v[6] = 172; v[7] = 186; v[8] = 172; v[9] = 60; v[10] = 96; v[11] = 60;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setLocation(v[0], v[1]);
		ventana.getLblRayo1().setVisible(true);
		ventana.getLblRayo2().setLocation(v[2], v[3]);
		ventana.getLblRayo2().setVisible(true);
		ventana.getLblRayo3().setLocation(v[4], v[5]);
		ventana.getLblRayo3().setVisible(true);
		ventana.getLblRayo4().setLocation(v[6], v[7]);
		ventana.getLblRayo4().setVisible(true);
		ventana.getLblRayo5().setLocation(v[8], v[9]);
		ventana.getLblRayo5().setVisible(true);
		ventana.getLblRayo6().setLocation(v[10], v[11]);
		ventana.getLblRayo6().setVisible(true);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void nivel10() {
		xs = 324; ys =438 ; xm = 96; ym= 501; nivel = 10; sapo = 4;
		v[0] = 172; v[1] = 438; v[2] = 172; v[3] = 501; v[4] = 172; v[5] = 375;v[6] = 248; v[7] = 438; v[8] = 172; v[9] = 249; v[10] = 248; v[11] = 249;
		ventana.getLblSapo().setLocation(xs, ys);
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getLblPremio().setLocation(xm, ym);
		ventana.getLblPremio().setVisible(true);
		ventana.getLblSapo().setVisible(true);
		ventana.getLblRayo1().setLocation(v[0], v[1]);
		ventana.getLblRayo1().setVisible(true);
		ventana.getLblRayo2().setLocation(v[2], v[3]);
		ventana.getLblRayo2().setVisible(true);
		ventana.getLblRayo3().setLocation(v[4], v[5]);
		ventana.getLblRayo3().setVisible(true);
		ventana.getLblRayo4().setLocation(v[6], v[7]);
		ventana.getLblRayo4().setVisible(true);
		ventana.getLblRayo5().setLocation(v[8], v[9]);
		ventana.getLblRayo5().setVisible(true);
		ventana.getLblRayo6().setLocation(v[10], v[11]);
		ventana.getLblRayo6().setVisible(true);
		ventana.getTfAlgoritmo().setText("INICIO");
		habilitacionDeBotones(true);
	}
	
	private void girar() {
		if(sapo==4) sapo=1; else sapo++;
		ventana.getLblSapo().setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/py/edu/facitec/img/"+sapo+".png")));
		ventana.getTfAlgoritmo().setText(ventana.getTfAlgoritmo().getText()+" \n   Girar");
	}
	
	private void paso() {
		switch (sapo) {
		case 1:
			ys = ys-63;
			break;
		case 2:
			xs = xs+76;
			break;
		case 3:
			ys = ys+63;
			break;
		case 4:
			xs = xs-76;
			break;
		}
		ventana.getTfAlgoritmo().setText(ventana.getTfAlgoritmo().getText()+" \n   Paso");
		limitesDeSalida();
	}
	
	private void salto() {
		switch (sapo) {
		case 1:
			ys = ys-126;
			break;
		case 2:
			xs = xs+152;
			break;
		case 3:
			ys = ys+126;
			break;
		case 4:
			xs = xs-152;
			break;
		}
		ventana.getTfAlgoritmo().setText(ventana.getTfAlgoritmo().getText()+" \n   Salto");
		limitesDeSalida();

	}
	
	private void limitesDeSalida() {
		if(xs<96 | ys>504 | xs>630 | ys<60) {
			ventana.getLblSapo().setVisible(false);
			ventana.getTfAlgoritmo().setText(ventana.getTfAlgoritmo().getText()+" \n FIN  \n \n Resultado: MUERTO");
			ventana.getBtnGirar().setEnabled(false);
			ventana.getBtnPaso().setEnabled(false);
			ventana.getBtnSaltar().setEnabled(false);
		}else {
			if(xs == xm && ys == ym) {
				ventana.getLblPremio().setVisible(false);
				ventana.getTfAlgoritmo().setText(ventana.getTfAlgoritmo().getText()+" \n FIN  \n \n Resultado: \n ALIMENTADO");
				habilitacionDeBotones(false);
			}else {
				if(xs==v[0] && ys==v[1] || xs==v[2] && ys==v[3] || xs==v[4] && ys==v[5] || xs==v[6] && ys==v[7]
						|| xs==v[8] && ys==v[9] || xs==v[10] && ys==v[11]) {
					ventana.getTfAlgoritmo().setText(ventana.getTfAlgoritmo().getText()+" \n FIN  \n \n Resultado: MUERTO");
					habilitacionDeBotones(false);
				}
			}
		}
		ventana.getLblSapo().setLocation(xs, ys);
//		System.out.println(xs+" "+ ys);
	}
	
	private void habilitacionDeBotones(boolean b) {
		ventana.getBtnGirar().setEnabled(b);
		ventana.getBtnPaso().setEnabled(b);
		ventana.getBtnSaltar().setEnabled(b);
	}
	
	private void reintentarNivel() {
		switch (nivel) {
		case 1:
			nivel1();
			break;
		case 2:
			nivel2();
			break;
		case 3:
			nivel3();
			break;
		case 4:
			nivel4();
			break;
		case 5:
			nivel5();
			break;
		case 6:
			nivel6();
			break;
		case 7:
			nivel7();
			break;
		case 8:
			nivel8();
			break;
		case 9:
			nivel9();
			break;
		case 10:
			nivel10();
			break;
		}
		System.out.println(xs+" "+ ys);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Reintentar":
			reintentarNivel();
			break;
		case "GIRAR":
			girar();
			break;
		case "PASO":
			paso();
			break;
		case "SALTAR":
			salto();
			break;
		case "Nivel 1":
			nivel1();
			break;
		case "Nivel 2":
			nivel2();
			break;
		case "Nivel 3":
			nivel3();
			break;
		case "Nivel 4":
			nivel4();
			break;
		case "Nivel 5":
			nivel5();
			break;
		case "Nivel 6":
			nivel6();
			break;
		case "Nivel 7":
			nivel7();
			break;
		case "Nivel 8":
			nivel8();
			break;
		case "Nivel 9":
			nivel9();
			break;
		case "Nivel 10":
			nivel10();
			break;
		}
	}
	
	

}
