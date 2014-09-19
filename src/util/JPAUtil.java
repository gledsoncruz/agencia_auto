/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**Essa classe irá disponibilizar a conexao com o banco de dados para que sejam feitas as transacoes
 * @author gledson.cruz
 */
public class JPAUtil {

    private static final EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("agenciaAutomoveisPU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}
