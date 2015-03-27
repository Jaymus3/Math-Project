package com.zaleus3.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculateHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double width, length, area;
             
            length = Double.parseDouble(GUIInit.lengthTF.getText());
            width = Double.parseDouble(GUIInit.widthTF.getText());
            area = length * width;
             
            GUIInit.areaTF.setText("" + area);
        }

    }

