/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Modelo;

/**
 *
 * @author gledson.cruz
 */
public class ModeloTableModel extends AbstractTableModel{
    
    private List<Modelo> modelos;
    
    public ModeloTableModel(List<Modelo> modelos) {
        super();
        this.modelos = modelos;
    }

    @Override
    public int getRowCount() {
        return this.modelos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int objeto, int atributo) {
        Modelo m = (Modelo) this.modelos.get(objeto);
        if (atributo == 0) {
            return m.getId();
        } else if(atributo == 1) {
            return m.getDescricao();
        }else if (atributo == 2){
            return m.getPotencia();
        }else{
            return m.getMarca().getNome();
        }
    }

    @Override
    public String getColumnName(int coluna) {
        if (coluna == 0) {
            return "Id";
        } else if (coluna == 1){
            return "Descricao";
        } else if(coluna == 2){
            return "Potência";
        } else {
            return "Marca";
        }
    }
    
    
    
}
