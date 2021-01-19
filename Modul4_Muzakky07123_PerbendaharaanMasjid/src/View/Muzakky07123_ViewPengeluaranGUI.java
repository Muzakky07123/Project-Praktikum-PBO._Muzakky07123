package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.SimpleDateFormat;

public class Muzakky07123_ViewPengeluaranGUI {
    JFrame ViewPengeluaran = new JFrame();
    JLabel top,labelbulanout;
    JTextField textbulanout;
    JButton lihatout,back;
    JTextArea output;
    
    public Muzakky07123_ViewPengeluaranGUI() {
        ViewPengeluaran.setSize(720, 600);
        ViewPengeluaran.setLayout(null);
        ViewPengeluaran.getContentPane().setBackground(Color.GREEN);
        
        top = new JLabel("Hasil Data Pengeluaran");
        top.setBounds(10, 10, 350, 50);
        top.setFont(new Font("Matura MT Script Capitals",Font.TRUETYPE_FONT,30));
        ViewPengeluaran.add(top);
        
        labelbulanout = new JLabel("Bulan");
        labelbulanout.setBounds(20, 70, 100, 30);
        labelbulanout.setFont(new Font("Consolas",Font.BOLD,20));
        ViewPengeluaran.add(labelbulanout);
        
        textbulanout = new JTextField();
        textbulanout.setBounds(90, 70, 120, 30);
        textbulanout.setFont(new Font("Consolas",Font.TRUETYPE_FONT,15));
        ViewPengeluaran.add(textbulanout);
        
        lihatout = new JButton("Lihat");
        lihatout.setBounds(90, 110, 100, 30);
        lihatout.setFont(new Font("Arial",Font.BOLD,15));
        ViewPengeluaran.add(lihatout);
        
        output = new JTextArea();
        output.setEditable(false);
        output.setBounds(250, 70, 400, 370);
        output.setFont(new Font("Consolas",Font.TRUETYPE_FONT,15));
        ViewPengeluaran.add(output);
        
        back = new JButton("Back");
        back.setBounds(30, 500, 100, 30);
        back.setBackground(Color.RED);
        ViewPengeluaran.add(back);
        
        ViewPengeluaran.setVisible(true);
        ViewPengeluaran.setLocationRelativeTo(null);
        ViewPengeluaran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lihatout.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for(int b=0; b<Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().size(); b++){
                    if(Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getBulan2().equals(textbulanout.getText())){
                        String dataout = "1. Kegiatan Ibadah       = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getIbadah()
                                    +  "\n2. Kegiatan Ngaji Kitab  = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getKitab()
                                    +  "\n3. Kegiatan TPA          = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getTpa()
                                    +  "\n4. Kegiatan Kader/Hadrah = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getKaddrah()
                                    +  "\n5. Kebersihan            = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getKebersihan()
                                    +  "\n6. Listrik PLN           = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getListrik()
                                    +  "\n7. Air PDAM              = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getAir()
                                    +  "\n8. Pemeliharaan Sarana   = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getSarana()
                                    +  "\n9. Konsumsi              = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getKonsumsi()
                                    +  "\n10.Iventaris             = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getIventaris()
                                    +  "\n11.Lain-Lain             = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getLainlain()
                                    +  "\n^ Total                  = Rp. " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getJumlah2()
                                    +  "\n> Tgl Hitung Pengeluaran = " + new SimpleDateFormat("dd-MM-yyyy").format(Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getTglData())
                                    +  "\n> PenanggungJawab        = " + Muzakky07123_Object2ControllerinView.pengeluaranController.getPengeluaran().get(b).getPersonData();
                        output.setText(dataout);
                    }
                }
            }
        });
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                ViewPengeluaran.dispose();
                Muzakky07123_GUI GUI = new Muzakky07123_GUI();
            }
        });
    }
    
}