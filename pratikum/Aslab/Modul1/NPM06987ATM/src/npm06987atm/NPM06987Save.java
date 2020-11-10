/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06987atm;

/**
 *
 * @author L
 */
public class NPM06987Save {
   
    String pin,saldo,trasnfer,deposit;
     int indexaccount;
     int indexsave;
     public NPM06987Save (String pin,String saldo,String trasnfer, String deposit, int indexaccount, int indexsave){
         this.pin=pin;
         this.deposit=deposit;
         this.saldo=saldo;
         this.trasnfer=trasnfer;
         this.indexaccount=indexaccount;
         this.indexsave=indexsave;
         
     }

    NPM06987Save(String pin, String saldo) {
        this.pin=pin;
        this.saldo=saldo;
    }
     
     String getPin(){
         return this.pin;
     }
     
     String getTrasfer(){
         return this.trasnfer;
     }
     
     String getDeposit(){
         return this.deposit;
     }
     
     String getSaldo(){
         return this.saldo;
     }
     
     int getIndexaccount(){
         return this.indexaccount;
     }
     
     int getIndexsave(){
         return this.indexsave;
     }
}
