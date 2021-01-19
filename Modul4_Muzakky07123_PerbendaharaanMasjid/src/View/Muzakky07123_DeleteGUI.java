package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Muzakky07123_DeleteGUI {
    JFrame Delete = new JFrame();
    JLabel top,labelbulanin,labelbulanout;
    JTextField textbulanin,textbulanout;
    JButton deletepmskn,deletepnglrn,back;
    
    public Muzakky07123_DeleteGUI() {
        Delete.setSize(800, 350);
        Delete.setLayout(null);
        Delete.getContentPane().setBackground(Color.GREEN);
        
        top = new JLabel("Hapus Data");
        top.setBounds(10, 10, 200, 50);
        top.setFont(new Font("Matura MT Script Capitals",Font.TRUETYPE_FONT,30));
        Delete.add(top);
        
        labelbulanin = new JLabel("Bulan Pemasukan");
        labelbulanin.setBounds(20, 70, 200, 30);
        labelbulanin.setFont(new Font("Consolas",Font.BOLD,20));
        Delete.add(labelbulanin);
        
        textbulanin = new JTextField();
        textbulanin.setBounds(200, 70, 120, 30);
        textbulanin.setFont(new Font("Consolas",Font.TRUETYPE_FONT,15));
        Delete.add(textbulanin);
        
        deletepmskn = new JButton("DELETE PEMASUKAN");
        deletepmskn.setBounds(55, 120, 220, 30);
        deletepmskn.setFont(new Font("Arial",Font.BOLD,15));
        deletepmskn.setBackground(Color.GRAY);
        Delete.add(deletepmskn);
        
        labelbulanout = new JLabel("Bulan Pengeluaran");
        labelbulanout.setBounds(420, 70, 200, 30);
        labelbulanout.setFont(new Font("Consolas",Font.BOLD,20));
        Delete.add(labelbulanout);
        
        textbulanout = new JTextField();
        textbulanout.setBounds(620, 70, 120, 30);
        textbulanout.setFont(new Font("Consolas",Font.TRUETYPE_FONT,15));
        Delete.add(textbulanout);
        
        deletepnglrn = new JButton("DELETE PENGELUARAN");
        deletepnglrn.setBounds(470, 120, 220, 30);
        deletepnglrn.setFont(new Font("Arial",Font.BOLD,15));
        deletepnglrn.setBackground(Color.GRAY);
        Delete.add(deletepnglrn);
        
        back = new JButton("Back");
        back.setBounds(30, 250, 100, 30);
        back.setBackground(Color.RED);
        Delete.add(back);
        
        Delete.setVisible(true);
        Delete.setLocationRelativeTo(null);
        Delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        deletepmskn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                for(int f=0; f<Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().size(); f++) {
                    if(textbulanin.getText().equals(Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(f).getBulan1())) {
                        Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().remove(Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(f));
                    JOptionPane.showMessageDialog(null,"Data Pemasukan Telah Terhapus", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                kosong();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Belum Ada Data Pemasukan", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });
        
        deletepnglrn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                for(int g=0; g<Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().size(); g++) {
                    if(textbulanout.getText().equals(Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(g).getBulan2())) {
                        Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().remove(Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(g));
                    JOptionPane.showMessageDialog(null,"Data Pengeluaran Telah Terhapus", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                kosong();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Belum Ada Data Pengeluaran", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                Delete.dispose();
                Muzakky07123_GUI GUI = new Muzakky07123_GUI();
            }
        });
    }
    
    void kosong(){
        textbulanin.setText(null);
        textbulanout.setText(null);
    }
    
}