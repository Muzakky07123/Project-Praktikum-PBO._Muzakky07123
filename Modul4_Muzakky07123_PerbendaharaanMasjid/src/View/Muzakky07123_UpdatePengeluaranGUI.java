package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Muzakky07123_UpdatePengeluaranGUI {
    JFrame UpdatePengeluaran = new JFrame();
    JLabel top,labelbulanout,labelibadah,labelkitab,labeltpa,labelkaddrah,labelkebersihan,labellistrik,labelair,labelsarana,labelkonsumsi,labeliventaris,labellainlain,labeltglpnglrn,labelptjpnglrn;
    JTextField textbulanout,textibadah,textkitab,texttpa,textkaddrah,textkebersihan,textlistrik,textair,textsarana,textkonsumsi,textiventaris,textlainlain,texttglpnglrn,textptjpnglrn;
    JButton update,back;
    
    public Muzakky07123_UpdatePengeluaranGUI() {
        UpdatePengeluaran.setSize(700, 730);
        UpdatePengeluaran.setLayout(null);
        UpdatePengeluaran.getContentPane().setBackground(Color.GREEN);
        
        top = new JLabel("Memperbarui Data Pengeluaran");
        top.setBounds(10, 10, 450, 50);
        top.setFont(new Font("Matura MT Script Capitals",Font.TRUETYPE_FONT,30));
        UpdatePengeluaran.add(top);
        
        labelbulanout = new JLabel("Bulan");
        labelbulanout.setBounds(490, 50, 50, 20);
        labelbulanout.setFont(new Font("Consolas",Font.BOLD,17));
        UpdatePengeluaran.add(labelbulanout);
        
        textbulanout = new JTextField();
        textbulanout.setBounds(540, 50, 100, 20);
        textbulanout.setFont(new Font("Consolas",Font.TRUETYPE_FONT,17));
        UpdatePengeluaran.add(textbulanout);
        
        labelibadah = new JLabel("Kegiatan Ibadah       : Rp.");
        labelibadah.setBounds(20, 100, 300, 30);
        labelibadah.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labelibadah);
        
        textibadah = new JTextField();
        textibadah.setBounds(320, 100, 300, 30);
        textibadah.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textibadah);
        
        labelkitab = new JLabel("Kegiatan Ngaji Kitab  : Rp.");
        labelkitab.setBounds(20, 140, 300, 30);
        labelkitab.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labelkitab);
        
        textkitab = new JTextField();
        textkitab.setBounds(320, 140, 300, 30);
        textkitab.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textkitab);
        
        labeltpa = new JLabel("Kegiatan TPA          : Rp.");
        labeltpa.setBounds(20, 180, 300, 30);
        labeltpa.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labeltpa);
        
        texttpa = new JTextField();
        texttpa.setBounds(320, 180, 300, 30);
        texttpa.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(texttpa);
        
        labelkaddrah = new JLabel("Kegiatan Kader/Hadrah : Rp.");
        labelkaddrah.setBounds(20, 220, 300, 30);
        labelkaddrah.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labelkaddrah);
        
        textkaddrah = new JTextField();
        textkaddrah.setBounds(320, 220, 300, 30);
        textkaddrah.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textkaddrah);
        
        labelkebersihan = new JLabel("Kebersihan            : Rp.");
        labelkebersihan.setBounds(20, 260, 300, 30);
        labelkebersihan.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labelkebersihan);
        
        textkebersihan = new JTextField();
        textkebersihan.setBounds(320, 260, 300, 30);
        textkebersihan.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textkebersihan);
        
        labellistrik = new JLabel("Listrik PLN           : Rp.");
        labellistrik.setBounds(20, 300, 300, 30);
        labellistrik.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labellistrik);
        
        textlistrik = new JTextField();
        textlistrik.setBounds(320, 300, 300, 30);
        textlistrik.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textlistrik);
        
        labelair = new JLabel("Air PDAM              : Rp.");
        labelair.setBounds(20, 340, 300, 30);
        labelair.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labelair);
        
        textair = new JTextField();
        textair.setBounds(320, 340, 300, 30);
        textair.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textair);
        
        labelsarana = new JLabel("Pemeliharaan Sarana   : Rp.");
        labelsarana.setBounds(20, 380, 300, 30);
        labelsarana.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labelsarana);
        
        textsarana = new JTextField();
        textsarana.setBounds(320, 380, 300, 30);
        textsarana.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textsarana);
        
        labelkonsumsi = new JLabel("Konsumsi              : Rp.");
        labelkonsumsi.setBounds(20, 420, 300, 30);
        labelkonsumsi.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labelkonsumsi);
        
        textkonsumsi = new JTextField();
        textkonsumsi.setBounds(320, 420, 300, 30);
        textkonsumsi.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textkonsumsi);
        
        labeliventaris = new JLabel("Iventaris             : Rp.");
        labeliventaris.setBounds(20, 460, 300, 30);
        labeliventaris.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labeliventaris);
        
        textiventaris = new JTextField();
        textiventaris.setBounds(320, 460, 300, 30);
        textiventaris.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textiventaris);
        
        labellainlain = new JLabel("Lain-Lain             : Rp.");
        labellainlain.setBounds(20, 500, 300, 30);
        labellainlain.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(labellainlain);
        
        textlainlain = new JTextField();
        textlainlain.setBounds(320, 500, 300, 30);
        textlainlain.setFont(new Font("Consolas",Font.TRUETYPE_FONT,20));
        UpdatePengeluaran.add(textlainlain);
        
        labeltglpnglrn = new JLabel("> Tanggal Perhitungan Pengeluaran");
        labeltglpnglrn.setBounds(20, 550, 300, 25);
        labeltglpnglrn.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
        UpdatePengeluaran.add(labeltglpnglrn);
        
        texttglpnglrn = new JTextField();
        texttglpnglrn.setBounds(290, 550, 200, 25);
        texttglpnglrn.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
        UpdatePengeluaran.add(texttglpnglrn);
        
        labelptjpnglrn = new JLabel("> PenanggungJawab Pengeluaran");
        labelptjpnglrn.setBounds(20, 590, 300, 25);
        labelptjpnglrn.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
        UpdatePengeluaran.add(labelptjpnglrn);
        
        textptjpnglrn = new JTextField();
        textptjpnglrn.setBounds(290, 590, 200, 25);
        textptjpnglrn.setFont(new Font("Arial",Font.TRUETYPE_FONT,17));
        UpdatePengeluaran.add(textptjpnglrn);
        
        update = new JButton("Update");
        update.setBounds(550, 640, 100, 30);
        update.setBackground(Color.LIGHT_GRAY);
        UpdatePengeluaran.add(update);
        
        back = new JButton("Back");
        back.setBounds(30, 640, 100, 30);
        back.setBackground(Color.RED);
        UpdatePengeluaran.add(back);
        
        UpdatePengeluaran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UpdatePengeluaran.setVisible(true);
        UpdatePengeluaran.setLocationRelativeTo(null);
        
        update.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent ae){
        try{
            for(int e=0; e<Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().size(); e++) {
            if(textbulanout.getText().equals(Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).getBulan2())) {
        int ibadah = Integer.parseInt(textibadah.getText());
                     Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setIbadah(ibadah);
        int kitab = Integer.parseInt(textkitab.getText());
                    Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setKitab(kitab);
        int tpa = Integer.parseInt(texttpa.getText());
                  Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setTpa(tpa);
        int kaddrah = Integer.parseInt(textkaddrah.getText());
                      Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setKaddrah(kaddrah);
        int kebersihan = Integer.parseInt(textkebersihan.getText());
                         Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setKebersihan(kebersihan);
        int listrik = Integer.parseInt(textlistrik.getText());
                      Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setListrik(listrik);
        int air = Integer.parseInt(textair.getText());
                  Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setAir(air);
        int sarana = Integer.parseInt(textsarana.getText());
                     Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setSarana(sarana);
        int konsumsi = Integer.parseInt(textkonsumsi.getText());
                       Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setKonsumsi(konsumsi);
        int iventaris = Integer.parseInt(textiventaris.getText());
                        Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setIventaris(iventaris);
        int lainlain = Integer.parseInt(textlainlain.getText());
                       Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setLainlain(lainlain);
        int jumlahpnglrn = ibadah + kitab + tpa + kaddrah + kebersihan + listrik + air + sarana + konsumsi + iventaris + lainlain;
                           Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setJumlah2(jumlahpnglrn);
        Date tglpnglrn = new Date(texttglpnglrn.getText());
                         Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setTglData(tglpnglrn);
        String ptjpnglrn = textptjpnglrn.getText();
                           Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(e).setPersonData(ptjpnglrn);
        JOptionPane.showMessageDialog(null,"Data Telah Diperbarui", "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
            }
        }
        catch(Exception exception) {
        JOptionPane.showMessageDialog(null,"Format Penulisan Salah", "Perbaruan Gagal", JOptionPane. INFORMATION_MESSAGE);
        }
        }
        });
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                UpdatePengeluaran.dispose();
                Muzakky07123_GUI GUI = new Muzakky07123_GUI();
            }
        });  
    }
    
    void kosong(){
        textbulanout.setText(null);
        textibadah.setText(null);
        textkitab.setText(null);
        texttpa.setText(null);
        textkaddrah.setText (null);
        textkebersihan.setText(null);
        textlistrik.setText(null);
        textair.setText(null);
        textsarana.setText(null);
        textkonsumsi.setText(null);
        textiventaris.setText(null);
        textlainlain.setText(null);
        texttglpnglrn.setText(null);
        textptjpnglrn.setText(null);
    }
        
}