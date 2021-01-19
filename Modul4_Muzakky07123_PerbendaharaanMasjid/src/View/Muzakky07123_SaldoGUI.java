package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Muzakky07123_SaldoGUI {
    JFrame Saldo = new JFrame();
    JLabel top,labelbulanin,labelbulanout,labelsaldo;
    JTextField textbulanin,textbulanout;
    JButton cek,back;
    JTextArea hasil;
    
    public Muzakky07123_SaldoGUI() {
        Saldo.setSize(700, 400);
        Saldo.setLayout(null);
        Saldo.getContentPane().setBackground(Color.GREEN);
        
        top = new JLabel("Cek Saldo");
        top.setBounds(10, 10, 350, 50);
        top.setFont(new Font("Matura MT Script Capitals",Font.TRUETYPE_FONT,30));
        Saldo.add(top);
        
        labelbulanin = new JLabel("Bulan Pemasukan");
        labelbulanin.setBounds(20, 70, 200, 30);
        labelbulanin.setFont(new Font("Consolas",Font.BOLD,20));
        Saldo.add(labelbulanin);
        
        textbulanin = new JTextField();
        textbulanin.setBounds(220, 70, 120, 30);
        textbulanin.setFont(new Font("Consolas",Font.TRUETYPE_FONT,15));
        Saldo.add(textbulanin);
        
        labelbulanout = new JLabel("Bulan Pengeluaran");
        labelbulanout.setBounds(20, 120, 200, 30);
        labelbulanout.setFont(new Font("Consolas",Font.BOLD,20));
        Saldo.add(labelbulanout);
        
        textbulanout = new JTextField();
        textbulanout.setBounds(220, 120, 120, 30);
        textbulanout.setFont(new Font("Consolas",Font.TRUETYPE_FONT,15));
        Saldo.add(textbulanout);
        
        cek = new JButton("Cek Saldo");
        cek.setBounds(90, 200, 120, 30);
        cek.setFont(new Font("Arial",Font.BOLD,15));
        Saldo.add(cek);
        
        labelsaldo = new JLabel("Saldo");
        labelsaldo.setBounds(400, 100, 200, 30);
        labelsaldo.setFont(new Font("Consolas",Font.BOLD,20));
        Saldo.add(labelsaldo);
        
        hasil = new JTextArea();
        hasil.setEditable(false);
        hasil.setBounds(470, 100, 150, 30);
        hasil.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        Saldo.add(hasil);
        
        back = new JButton("Back");
        back.setBounds(30, 300, 100, 30);
        back.setBackground(Color.RED);
        Saldo.add(back);
        
        Saldo.setVisible(true);
        Saldo.setLocationRelativeTo(null);
        Saldo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cek.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().size() == 0)  {
                    for(int c=0; c<Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().size(); c++) {
                        if(textbulanin.getText().equals(Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(c).getBulan1())) {
                            String hasilsaldo1 = ""+Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(c).getJumlah1();
                            hasil.setText(hasilsaldo1);
                        }
                    }
                }
                else {
            for(int a=0; a<Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().size(); a++) {
            for(int b=0; b<Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().size(); b++) {
                    if(textbulanin.getText().equals(Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getBulan1()) && textbulanout.getText().equals(Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getBulan2())) {
                        int hitung = Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getJumlah1() - Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getJumlah2();
                        String hasilsaldo2 = ""+hitung;
                        hasil.setText(hasilsaldo2);
                    }
                }
            }
        }
            }
        });
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                Saldo.dispose();
                Muzakky07123_GUI GUI = new Muzakky07123_GUI();
            }
        });        
    }
    
}