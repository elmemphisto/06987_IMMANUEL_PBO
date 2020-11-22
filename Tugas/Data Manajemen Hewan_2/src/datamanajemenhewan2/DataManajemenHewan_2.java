/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamanajemenhewan2;

import Entity.LingkunganEntity;
import Entity.HewanAbstractEntity;
import Entity.*;
import java.util.Scanner;
import Model.Hewanmodel;
import Model.ModelInterface;

public class DataManajemenHewan_2 {

    private static Hewanmodel hewan = new Hewanmodel();
  
    private static Scanner input = new Scanner (System.in);
    private static int pil;
    static int Cekprint;
    
    public static void main(String[] args) {
    int loop=0;
    do {
      int pil = 0;
      System.out.println("Pengelompokan Hewan"+"\n1.Daftar: "+"\n2. Print"+"\n3.Exit"+"\n Masukan Pilihan Anda : ");
      pil= input.nextByte();
       if(pil == 1){
          daftar(); 
       }else if (pil == 2){
           print();
       }else {
           break;
       }
    }while (loop!=1);
    }
    
    static void daftar (){
        System.out.print("Nama Hewan: ");
        String nama=input.next();
        System.out.print("Jenis Hewan: ");
        String jenis = input.next();
        System.out.print("Pemakan: ");
        String pemakan = input.next();
        System.out.print("Cara Repoduksi: ");
        String repoduksi = input.next();
        System.out.print("Habitat: ");
        String habitat = input.next();
        hewan.instertHewan(new LingkunganEntity(nama, jenis, pemakan, repoduksi, habitat));
      
               
    }
    
    static void print (){
        System.out.println("Hasil Data Hewan Saat ini !!!!");
        hewan.view();
    }
    
}
