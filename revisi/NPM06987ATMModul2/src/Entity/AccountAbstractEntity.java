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
    protected String pin, password, saldo, deposit;
	
	public AccountAbstractEntity(String pin, String password, String saldo, String deposit){
		this.pin = pin;
		this.password = password;
		this.saldo = saldo;
		this.deposit = deposit;
		
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
        
	public String getsaldo(){
		return saldo;
	}
	public void setsaldo(String saldo){
		this.saldo = saldo;
	}
	public String getdeposit(){
		return deposit;
	}
	public void setdeposit(String deposit){
		this.deposit = deposit;
	}
    
}
