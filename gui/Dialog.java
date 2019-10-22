package com.company;

import com.company.threeDimension.Cylinder;
import com.company.threeDimension.Sphere;
import com.company.threeDimension.Taper;

import javax.swing.*;
import java.awt.event.*;

public class Dialog extends JDialog {

    private JPanel contentPane;
    private JTextField TextField;
    private JButton RadiusButton;
    private JComboBox comboBox1;
    private Form form;
    public Knapsack bag = new Knapsack(1000);

    public Dialog(Form f) {
        this.form = f;
        this.getContentPane().add(contentPane);
        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.RadiusButton.addActionListener(new RadiusActionListener());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    private class RadiusActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            switch (comboBox1.getSelectedIndex()) {
                case 0:
                    Sphere sphere = new Sphere(Integer.parseInt(TextField.getText()));
                    try {
                        bag.add(sphere);
                    } catch (BagException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 1:
                    Cylinder cylinder = new Cylinder(Integer.parseInt(TextField.getText()), 5);
                    try {
                        bag.add(cylinder);
                    } catch (BagException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    Taper taper = new Taper(Integer.parseInt(TextField.getText()), 5);
                    try {
                        bag.add(taper);
                    } catch (BagException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }

            String [] array = new String [bag.objects.size()];
            for (int i = 0; i < bag.objects.size(); i++) {
                if (bag.objects.get(i) instanceof Sphere) {
                    array[i] ="Сфера с объемом  " +  Double.toString(bag.objects.get(i).getVolume());
                }
                if (bag.objects.get(i) instanceof Taper) {
                    array[i] ="Конус с объемом  " +  Double.toString(bag.objects.get(i).getVolume());
                }
                if (bag.objects.get(i) instanceof Cylinder) {
                    array[i] ="Цилиндр с объемом  " +  Double.toString(bag.objects.get(i).getVolume());
                }
            }
            form.list1.setListData(array);
            form.list1.setSelectedIndex(0);
            onCancel();
        }
    }
}
