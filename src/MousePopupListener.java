import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class MousePopupListener implements MouseListener {

	JPopupMenu popup;
	Component ventana;
	
	public MousePopupListener(JPopupMenu popup, VentanaPrincipal auxVentana) {
		this.popup = popup;
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(SwingUtilities.isRightMouseButton(arg0)) {
			
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	private void checkPopup(MouseEvent e) {
		if(e.isPopupTrigger()) {
		popup.show(ventana, e.getX(), e.getY());
		}
	}
}
