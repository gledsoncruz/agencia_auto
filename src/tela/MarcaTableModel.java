/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Marca;

/**
 *
 * @author gledson.cruz
 */
public class MarcaTableModel extends AbstractTableModel{
    
    private List<Marca> marcas;

    public MarcaTableModel(List<Marca> marcas) {
        this.marcas = marcas;
    }

    @Override
    public int getRowCount() {
        return this.marcas.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int objeto, int atributo) {
        Marca m = (Marca) this.marcas.get(objeto);

        if (atributo == 0) {
            return m.getId();
        } else {
            return m.getNome();
        }
    }

    @Override
    public String getColumnName(int coluna) {
        if (coluna == 0) {
            return "Id";
        } else {
            return "Nome";
        }
    }
    
    
    
}
