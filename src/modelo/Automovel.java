package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**Classe entidade Automovel - essa classe representa a tabela automovel no banco de dados
 * Essa classe pode ser gerada automaticamente pelo netbeans (botao direito - Novo - Classe da Entidade
 * Caso ainda nao tenha sido criado, sera pedido para criar uma conexao com o banco (META-INF/persistence.xml)
 * @author gledson.cruz
 */
@Entity //Anotacao que informa que essa classe e uma entidade
public class Automovel implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id //Anotacao que indica a criacao de uma chave primaria na tabela automovel
    @GeneratedValue(strategy = GenerationType.AUTO) //Auto incremento na chave primaria (sequence)
    private Integer id;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private String observacoes;
    private Double preco;
    private Integer kilometragem;
    @ManyToOne //Muitos automoveis para 1 modelo
    private Modelo modelo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Automovel)) {
            return false;
        }
        Automovel other = (Automovel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Automovel[ id=" + id + " ]";
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(Integer kilometragem) {
        this.kilometragem = kilometragem;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
    
}
