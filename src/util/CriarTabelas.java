/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.AutomovelDao;
import dao.MarcaDao;
import dao.ModeloDao;
import modelo.Automovel;
import modelo.Marca;
import modelo.Modelo;

/**
 *
 * @author gledson.cruz
 */
public class CriarTabelas {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        JPAUtil.getEntityManager();
        popularTabelas();
    }
    
    public static void popularTabelas(){        
        
        /**
         * Testando insercao de dados
         * Lembrando que se essa classe for executada mais de uma vez ira gerar dados redundantes !
         */
        MarcaDao marcaDao = new MarcaDao();
        Marca m = new Marca();
        m.setNome("Fiat");
        marcaDao.salvar(m);
        
        ModeloDao modeloDao = new ModeloDao();
        Modelo modelo = new Modelo();
        modelo.setDescricao("Siena");
        modelo.setMarca(m);
        modelo.setPotencia(200);
        modeloDao.salvar(modelo);
        
        AutomovelDao autoDao = new AutomovelDao();
        Automovel auto = new Automovel();
        auto.setAnoFabricacao(2007);
        auto.setAnoModelo(2008);
        auto.setKilometragem(70000);
        auto.setModelo(modelo);
        auto.setObservacoes("Carro Novo !!");
        auto.setPreco(16000.0);
        autoDao.salvar(auto);
        
        
        
        
    }
}


