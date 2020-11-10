/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06987soalpendahuluan1;

import java.util.Date;

public class NPM06987PraktikanEntity {
    String npm, nama, password, notelp, kelas;
    Date TanggalLahir;
    int indexpraktikum;
    int indexaslab;
    
    public NPM06987PraktikanEntity(String npm, String nama, String password, String notelp, String kelas, Date tanggallahir, int indexprak, int indexaslab){
      this.npm=npm;
      this.nama=nama;
      this.password=password;
      this.kelas=kelas;
      this.notelp=notelp;
      this.TanggalLahir=tanggallahir;
      this.indexpraktikum=indexprak;
      this.indexaslab=indexaslab;
     
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
    
    String getNoTelp(){
        return this.notelp;
    }
    
    Date getDate (){
        return this.TanggalLahir;
    }
    
    int getIndexPraktikum(){
        return this.indexpraktikum;
    }
    
    int getIndexAslab(){
        return this.indexaslab;
    }
    
    
}
