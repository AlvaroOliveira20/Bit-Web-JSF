package br.edu.cesmac.si.nolweb.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType. IDENTITY)
    @Column(name = "id_cartao" )
    private Long idUsuario;
    @NotEmpty(message = "Obrigatório informar o nome do usuário!" )
    private String nome;
    @NotEmpty(message = "Obrigatório informar o CPF do usuário!" )
    private String cpf;
    @NotEmpty(message = "Email não pode ser nulo!" )
    private String email;
    @OneToMany(mappedBy = "usuario")
    List<Cartao> cartoes;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

