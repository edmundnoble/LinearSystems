
package linearsystems;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class FirstFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 3133917569587588766L;
	private JPanel[] panels = new JPanel[3];
	private final JTextField equationNumberBox = new JTextField();
	private final ArrayList<JTextField> coefBoxes = new ArrayList<JTextField>(),
			constantBoxes = new ArrayList<JTextField>();
	private final JButton continueButton = new JButton("Next");

	public FirstFrame() {
		setTitle("Linear Systems");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < 3; i++) {
			panels[i] = new JPanel();
		}
		JPanel panel = panels[0];
		panel.setLayout(new GridBagLayout());
		JTextField[] fields = new JTextField[3];
		for (int i = 0; i < 3; i++) {
			fields[i] = new JTextField("", 10);
			addItem(panel, fields[i], 200 * i, 100 * i, 1000, 1000,
					GridBagConstraints.WEST);
		}
		addItem(panel, new JButton("LOL"), -250, 250, 250, 250,
				GridBagConstraints.EAST);
		panel.add(new JButton());
		panel.setLocation(1, 1);

		add(panel);
		panel.setSize(400, 400);
		panel.setVisible(true);
		setSize(400, 400);

		// panels.get(1).setSize(400, 400);
		// add(textField);
		// add(textField2);
		// panels.get(1).add(equationNumberBox);
		// add(panels.get(1));
		// panels.get(1).setVisible(true);
	}

	private void addItem(JPanel p, JComponent c, int x, int y, int width,
			int height, int align) {
		GridBagConstraints gbc = new GridBagConstraints();
		// gbc.weightx = 1;
		// gbc.weighty = 1;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.insets = new Insets(5, 1, 5, 5);
		gbc.anchor = align;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		p.add(c, gbc);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
