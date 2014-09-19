package dao;

import java.io.Serializable;
import java.util.List;

/**Interface do DAO generico que sera utilizado por todos os outros DAO's do projeto
 * @author gledson.cruz
 * @param <T> - Classe que implementa a interface
 * @param <ID> - Serializable 
 */

public interface Dao<T, ID extends Serializable> {
    
    /** Salva um objeto no banco
     *  @param obj T - Objeto generico
     */
    public void salvar(T obj);
    
    /** Altera um objeto no banco
     *  @param obj T - Objeto generico
     */
    public void alterar(T obj);
    
    /** Exclui um objeto no banco
     *  @param obj T - Objeto generico
     */
    public void excluir(T obj);
    
    /** Carrega um objeto pelo id
     *  @param id Integer - id do objeto a ser carregado
     *  @return T - Objeto generico
     */
    public T carregarPorId(Integer id);
    
    /** Carrega uma lista de todos os registros
     *  @return List - Lista de objetos T
     */
    public List<T> carregarTodos();
    
}
