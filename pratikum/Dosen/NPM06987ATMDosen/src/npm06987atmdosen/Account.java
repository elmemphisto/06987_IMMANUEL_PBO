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
public class Account {
  private String pin, saldo, deposit, transfer;

public void setPin(String pin)
{
    this.pin=pin;
}

protected String getPin(){
return pin;    
}

public void setSaldo(String saldo){
    this.saldo=saldo;
}

protected String getSaldo(){
    return saldo;
}

public void setDeposit (String deposit){
    this.deposit=deposit;
}

protected String getDeposit(){
    return deposit;
}

public void setTransfer(String transfer){
    this.transfer=transfer;
}

protected String getTrasnfer(){
    return transfer;
}

public void cetak(){
    System.out.println("pin : "+this.getPin());
    System.out.println("Saldo : "+this.getSaldo());
}

}
