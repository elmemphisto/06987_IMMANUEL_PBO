/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.LingkunganEntity;
import java.util.ArrayList;
public class Hewanmodel implements ModelInterface {
    private ArrayList<LingkunganEntity> lingkunganArraylist;
    
    public Hewanmodel(){
        lingkunganArraylist = new ArrayList<LingkunganEntity>();
    }
    
    public void instertHewan(LingkunganEntity lingkungan){
        lingkunganArraylist.add(lingkungan);
    }
    
    @Override
    public void view(){
        for (LingkunganEntity lingkungan : lingkunganArraylist){
            System.out.println("nama: "+lingkungan.getNama());
            System.out.println("Jenis: "+lingkungan.getJenis());
            System.out.println("Pemakan: "+lingkungan.getPemakan());
            System.out.println("Cara hidup "+lingkungan.getCarahidup());
            System.out.println("Cara Repoduski"+lingkungan.getRepoduksi());
            System.out.println("Habitat : "+lingkungan.getHabitat());
            
            System.out.println();
        }
    }
}
