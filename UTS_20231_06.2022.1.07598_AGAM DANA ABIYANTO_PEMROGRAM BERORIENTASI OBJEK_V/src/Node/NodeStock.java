package Node;

import java.util.HashMap;
import java.util.Map;

public class NodeStock {
    public int no;
    public String barcode;
    public String product;
    public int stock_barang;

    public NodeStock(int no, String barcode, String product) {
        this.no = no;
        this.barcode = barcode;
        this.product = product;

    }

    public void updateDataStok(int newstock){
        this.stock_barang = this.stock_barang + newstock;
    }

    public String getProduct(){
        return product;
    }

}
