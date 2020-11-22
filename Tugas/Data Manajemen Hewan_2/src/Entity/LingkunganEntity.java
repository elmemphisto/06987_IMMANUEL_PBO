
package Entity;

/**
 *
 * @author L
 */
public class LingkunganEntity extends HewanAbstractEntity {
    private String carahidup;
    
      public LingkunganEntity(String nama, String jenis, String pemakan, String repoduksi, String habitat) {
        super(nama,jenis,pemakan,repoduksi,habitat);
       this.carahidup=carahidup;
    }
    @Override
    public String getNama() {
        return nama;
    }
    
    public String getCarahidup(){
        return carahidup;
}
    
    public void setCarahidup(String Catahidup){
        this.carahidup=carahidup;
    }
    
}
    
