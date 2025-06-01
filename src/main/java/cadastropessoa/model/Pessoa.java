package model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    public Pessoa(){
    }

    public Long getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome() {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail() {
        this.email = email;
    }
}
