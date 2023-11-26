package Model;

import Node.NodeStock;

import java.util.ArrayList;

public class ModelBarang {
    public ArrayList<NodeStock> barangs;

    private  int update_kode=-1;

    public ModelBarang(){
        this.barangs = new ArrayList<>();
    }

    public void insertBarang(String barcode, String product){
        this.update_kode++;
        this.barangs.add(new NodeStock(this.update_kode, barcode, product));
    }


    public ArrayList<NodeStock> viewBarang(){
        return barangs;
    }

    public void hapusBarang(String barcode){
        for (int i=0; i<barangs.size(); i++){
            if (barcode.equals(barangs.get(i).getProduct())){
                barangs.remove(i);
            }
        }
    }

    public void updateStok(int newstock, String product){
        NodeStock barang = searchBarang(product);
        barang.updateDataStok(newstock);
    }

    public NodeStock searchBarang(String barcode){
        NodeStock barang = null;
        for (int i=0; i<barangs.size(); i++){
            if (barcode.equals(barangs.get(i).barcode)){
                barang = barangs.get(i);
            }
        }

        return barang;
    }


}
