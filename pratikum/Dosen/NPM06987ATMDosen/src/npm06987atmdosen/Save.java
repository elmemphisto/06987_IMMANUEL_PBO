/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06987atmdosen;

/**
 *
 * @author L
 */
public class Save extends Account {
    private String pin, saldo, deposit, transfer;
    private int id;
    Account akun = new Account();
    
        private class node {

        String pin;
        String saldo;
        String deposit;
        String transfer;
        int id;
        node next;
        node prev;
        
        
        

        private node(String pin, String deposit, String saldo, String transfer) {
            this.id=id;
            this.pin = pin;
            this.saldo = saldo;
            this.deposit = deposit;
            this.transfer = transfer;
            this.next = null;
            this.prev = null;
        
       }
       
     
    }
         
    node head;
    node tail;

    
    void tambah(Save list, int id, String pin, String saldo, String deposit, String transfer){
        node data_save = new node(pin, saldo, deposit, transfer);
        if (list.head == null){
            list.head= data_save;
            list.tail= data_save;
        
        }else{
            data_save.next=list.tail;
            data_save.prev=null;
            list.tail.prev=data_save;
            list.tail.next=data_save;
            
    }
    
    }
    
    void lihat (Save list){
        node view=list.tail;
        System.out.println("Saldo Anda Saat ini !!!!!");
        while (view != null){
        System.out.println("\nid: "+view.id);
        System.out.println("\npin: "+view.pin);
        System.out.println("\nSaldo: "+view.saldo);
        System.out.println("\nTransfer: "+view.transfer);
        System.out.println("\nDeposito: "+view.deposit);
        view = view.next;
            }
       System.out.println(" ====================");    
    }
    
   
    void hapus (Save list){
        node hapus = list.tail;
        list.tail = list.tail.next;
        list.tail.prev = null;
        System.out.println(" Account anda telah kami hapus mohon maaf");
    }
    
   void update(Save list, int id, String pin, String saldo, String deposit, String transfer){
        node data_save = new node(pin, saldo, deposit, transfer);
        node hapus = list.tail;
        if (list.head == null){
            list.head= data_save;
            list.tail= data_save;
            list.tail = list.tail.next;
            list.tail.prev = null;
        }else{
            data_save.next=list.tail;
            data_save.prev=null;
            list.tail.prev=data_save;
            list.tail.next=data_save;
            
    }
    
    }
    
}
