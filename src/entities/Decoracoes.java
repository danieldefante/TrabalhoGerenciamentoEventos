package entities;
// Generated May 18, 2017 8:21:19 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Decoracoes generated by hbm2java
 */
@Entity
@Table(name="decoracoes"
    ,catalog="gerenciadoreventos"
)
public class Decoracoes  implements java.io.Serializable {


     private Integer id;
     private Contatos contatos;
     private Enderecos enderecos;
     private String nome;
     private Set<EventosDecoracoes> eventosDecoracoeses = new HashSet<EventosDecoracoes>(0);

    public Decoracoes() {
    }

	
    public Decoracoes(Contatos contatos, Enderecos enderecos, String nome) {
        this.contatos = contatos;
        this.enderecos = enderecos;
        this.nome = nome;
    }
    public Decoracoes(Contatos contatos, Enderecos enderecos, String nome, Set<EventosDecoracoes> eventosDecoracoeses) {
       this.contatos = contatos;
       this.enderecos = enderecos;
       this.nome = nome;
       this.eventosDecoracoeses = eventosDecoracoeses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="contato_id", nullable=false)
    public Contatos getContatos() {
        return this.contatos;
    }
    
    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="endereco_id", nullable=false)
    public Enderecos getEnderecos() {
        return this.enderecos;
    }
    
    public void setEnderecos(Enderecos enderecos) {
        this.enderecos = enderecos;
    }

    
    @Column(name="nome", nullable=false, length=100)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="decoracoes")
    public Set<EventosDecoracoes> getEventosDecoracoeses() {
        return this.eventosDecoracoeses;
    }
    
    public void setEventosDecoracoeses(Set<EventosDecoracoes> eventosDecoracoeses) {
        this.eventosDecoracoeses = eventosDecoracoeses;
    }




}


