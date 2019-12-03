import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TextChange {

	public TextChange() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					JFrame j = new JFrame("Mouse");
					j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					j.setSize(400, 300);
					j.setLayout(null);
					JButton butt = new JButton("button");
					
					
					j.addMouseMotionListener(new MouseMotionListener() {
						
						@Override
						public void mouseMoved(MouseEvent e) {
							// TODO Auto-generated method stub
							
							butt.setBounds(e.getX() , e.getY(),80 ,50);
						}
						
						@Override
						public void mouseDragged(MouseEvent e) {
							// TODO Auto-generated method stub
							
							
						}
					});
					
					j.addMouseListener(new MouseListener()
							{
								int pos =0 ;

								@Override
								public void mouseClicked(MouseEvent e) {
									// TODO Auto-generated method stub
									pos++;
									if(pos % 2 == 1 )
									{
									butt.setLabel("Ok U Click");
									}else {
										butt.setLabel("Button");
									}
										//int x = 30;
									//butt.setSize(butt.getWidth()+x, butt.getHeight()+x);
								}

								@Override
								public void mousePressed(MouseEvent e) {
									// TODO Auto-generated method stub
									
								}

								@Override
								public void mouseReleased(MouseEvent e) {
									// TODO Auto-generated method stub
									
								}

								@Override
								public void mouseEntered(MouseEvent e) {
									// TODO Auto-generated method stub
									
								}

								@Override
								public void mouseExited(MouseEvent e) {
									// TODO Auto-generated method stub
									
								}
						
							});
					j.add(butt);
					j.setVisible(true);
				}
			});
	}

}
