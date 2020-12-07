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
        super(pin, password, saldo, deposit);
			this.user = user;
    }

@Override
public String getpin(){
    return pin;
    
}


public String getSaveEntity(){
    return user;
    
}

public void setSaveEntity(){
    this.user= user;

}
}