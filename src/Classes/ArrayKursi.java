/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author YULISHA
 */
public class ArrayKursi {
    protected ArrayList<String> simpankursi = new ArrayList<>();
    private String kursi = "";
    int jumlah;
    private int hargavip;
    private int harga;
    public void tambahkursi(String kursi){
        simpankursi.add(kursi);

        
    }
    
    public void hapuskursi(String kursi){
        simpankursi.remove(kursi);
    }
    
    public String getKursi (){
                for(int i = 0; i < simpankursi.size();i++){
            kursi+=simpankursi.get(i)+"\n";
            
        }
                return kursi;
    }
    
    public int getTotal(){
        for(int i = 0; i<simpankursi.size();i++){
            if(simpankursi.get(i).contains("C")||simpankursi.get(i).contains("D")){
                jumlah+=hargavip;
                System.out.println("j");
            }
            else{
                jumlah+=harga;
            }
            
        }
        return jumlah;
    }
    
    public void setHargaVip(int hargavip){
        this.hargavip = hargavip;
    }
    
    public void setHarga (int harga){
        this.harga = harga;
    }
}
