package Controller;

import Model.ModelBarang;
import View.ViewBarang;

public class ControllerBarang {
    ModelBarang modelBarang;
    ViewBarang viewBarang;

    public ControllerBarang(ModelBarang modelBarang, ViewBarang viewBarang){
        this.modelBarang = modelBarang;
        this.viewBarang = viewBarang;
    }

    public void viewAllBarang(){
        viewBarang.cetakAllBarang(modelBarang.viewBarang());
    }

    public void insertBarang(){
        viewBarang.insertBarang(modelBarang);
    }

    public void viewBarang(){
        viewBarang.cetakBarang(modelBarang);
    }

    public void updateStok(){
        viewBarang.updateStok(modelBarang);
    }

    public void hapusBarang(){
        viewBarang.hapusBarang(modelBarang);
    }


}
