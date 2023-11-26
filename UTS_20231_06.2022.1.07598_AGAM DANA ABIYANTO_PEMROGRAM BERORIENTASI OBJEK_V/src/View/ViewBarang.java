package View;

import Model.ModelBarang;
import Node.NodeStock;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewBarang {
    public void cetakAllBarang(ArrayList<NodeStock>barangs) {
        for (int i = 0; i < barangs.size(); i++) {
            System.out.println("Barcode         : " + barangs.get(i).barcode);
            System.out.println("Nama Product    : " + barangs.get(i).product);
            System.out.println("Jumlah Stock    : " + barangs.get(i).stock_barang);
            System.out.println("---------------------------------------------");
        }
    }

    public void insertBarang(ModelBarang modelBarang){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Barcode : ");
        String barcode = input.nextLine();
        System.out.println("Masukkan Product : ");
        String product = input.nextLine();
        modelBarang.insertBarang(barcode, product);
    }

    public void cetakBarang(ModelBarang modelBarang){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Barcode : ");
        String barcode = input.nextLine();
        NodeStock barang = modelBarang.searchBarang(barcode);

        if (barang!=null){
            System.out.println("\nBarcode          : " + barang.barcode);
            System.out.println("Nama Product      : " + barang.product);
            System.out.println("Stock             : " + barang.stock_barang);
        }else {
            System.out.println("Buku tidak ditemukan");
        }

    }

    public void updateStok(ModelBarang modelBarang){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Barcode    : ");
        String barcode = input.nextLine();
        System.out.println("Stok product baru   : ");
        int newstok = input.nextInt();
        modelBarang.updateStok(newstok, barcode);
    }

    public void hapusBarang(ModelBarang modelBarang){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Barcode : ");
        String barcode = input.nextLine();
        modelBarang.hapusBarang(barcode);
        System.out.println("Buku telah dihapus ");
    }
}


