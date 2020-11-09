/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_manajemen_hewan;

import java.util.Scanner;
import java.util.ArrayList;

public class Data_Manajemen_Hewan {

    static ArrayList <HewanEntity> datahewan = new ArrayList();
    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("Data Hewan Punah");
        int pil;
       
        do {
            System.out.println("1.Daftar");
            System.out.println("2.Print");
            System.out.println("3.Exit");
            System.out.print("pilih = ");
            pil = input.nextInt();
            
            switch(pil){
                case 1:
                    daftar();
                    break;
                    
                case 2:
                    view();
                    break;
                    
            }
        }while(pil!=3);
    }
    static void daftar(){
        System.out.print("input Nama = ");
        String nama = input.next();
        System.out.print("Jenis Hewan : ");
        String jenis = input.next();
        System.out.print("Pemakan = ");
        String pemakan = input.next();
        System.out.print("Cara Repoduksi = ");
        String repoduksi = input.next();
        System.out.print("Habitat = ");
        String habitat = input.next();
                
                System.out.print("Cara Hidup = ");
                int hidup = input.nextInt();
                for(int i=0; i<GolonganEntity.hidup.length;i++){
                    System.out.println(i+". "+GolonganEntity.hidup[i]);
                }
    }
    
    static void view (){
        for (int i=0; i<datahewan.size();i++){
            System.out.println("Nama = "+datahewan.get(i).nama);
            System.out.println("Jenis Hewan = "+datahewan.get(i).jenis);
            System.out.println("Pemakan = "+datahewan.get(i).pemakan);
            System.out.println("Cara reproduksi = "+datahewan.get(i).produksi);
            System.out.println("Habitat = "+GolonganEntity.hidup[datahewan.get(i).hidup]);
            
        }
    }
    
}
