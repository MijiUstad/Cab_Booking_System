package com.CabBooking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Cancel_B implements ActionListener
{
    JFrame cancel_frame = new JFrame();
    JButton yes = new JButton("YES");
    JButton no = new JButton("NO");
    JLabel sure = new JLabel("Are you sure you wanna cancel ride?");

    Cancel_B()
    {
        cancel_frame.setSize(350,200);
        cancel_frame.setLayout(null);

        yes.setBounds(90,90,60,30);
        yes.setBackground(Color.red);
        yes.setForeground(Color.WHITE);
        yes.setFocusable(false);
        yes.addActionListener(this);

        no.setBounds(190,90,60,30);
        no.setBackground(Color.GREEN);
        no.setForeground(Color.WHITE);
        no.setFocusable(false);
        no.addActionListener(this);

        sure.setBounds(40,40,300,30);
        sure.setFont( new Font("Serif",Font.BOLD,14));

        cancel_frame.add(yes);
        cancel_frame.add(no);
        cancel_frame.add(sure);

        cancel_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cancel_frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == no)
        {
            cancel_frame.dispose();
            Picked_Ride_B picked_ride_b = new Picked_Ride_B();
        }
        else if (actionEvent.getSource() == yes)
        {
            cancel_frame.dispose();
            Cab_Owner_Panel_C cabOwnerPanelC = new Cab_Owner_Panel_C();
        }
    }
}
