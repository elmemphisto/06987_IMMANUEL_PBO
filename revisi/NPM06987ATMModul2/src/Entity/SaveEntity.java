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
public class SaveEntity extends AccountAbstractEntity {
private String user;

    public SaveEntity(String pin, String password, String saldo, String deposit) {
        super(password, saldo, deposit,pin);
			this.user = user;
    }


    @Override
    public String getpassword() {
     return password;   
    }

   public String getSaveEntity(){
    return user;
    
}

public void setSaveEntity(){
    this.user= user;

}

    public String getpin() {
        return pin;
    }

}