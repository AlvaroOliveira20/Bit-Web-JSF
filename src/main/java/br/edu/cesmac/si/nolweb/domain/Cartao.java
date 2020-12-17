package br.edu.cesmac.si.nolweb.domain;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Cartao {
    @Id
    @GeneratedValue (strategy = GenerationType. IDENTITY)
    @Column(name = "id_cartao" )
    private Long idCartao;
    @NotEmpty(message = "Obrigatório informar o título!" )
    private String titulo;
    @NotNull(message = "Obrigatório informar o jornalista!" )
    @ManyToOne
    Usuario usuario ;
    @NotNull(message = "Obrigatório informar a editoria!" )
    @ManyToOne(cascade = CascadeType. ALL)
    private Usuario editoria;
    public Long getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(Long idCartao) {
        this.idCartao = idCartao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getEditoria() {
        return editoria;
    }

    public void setEditoria(Usuario editoria) {
        this.editoria = editoria;
    }

}