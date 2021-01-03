/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author L
 */
public abstract class AccountAbstractEntity {
            protected String pin, password;
            protected int saldo, transfer;
	
	public AccountAbstractEntity(String pin, String password, int saldo, int transfer){
		this.pin = pin;
		this.password = password;
		this.saldo = saldo;
		this.transfer = transfer;
		
	}
	public AccountAbstractEntity(){
	}

	public abstract String getpassword();
	public String getPassword(){
		return password;
	}
	public void setPin(String pin){
		this.pin = pin;
	}
        
        public String getpin(String pin){
            return pin;
        }
        
	public int getsaldo(){
		return saldo;
	}
	public void setsaldo(int saldo){
		this.saldo = saldo;
	}
	public int gettransfer(){
		return transfer;
	}
	public void settransfer(int transfer){
		this.transfer = transfer;
	}
    
}
