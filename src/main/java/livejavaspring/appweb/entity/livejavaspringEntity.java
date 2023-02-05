package livejavaspring.appweb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class livejavaspringEntity
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
    @Column(name="Titulo", nullable=false)
    private String titulo;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }

    @Column(name="Descrição", nullable=true)
    private String descricao;

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(){
        this.descricao = descricao;
    }

}
