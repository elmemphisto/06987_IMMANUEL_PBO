/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.AccountController;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import view.GUI;
import view.allobjctrl06987;

public class Daftar {
  JFrame Daftar = new JFrame();
  JLabel top, pinlabel,passwordlabel,saldolabel,transferlabel;
  JButton daftar, back;
  JTextField textpin,textpassword,textsaldo,texttransfer;
  
  public Daftar(){

  Daftar.setSize(800,630);
  Daftar.setLayout(null);
  top = new JLabel("Daftar");
  top.setBounds(50,10,600,50);
  top.setFont(new Font("Times New Roman", Font.BOLD, 40));
  Daftar.add(top);
  
  pinlabel = new JLabel("PIN");
  pinlabel.setBounds(440,150,100,30);
  Daftar.add(pinlabel);
  
  textpin = new JTextField();
  textpin.setBounds(400,180,200,30);
  Daftar.add(textpin);
  
  passwordlabel = new JLabel("Password");
  passwordlabel.setBounds(400,210,100,30);
  Daftar.add(passwordlabel);
  
  textpassword = new JTextField();
  textpassword.setBounds(400,240,200,30);
  Daftar.add(textpassword);
  
  saldolabel = new JLabel("saldo");
  saldolabel.setBounds(400,270,100,30);
  Daftar.add(saldolabel);
  
  textsaldo = new JTextField();
  textsaldo.setBounds(400,300,200,30);
  Daftar.add(textsaldo);
  
  transferlabel = new JLabel("Transfer");
  transferlabel.setBounds(400,330,100,30);
  Daftar.add(transferlabel);
  
  texttransfer = new JTextField();
  texttransfer.setBounds(400,360,200,30);
  Daftar.add(texttransfer);
  
  daftar = new JButton("Daftar");
  daftar.setBounds(400,420,200,30);
  Daftar.add(daftar);
  
  back = new JButton("Back");
  back.setBounds(120,320,100,40);
  Daftar.add(back);
  
  
  Daftar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Daftar.setVisible(true);
  Daftar.setLocationRelativeTo(null);
  
  back.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.GUI g = new GUI();
            Daftar.dispose();
            kosong();
        }
    });
  
  daftar.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            String pin = textpin.getText();
            String password = textpassword.getText();
            String saldo = textsaldo.getText();
            String transfer = texttransfer.getText();
            allobjctrl06987.account.insertAccount(pin, saldo, transfer);
            JOptionPane.showMessageDialog(null,"Registrasi Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
            kosong();
        }
    });
  
  
 
  
  
  }
  void kosong(){
        textpin.setText(null);
        textpassword.setText(null);
        textsaldo.setText(null);
        texttransfer.setText(null);
        
    }
}


