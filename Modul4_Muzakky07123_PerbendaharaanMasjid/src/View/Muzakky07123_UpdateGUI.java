package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Muzakky07123_UpdateGUI {
    JFrame Update = new JFrame();
    JLabel top;
    JButton updatepmskn,updatepnglrn,back;
    
    public Muzakky07123_UpdateGUI() {
        Update.setSize(360, 350);
        Update.setLayout(null);
        Update.getContentPane().setBackground(Color.GREEN);
        
        top = new JLabel("Menu Update");
        top.setBounds(10, 10, 200, 50);
        top.setFont(new Font("Matura MT Script Capitals",Font.TRUETYPE_FONT,30));
        Update.add(top);
        
        updatepmskn = new JButton("UPDATE PEMASUKAN");
        updatepmskn.setBounds(60, 100, 220, 30);
        updatepmskn.setFont(new Font("Arial",Font.BOLD,15));
        updatepmskn.setBackground(Color.BLUE);
        Update.add(updatepmskn);
        
        updatepnglrn = new JButton("UPDATE PENGELUARAN");
        updatepnglrn.setBounds(60, 150, 220, 30);
        updatepnglrn.setFont(new Font("Arial",Font.BOLD,15));
        updatepnglrn.setBackground(Color.BLUE);
        Update.add(updatepnglrn);
        
        back = new JButton("Back");
        back.setBounds(30, 250, 100, 30);
        back.setBackground(Color.RED);
        Update.add(back);
        
        Update.setVisible(true);
        Update.setLocationRelativeTo(null);
        Update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        updatepmskn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                Update.dispose();
                Muzakky07123_UpdatePemasukanGUI UpdatePemsukan = new Muzakky07123_UpdatePemasukanGUI();
            }
        });
        
        updatepnglrn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                Update.dispose();
                Muzakky07123_UpdatePengeluaranGUI UpdatePengeluaran = new Muzakky07123_UpdatePengeluaranGUI();
            }
        });
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                Update.dispose();
                Muzakky07123_GUI GUI = new Muzakky07123_GUI();
            }
        });
    }
    
}