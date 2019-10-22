package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{

    private JPanel panel;
    private JButton AddButton;
    public JList list1;
    private JButton DeleteButton;
    private Dialog d;

    public Form () {
        this.getContentPane().add(panel);
    }

    public void setForm() {
        d = new Dialog(this);
        d.setLocation(550, 250);
        d.pack();
        d.setVisible(false);
        d.setSize(200, 200);

        this.setLocation(400, 150);
        this.pack();
        this.setVisible(true);
        this.setSize(500, 350);
        this.AddButton.addActionListener(new AddButtonListener());
        this.DeleteButton.addActionListener(new DeleteButtonListener());
    }

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            d.setVisible(true);
        }
    }

    private class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            d.bag.objects.clear();
            list1.setListData(new String [0]);
        }
    }
}