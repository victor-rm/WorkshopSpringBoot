package com.victru.crud.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_user")
public class User  implements Serializable {

    // Para evitar a escrita extensa do número de série do Serializable para a Classe User
    // utilizei a annotation do Spring @Serial. No caso, se eu quisesse usar ela:
    // private static final long serialVersionUID = 1L;

    @Serial
    private static final long serialVersionUID = 1L;

    @Id // Define a variável abaixo com ID para o JPA conseguir identificar a chave primária do banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Determina a autoincrementação da variável ID
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;

    public User(Long id, String name, String email, String phone, String password) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    // Há a necessidade de um contrutor sem argumentos pois em entidades JPA, é necessário ter um construtor público
    // sem argumentos para que o provedor de persistência possa instanciar a classe via reflexão.
    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
