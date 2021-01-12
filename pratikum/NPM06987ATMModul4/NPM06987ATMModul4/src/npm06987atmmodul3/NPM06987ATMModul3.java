/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06987atmmodul3;

/**
 *
 * @author L
 */

import Controller.AccountController;
import Entity.SaveEntity;
import Entity.AccountAbstractEntity;
import Entity.*;
import java.util.Scanner;
import Module.AccountModul;
import view.GUI;


public class NPM06987ATMModul3 {
    
    
    private static AccountController account = new AccountController();              
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        GUI g = new GUI();
        
//        int loop = 0;
//        do {
//            
//           int pilmenu;
//            System.out.println("Selamat Datang Di Atm MIC naga !! "+"\n 1.create"+"\n 2.Print"+"\n 3.delete"+"\n 4.update"+"\n Masukan Pilihan Anda : ");
//            pilmenu = input.nextInt();
//           
//            if (pilmenu == 1){
//                
//            System.out.println("=========================================");
//        System.out.print("Input Pin = ");
//        String pin = input.next();
//        System.out.print("Input Password = ");
//        String password = input.next();
//        System.out.print("Input Saldo = ");
//        int saldo = input.nextInt();
//        System.out.print("Input transfer = ");
//        int transfer = input.nextInt();
//        System.out.println("=========================================");
//        account.insertAccount(pin, saldo, transfer);
//        account.getSave();
//           
//            } else if (pilmenu == 2){
//       
               for (SaveEntity arrAccount : account.getSave()){
      System.out.println("=========================================");
	System.out.println("\n saldo : "+ arrAccount.getsaldo()+ "\n Transfer : "+ arrAccount.gettransfer());
	    account.getSave();
                 }
//                    
//            
//        }else if (pilmenu == 3){
//          
//   Scanner in=new Scanner(System.in);
//        System.out.println("apakah kamu ingin hanguskan saldo anda !!!");
//        String num=in.next("y");
//        account.getSave().remove(0);
//   
//      
//        
//        }else if (pilmenu == 4){
//        System.out.println("=========================================");
//        System.out.print("Input Pin = ");
//        String pin = input.next();
//        System.out.print("Input Password = ");
//        String password = input.next();
//        System.out.print("Input Saldo = ");
//        int saldo = input.nextInt();
//        System.out.print("Input transfer = ");
//        int transfer = input.nextInt();
//        System.out.println("=========================================");
//        
//        
//        account.insertAccount(pin, saldo, transfer);
//        account.getSave().remove(0);
//        } else
//      throw new IllegalArgumentException ("maaf yang anda inputkan salah");
//       
// }while(loop!=1);
        }
    
    
    
    }


        

