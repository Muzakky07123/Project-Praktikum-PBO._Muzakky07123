package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Muzakky07123_UpdatePemasukanGUI {
    JFrame UpdatePemasukan = new JFrame();
    JLabel top,labelbulanin,labeljumat1,labeljumat2,labeljumat3,labeljumat4,labeljumat5,labelhijau,labeltpa,labellainlain,labeltglpmskn,labelptjpmskn;
    JTextField textbulanin,textjumat1,textjumat2,textjumat3,textjumat4,textjumat5,texthijau,texttpa,textlainlain,texttglpmskn,textptjpmskn;
    JButton update,back;
    
    public Muzakky07123_UpdatePemasukanGUI() {
        UpdatePemasukan.setSize(700, 650);
        UpdatePemasukan.setLayout(null);
        UpdatePemasukan.getContentPane().setBackground(Color.GREEN);
        
        top = new JLabel("Memperbarui Data Pemasukan");
        top.setBounds(10, 10, 450, 50);
        top.setFont(new Font("Matura MT Script Capitals",Font.TRUETYPE_FONT,30));
        UpdatePemasukan.add(top);
        
        labelbulanin = new JLabel("Bulan");
        labelbulanin.setBounds(490, 50, 50, 20);
        labelbulanin.setFont(new Font("Consolas",Font.BOLD,17));
        UpdatePemasukan.add(labelbulanin);
        
        textbulanin = new JTextField();
        textbulanin.setBounds(540, 50, 100, 20);
        textbulanin.setFont(new Font("Consolas",Font.TRUETYPE_FONT,17));
        UpdatePemasukan.add(textbulanin);
        
        labeljumat1 = new JLabel("Infaq Kotak Jumat I   : Rp.");
        labeljumat1.setBounds(20, 100, 300, 30);
        labeljumat1.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(labeljumat1);
        
        textjumat1 = new JTextField();
        textjumat1.setBounds(320, 100, 300, 30);
        textjumat1.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(textjumat1);
        
        labeljumat2 = new JLabel("Infaq Kotak Jumat II  : Rp.");
        labeljumat2.setBounds(20, 140, 300, 30);
        labeljumat2.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(labeljumat2);
        
        textjumat2 = new JTextField();
        textjumat2.setBounds(320, 140, 300, 30);
        textjumat2.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(textjumat2);
        
        labeljumat3 = new JLabel("Infaq Kotak Jumat III : Rp.");
        labeljumat3.setBounds(20, 180, 300, 30);
        labeljumat3.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(labeljumat3);
        
        textjumat3 = new JTextField();
        textjumat3.setBounds(320, 180, 300, 30);
        textjumat3.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(textjumat3);
        
        labeljumat4 = new JLabel("Infaq Kotak Jumat IV  : Rp.");
        labeljumat4.setBounds(20, 220, 300, 30);
        labeljumat4.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(labeljumat4);
        
        textjumat4 = new JTextField();
        textjumat4.setBounds(320, 220, 300, 30);
        textjumat4.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(textjumat4);
        
        labeljumat5 = new JLabel("Infaq Kotak Jumat V   : Rp.");
        labeljumat5.setBounds(20, 260, 300, 30);
        labeljumat5.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(labeljumat5);
        
        textjumat5 = new JTextField();
        textjumat5.setBounds(320, 260, 300, 30);
        textjumat5.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(textjumat5);
        
        labelhijau = new JLabel("Infaq Kotak Hijau     : Rp.");
        labelhijau.setBounds(20, 300, 300, 30);
        labelhijau.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(labelhijau);
        
        texthijau = new JTextField();
        texthijau.setBounds(320, 300, 300, 30);
        texthijau.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(texthijau);
        
        labeltpa = new JLabel("Infaq TPA             : Rp.");
        labeltpa.setBounds(20, 340, 300, 30);
        labeltpa.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(labeltpa);
        
        texttpa = new JTextField();
        texttpa.setBounds(320, 340, 300, 30);
        texttpa.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(texttpa);
        
        labellainlain = new JLabel("Infaq Lain-Lain       : Rp.");
        labellainlain.setBounds(20, 380, 300, 30);
        labellainlain.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(labellainlain);
        
        textlainlain = new JTextField();
        textlainlain.setBounds(320, 380, 300, 30);
        textlainlain.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePemasukan.add(textlainlain);
        
        labeltglpmskn = new JLabel("> Tanggal Perhitungan Pemasukan");
        labeltglpmskn.setBounds(20, 430, 300, 25);
        labeltglpmskn.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
        UpdatePemasukan.add(labeltglpmskn);
        
        texttglpmskn = new JTextField();
        texttglpmskn.setBounds(280, 430, 200, 25);
        texttglpmskn.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
        UpdatePemasukan.add(texttglpmskn);
        
        labelptjpmskn = new JLabel("> PenanggungJawab Pemasukan");
        labelptjpmskn.setBounds(20, 470, 300, 25);
        labelptjpmskn.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
        UpdatePemasukan.add(labelptjpmskn);
        
        textptjpmskn = new JTextField();
        textptjpmskn.setBounds(280, 470, 200, 25);
        textptjpmskn.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
        UpdatePemasukan.add(textptjpmskn);
        
        update = new JButton("Update");
        update.setBounds(550, 550, 100, 30);
        update.setBackground(Color.LIGHT_GRAY);
        UpdatePemasukan.add(update);
        
        back = new JButton("Back");
        back.setBounds(30, 550, 100, 30);
        back.setBackground(Color.RED);
        UpdatePemasukan.add(back);
        
        UpdatePemasukan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UpdatePemasukan.setVisible(true);
        UpdatePemasukan.setLocationRelativeTo(null);
        
        update.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent ae){
        try{
            for(int d=0; d<Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().size(); d++) {
            if(textbulanin.getText().equals(Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).getBulan1())) {
        int jumat1 = Integer.parseInt(textjumat1.getText());
                     Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setJumat1(jumat1);
        int jumat2 = Integer.parseInt(textjumat2.getText());
                     Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setJumat2(jumat2);
        int jumat3 = Integer.parseInt(textjumat3.getText());
                     Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setJumat3(jumat3);
        int jumat4 = Integer.parseInt(textjumat4.getText());
                     Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setJumat4(jumat4);
        int jumat5 = Integer.parseInt(textjumat5.getText());
                     Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setJumat5(jumat5);
        int hijau = Integer.parseInt(texthijau.getText());
                    Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setHijau(hijau);
        int tpa = Integer.parseInt(texttpa.getText());
                  Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setTpa(tpa);
        int lainlain = Integer.parseInt(textlainlain.getText());
                       Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setLainlain(lainlain);
        int jumlahpmskn = jumat1 + jumat2 + jumat3 + jumat4 + jumat5 + hijau + tpa + lainlain;
                          Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setJumlah1(jumlahpmskn);
        Date tglpmskn = new Date(texttglpmskn.getText());
                        Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setTglData(tglpmskn);
        String ptjpmskn = textptjpmskn.getText();
                          Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(d).setPersonData(ptjpmskn);
        JOptionPane.showMessageDialog(null,"Data Telah Diperbarui", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
            }
        }
        catch(Exception exception) {
        JOptionPane.showMessageDialog(null,"Format Penulisan Salah", "Perbaruan Gagal",JOptionPane. INFORMATION_MESSAGE);
        }
        }
        });
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                UpdatePemasukan.dispose();
                Muzakky07123_GUI GUI = new Muzakky07123_GUI();
            }
        });
    }
    
    void kosong(){
        textbulanin.setText(null);
        textjumat1.setText(null);
        textjumat2.setText(null);
        textjumat3.setText(null);
        textjumat4.setText (null);
        textjumat5.setText(null);
        texthijau.setText(null);
        texttpa.setText(null);
        textlainlain.setText(null);
        texttglpmskn.setText(null);
        textptjpmskn.setText(null);
    }
    
}