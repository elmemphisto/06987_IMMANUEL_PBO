/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_manajemen_hewan;



public class HewanEntity {
String nama, jenis, pemakan, produksi, habitat;
int hidup;

public HewanEntity(String nama, String jenis, String produksi, String habitat){
    this.nama=nama;
    this.jenis=jenis;
    this.pemakan = pemakan;
    this.produksi=produksi;
    this.hidup = hidup;
}

String getNama(){
    return this.nama;
}

String getJenis(){
    return this.jenis;
}

String getPemakan(){
    return this.pemakan;
}

String getProduksi(){
    return this.produksi;
}

int getHidup(){
    return this.hidup;
}
}
