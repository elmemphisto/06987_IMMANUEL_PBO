/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06987soalpendahuluan1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class NPM06987soalPendahuluan1 {
static ArrayList <NPM06987AslabEntity> dataAslab = new ArrayList();
static ArrayList <NPM06987PraktikanEntity> dataPraktikan = new ArrayList();
static Scanner input = new Scanner (System.in);
        
    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Laboratarium Informatika ITATS");
        int pil;
        DataAslab();
        do {
            System.out.println("1.Daftar");
            System.out.println("2.login");
            System.out.println("3.Exit");
            System.out.print("pilih = ");
            pil = input.nextInt();
            
            switch(pil){
                case 1:
                    daftar();
                    break;
                    
                case 2:
                    System.out.print("NPM = ");
                    String npm = input.next();
                    System.out.print("Paswword = ");
                    String password = input.next();
                    view(npm,password);
                    break;
                    }
                   } while(pil!=3);
        }
 
      
     static void daftar() {
        System.out.print("Input NPM = ");
        String npm = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String password = input.next();
        System.out.print("Input NoTelp = ");
        String notelp = input.next();
        System.out.print("Input Tgl Lahir (dd/mm/yyyy)= ");
        Date tanggallahir = new Date ();    
    
        System.out.print("Input Kelas = ");
        String kelas = input.next();
        
        System.out.print("Pilih Aslab = ");
        int indexaslab = input.nextInt();
        for (int i=0; i<NPM06987PratikumEntity.pratikum.length;i++){
            System.out.println(1+". "+NPM06987PratikumEntity.pratikum[i]);
        }
        
        System.out.print("pilih Pratikum = ");
        int indexprak = input.nextInt();
        dataPraktikan.add(new NPM06987PraktikanEntity( npm, nama, password,  notelp, kelas, tanggallahir, indexprak, indexaslab));
    }

    static void view(String npm, String password) {
    for (int i=0; i<dataPraktikan.size(); i++){
           if (npm.equals(dataPraktikan.get(i).getNpm())&&password.equals(dataPraktikan.get(i).getPassword())){
    System.out.println("NPM = "+dataPraktikan.get(i).getNpm());
    System.out.println("Nama = "+dataPraktikan.get(i).getNama());
    System.out.println("Tangal Lahir = "+new SimpleDateFormat("dd-MM-yyyy").format(dataPraktikan.get(i).getDate()));
    System.out.println("Nama Asisten = "+dataAslab.get(dataPraktikan.get(i).indexaslab).getNama());
    System.out.println("Pratikum = "+NPM06987PratikumEntity.pratikum[dataPraktikan.get(i).indexpraktikum]);
           }else {
               System.out.println("nama atau password salah blokkkk goblok");
           }
        }   
    }
    
    static void DataAslab(){
     String npmAslab [] = {"01","02","03","04","05","06","07"};
     String passwordAslab [] = {"01","02","03","04","05","06","07"};
     String namaAslab [] = {"Michael", "Fadlan", "Odila", "Fitria", "Sita", "Eric", "Fernanda"};
     String notelpAslab [] = {"01","02","03","04","05","06","07"};
     String tglLahirAslab [] = {"04/05/2000", "01/12/2000", "03/3/2000", "23/6/2000", "11/3/2000/", "13/9/2000", "22/12/2000"};
     for (int i=0; i<npmAslab.length;i++){
            dataAslab.add(new NPM06987AslabEntity(npmAslab[i], namaAslab[i], passwordAslab[i], notelpAslab[i], new Date(tglLahirAslab[i])));
        }
    }
    

   
    
}
