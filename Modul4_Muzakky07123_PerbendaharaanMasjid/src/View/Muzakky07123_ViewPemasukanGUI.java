package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.SimpleDateFormat;

public class Muzakky07123_ViewPemasukanGUI {
    JFrame ViewPemasukan = new JFrame();
    JLabel top,labelbulanin;
    JTextField textbulanin;
    JTextArea output;
    JButton lihatin,back;
    
    public Muzakky07123_ViewPemasukanGUI() {
        ViewPemasukan.setSize(720, 600);
        ViewPemasukan.setLayout(null);
        ViewPemasukan.getContentPane().setBackground(Color.GREEN);
        
        top = new JLabel("Hasil Data Pemasukan");
        top.setBounds(10, 10, 350, 50);
        top.setFont(new Font("Matura MT Script Capitals",Font.TRUETYPE_FONT,30));
        ViewPemasukan.add(top);
        
        labelbulanin = new JLabel("Bulan");
        labelbulanin.setBounds(20, 70, 100, 30);
        labelbulanin.setFont(new Font("Consolas",Font.BOLD,20));
        ViewPemasukan.add(labelbulanin);
        
        textbulanin = new JTextField();
        textbulanin.setBounds(90, 70, 120, 30);
        textbulanin.setFont(new Font("Consolas",Font.TRUETYPE_FONT,15));
        ViewPemasukan.add(textbulanin);
        
        lihatin = new JButton("Lihat");
        lihatin.setBounds(90, 110, 100, 30);
        lihatin.setFont(new Font("Arial",Font.BOLD,15));
        ViewPemasukan.add(lihatin);
        
        output = new JTextArea();
        output.setEditable(false);
        output.setBounds(250, 70, 400, 370);
        output.setFont(new Font("Consolas",Font.TRUETYPE_FONT,15));
        ViewPemasukan.add(output);
        
        back = new JButton("Back");
        back.setBounds(30, 500, 100, 30);
        back.setBackground(Color.RED);
        ViewPemasukan.add(back);
        
        ViewPemasukan.setVisible(true);
        ViewPemasukan.setLocationRelativeTo(null);
        ViewPemasukan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lihatin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for(int a=0; a<Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().size(); a++){
                    if(Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getBulan1().equals(textbulanin.getText())){
                        String datain  = "1. Infaq Kotak Jumat I   = Rp. " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getJumat1()
                                    +  "\n2. Infaq Kotak Jumat II  = Rp. " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getJumat2()
                                    +  "\n3. Infaq Kotak Jumat III = Rp. " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getJumat3()
                                    +  "\n4. Infaq Kotak Jumat IV  = Rp. " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getJumat4()
                                    +  "\n5. Infaq Kotak Jumat V   = Rp. " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getJumat5()
                                    +  "\n6. Infaq Kotak Hijau     = Rp. " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getHijau()
                                    +  "\n7. Infaq TPA             = Rp. " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getTpa()
                                    +  "\n8. Lain-Lain             = Rp. " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getLainlain()
                                    +  "\n^ Total                  = Rp. " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getJumlah1()
                                    +  "\n> Tgl Hitung Pemasukan   = " + new SimpleDateFormat("dd-MM-yyyy").format(Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getTglData())
                                    +  "\n> PenanggungJawab        = " + Muzakky07123_Object2ControllerinView.pemasukanController.getPemasukan().get(a).getPersonData();
                        output.setText(datain);
                    }
                }
            }
        });
        
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae) {
                ViewPemasukan.dispose();
                Muzakky07123_GUI GUI = new Muzakky07123_GUI();
            }
        });
    }
    
}