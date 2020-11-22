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
public abstract class HewanAbstractEntity {
    protected String nama, jenis, pemakan, repoduksi, habitat;
    
    
    public HewanAbstractEntity (String nama,String jenis,String  pemakan, String repoduksi, String habitat){
        this.nama=nama;
        this.jenis=jenis;
        this.pemakan=pemakan;
        this.repoduksi=repoduksi;
        this.habitat=habitat;
    }   

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public HewanAbstractEntity(){
        
    }
    
    public abstract String getNama();
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
    
    public String getPemakan(){
        return pemakan;
    }
    
    public void setPemakan(String pemakan){
        this.pemakan=pemakan;
    }
    
    public String getRepoduksi(){
        return repoduksi;
    }
    
    public void setRepoduksi(String repoduksi){
        this.repoduksi=repoduksi;
    }
    
    public String getHabitat(){
        return habitat;
    }
         
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }
    
    
}
