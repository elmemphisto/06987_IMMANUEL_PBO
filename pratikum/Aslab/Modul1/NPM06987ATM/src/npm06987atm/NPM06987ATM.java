
package npm06987atm;
import java.util.ArrayList;
import java.util.Scanner;

public class NPM06987ATM {
static ArrayList <NPM06987Account> account = new ArrayList();
static ArrayList <NPM06987Save> save = new ArrayList();
static Scanner input = new Scanner (System.in);    
public static void main(String[] args) {
        System.out.println("ATM CIM Niaga");
        System.out.println("Silakan Pilih Daftar terlebih dahulu !!!!");
        int pil;
        
        do {
            System.out.println("1.Daftar");
            System.out.println("2.login");
            System.out.println("3.Delete saldo");
            System.out.println("4.Update saldo atau tambah saldo");
            System.out.print("pilih :");
            pil = input.nextInt();
            
            switch(pil){
                case 1:
                    create();
                    break;
                    
                case 2:
                    System.out.print("PIN = ");
                    String pin = input.next();
                    login(pin);
                    break;
                    
                case 3:
                    delete();
                    break;
                    
                case 4:
                    update();
                    break;
                    
            }
        } while (pil!=5);
    }
    static void create(){
        System.out.print("input Pin = ");
        String pin = input.next();
        System.out.println("input Saldo = ");
        String saldo = input.next();
        
        save.add(new NPM06987Save(pin, saldo));
        
    }
    
    static void login(String pin){
        for (int i=0; i<save.size(); i++){
           if (pin.equals(save.get(i).getPin())){
    System.out.println("Saldo anda sekarang !!!!");
    System.out.println("Pin = "+save.get(i).getPin());
    System.out.println("Saldo = "+save.get(i).getSaldo());
    System.out.println("trasfer = "+save.get(i).getTrasfer());
    System.out.println("Deposit = "+save.get(i).getDeposit());
           }else {
               System.out.println("pin salah blokkkk goblok");
           }
        }
    }
    
    static void delete(){
        Scanner in=new Scanner(System.in);
        System.out.println("apakah kamu ingin hanguskan saldo anda !!!");
        String num=in.next("y");
        save.remove(0);
    }
    
     
    static void update (){
        System.out.println("jangan lupa lagi ya !!!!!");
        System.out.print("input Pin = ");
        String pin = input.next();
        System.out.print("input Saldo = ");
        String saldo = input.next();
        System.out.print("Input Transaksi = ");
        String transaksi = input.next();
        System.out.print("Input Deposit = ");
        String deposit = input.next();
        
        
         save.add(new NPM06987Save(pin, saldo));
         save.remove(0);
         
   }
}
    

