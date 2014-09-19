/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Automovel;

/**
 *
 * @author gledson.cruz
 */
public class AutomovelTableModel extends AbstractTableModel{
    
    private List<Automovel> automoveis;

    public AutomovelTableModel(List<Automovel> automoveis) {
        this.automoveis = automoveis;
    }
    

    @Override
    public int getRowCount() {
        return this.automoveis.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int objeto, int atributo) {
        Automovel m = (Automovel) this.automoveis.get(objeto);

        if (atributo == 0) {
            return m.getId();
        } else if (atributo == 1){
            return m.getAnoFabricacao();
        }else if (atributo == 2){
            return m.getAnoModelo();
        }else if (atributo == 3){
            return m.getKilometragem();
        }else if (atributo == 4){
            return m.getModelo().getDescricao();
        }else if (atributo == 5){
            return m.getPreco();
        }else{
            return m.getObservacoes();
        }
    }

    @Override
    public String getColumnName(int coluna) {
        if (coluna == 0) {
            return "Id";
        } else if (coluna == 1){
            return "Ano Fabricação";
        }else if (coluna == 2){
            return "Ano Modelo";
        }else if (coluna == 3){
            return "Kilometragem";
        }else if (coluna == 4){
            return "Modelo";
        }else if (coluna == 5){
            return "Preço";
        }else{
            return "Observações";
        }
    }
    
    
    
}
