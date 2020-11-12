/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06987atmdosen;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author L
 */
public class NPM06987ATMDosen {
 ArrayList < Account> akun = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input = new Scanner (System.in);
       Save simpan = new Save();
        String pin = null;
        String saldo;
        String deposit;
        String transfer;
        int id;
        int pil;
        
        do {
            System.out.println("Selamat DI ATM CIM Niaga");
             System.out.println("1.Daftar");
            System.out.println("2.login");
            System.out.println("3.Delete saldo");
            System.out.println("4.Update saldo atau tambah saldo");
            System.out.print("pilih :");
            pil = input.nextInt();
            
            switch(pil){
                case 1:
                    System.out.println("Silakan Daftar Terlebih Dahulu");
                    System.out.print("Masukan ID: ");
                    id = input.nextInt();
                    System.out.print("Masukan PIN: ");
                    pin = input.next();
                    System.out.print("Masukan SALDO: ");
                    saldo = input.next();
                    System.out.print("Masukan Transfer: ");
                    transfer = input.next();
                    System.out.print("Masukan Deposit: ");
                    deposit = input.next();
                    simpan.tambah(simpan, id, pin, saldo, deposit, transfer);
                    break;
                    
                case 2:
              System.out.println("Masukan Pin Anda!!!!");
              System.out.print("PIN = ");
              pin = input.next();
                      simpan.lihat(simpan);
                    break;
                    
                case 3:
                   simpan.hapus(simpan);
                   break;
                   
                case 4:
                    System.out.println("Maukah anda Ganti Pin anda!!!!");
                    System.out.print("Masukan ID: ");
                    id = input.nextInt();
                    System.out.print("Masukan PIN: ");
                    pin = input.next();
                    System.out.print("Masukan SALDO: ");
                    saldo = input.next();
                    System.out.print("Masukan Transfer: ");
                    transfer = input.next();
                    System.out.print("Masukan Deposit: ");
                    deposit = input.next();
                    simpan.tambah(simpan, id, pin, saldo, deposit, transfer);
                    simpan.hapus(simpan);
                    break;
                            
            }
            
            
        } while (pil !=5);
       
       
       
       
    } 
    
    
    
    
}

    
    
    

