/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06987atmmodul2;

/**
 *
 * @author L
 */

import Entity.SaveEntity;
import Entity.AccountAbstractEntity;
import Entity.*;
import java.util.Scanner;
import Module.AccountModul;
import Module.InterfaceAccount;

public class NPM06987ATMModul2 {

    private static AccountModul accountmodul = new AccountModul();
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int loop = 0;
        do {
            int pilih = 0;
            int pilmenu = 0;
            System.out.println("Selamat Datang Di Atm MIC naga !! "+"\n 1.DAFTAR"+"\n 2.LOGIN"+"\n Masukan Pilihan Anda : ");
            pilmenu = input.nextInt();
            
            if(pilmenu == 1){
                daftar();
                
            }else if (pilmenu == 2){
                login();
            } else {
                break;
            }
                    
            
        }while(loop!=1);
        }
    
    
    static void daftar()
    {
        System.out.print("Input Pin = ");
        String pin = input.next();
        System.out.print("Input Password = ");
        String password = input.next();
        System.out.print("Input Saldo = ");
        String saldo = input.next();
        System.out.print("input Deposit = ");
        String deposit = input.next();
        
        accountmodul.insert(new SaveEntity(pin,password,saldo,deposit));
        
        
    }
    
    static void login (){
    System.out.print("Pin: ");
    String pin = input.next();
    System.out.print("Password: ");
    String password = input.next();
    
    
    accountmodul.cekData(pin,password);
     
    
    }
}

