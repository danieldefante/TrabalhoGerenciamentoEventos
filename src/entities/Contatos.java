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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Contatos generated by hbm2java
 */
@Entity
@Table(name="contatos"
    ,catalog="gerenciadoreventos"
)
public class Contatos  implements java.io.Serializable {


     private Integer id;
     private String telefone;
     private String celular;
     private String whatsapp;
     private Set<Decoracoes> decoracoeses = new HashSet<Decoracoes>(0);
     private Set<Buffets> buffetses = new HashSet<Buffets>(0);
     private Set<Atracoes> atracoeses = new HashSet<Atracoes>(0);
     private Set<Locais> locaises = new HashSet<Locais>(0);
     private Set<Pessoas> pessoases = new HashSet<Pessoas>(0);

    public Contatos() {
    }

	
    public Contatos(String telefone, String celular, String whatsapp) {
        this.telefone = telefone;
        this.celular = celular;
        this.whatsapp = whatsapp;
    }
    public Contatos(String telefone, String celular, String whatsapp, Set<Decoracoes> decoracoeses, Set<Buffets> buffetses, Set<Atracoes> atracoeses, Set<Locais> locaises, Set<Pessoas> pessoases) {
       this.telefone = telefone;
       this.celular = celular;
       this.whatsapp = whatsapp;
       this.decoracoeses = decoracoeses;
       this.buffetses = buffetses;
       this.atracoeses = atracoeses;
       this.locaises = locaises;
       this.pessoases = pessoases;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="telefone", nullable=false, length=30)
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    @Column(name="celular", nullable=false, length=30)
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    @Column(name="whatsapp", nullable=false, length=30)
    public String getWhatsapp() {
        return this.whatsapp;
    }
    
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contatos")
    public Set<Decoracoes> getDecoracoeses() {
        return this.decoracoeses;
    }
    
    public void setDecoracoeses(Set<Decoracoes> decoracoeses) {
        this.decoracoeses = decoracoeses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contatos")
    public Set<Buffets> getBuffetses() {
        return this.buffetses;
    }
    
    public void setBuffetses(Set<Buffets> buffetses) {
        this.buffetses = buffetses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contatos")
    public Set<Atracoes> getAtracoeses() {
        return this.atracoeses;
    }
    
    public void setAtracoeses(Set<Atracoes> atracoeses) {
        this.atracoeses = atracoeses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contatos")
    public Set<Locais> getLocaises() {
        return this.locaises;
    }
    
    public void setLocaises(Set<Locais> locaises) {
        this.locaises = locaises;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contatos")
    public Set<Pessoas> getPessoases() {
        return this.pessoases;
    }
    
    public void setPessoases(Set<Pessoas> pessoases) {
        this.pessoases = pessoases;
    }




}


