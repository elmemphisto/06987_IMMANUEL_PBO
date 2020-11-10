/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06987soalpendahuluan1;

import java.util.Date;


public class NPM06987AslabEntity {
    String npm, nama, password, notelp;
    Date Tanggallahir;
    
    public NPM06987AslabEntity (String npm, String nama, String password, String notelp, Date tanggallahir) {
    this.npm=npm;
    this.nama=nama;
    this.notelp=notelp;
    this.password=password;
    this.Tanggallahir=tanggallahir;
}
    
    String getNpm(){
        return this.npm;
    }
    
    String getNama(){
        return this.nama;
    }
    
    String getPassword(){
        return this.password;
    }
    
    String getNotelp(){
        return this.notelp;
    }
    
    Date getDate(){
        return this.Tanggallahir;
    }
    
}