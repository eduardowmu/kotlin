package ui;

import javax.swing.*;

public class MainForm extends JFrame{
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemove;
    private JTable table1;

    public MainForm() {
        this.setContentPane(this.rootPanel);
        this.setSize(500, 250);
        this.setVisible(true);
    }
}
