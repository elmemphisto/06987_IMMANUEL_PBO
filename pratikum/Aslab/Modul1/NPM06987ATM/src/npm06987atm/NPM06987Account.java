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
public class NPM06987Account {
      
     String pin,saldo,trasnfer,deposit;
     
     public NPM06987Account(String pin,String transfer,String saldo, String deposit){
         this.pin=pin;
         this.trasnfer=transfer;
         this.deposit=deposit;
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
     
     
}


