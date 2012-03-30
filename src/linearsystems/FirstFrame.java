
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class FirstFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 3133917569587588766L;
	private JPanel[] panels = new JPanel[3];
	private final JLabel equationNumLabel = new JLabel(
			"Number of equations:");
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
		panels[0].setLayout(new GridBagLayout());
		JTextField[] fields = new JTextField[1];
		addItem(panels[0], equationNumLabel, 200, 300, 10, 10,
				GridBagConstraints.WEST);
		addItem(panels[0], equationNumberBox, 500, 300, 10, 10,
				GridBagConstraints.NORTH);
		addItem(panels[0], new JButton("Next"), 500, 500, 10, 10,
				GridBagConstraints.EAST);
		panels[0].setLocation(1, 1);
		add(panels[0]);
		panels[0].setSize(400, 400);
		panels[0].setVisible(true);
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
