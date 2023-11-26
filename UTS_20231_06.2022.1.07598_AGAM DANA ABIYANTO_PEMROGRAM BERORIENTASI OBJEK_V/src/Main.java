import Controller.ControllerBarang;
import Database.AllModel;
import Node.NodeStock;
import View.ViewBarang;

import java.util.Scanner;

public class Main {

    static void insertstatic(){
        AllModel.barangs.insertBarang("1234", "Sensodyne");
        AllModel.barangs.insertBarang("2345", "Dettol");
    }

    static void menu_awal(){
        Scanner input = new Scanner(System.in);
        ViewBarang viewBarang = new ViewBarang();
        ControllerBarang controllerBarang = new ControllerBarang(AllModel.barangs, viewBarang);


        int pilihan_Menu=0;
        while (pilihan_Menu != 6){
            System.out.println("\n----------Pergudangan---------");
            System.out.println("==============================");

            System.out.println("\nManajemen Stock");
            System.out.println();
            System.out.println("1. Cetak Stock Barang");
            System.out.println("2. Tambah Barang");
            System.out.println("3. Update Stok Barang");
            System.out.println("4. Delete Barang");
            System.out.println("5. Cari Stock Barang");
            System.out.println("6. Exit");
            System.out.println("Masukkan Pilihan : ");

            pilihan_Menu = input.nextInt();
            switch (pilihan_Menu){
                    case 1:
                        System.out.println("Daftar barang\n");
                        controllerBarang.viewAllBarang();
                        break;
                    case 2:
                        System.out.println("Masukkan Barang yang akan ditambahkan ");
                        controllerBarang.insertBarang();
                        break;
                    case 3:
                        System.out.println("Masukkan Update Stock Barang ");
                        controllerBarang.updateStok();
                        break;
                    case 4:
                        System.out.println("Masukkan Data Barang yang akan dihapus ");
                        controllerBarang.hapusBarang();
                        break;
                    case 5:
                        System.out.println("Cari Barang ");
                        controllerBarang.viewBarang();
                        break;
                    case 6:
                        System.out.println("Program Telah Selesai");
                        break;
                    default:
                        break;
                }
            }
        }

    public static void main(String[] args) {
        insertstatic();
        menu_awal();
    }
}