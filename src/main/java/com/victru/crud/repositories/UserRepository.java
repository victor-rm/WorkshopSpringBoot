package com.victru.crud.repositories;

import com.victru.crud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Responsável por criar operações com a entidade User
 *
 *  Nesse caso, a interface UserRepository extende JpaRepository passando 2 tipos User (tipo da entidade que irá ser
 *  passada) e Long (Chave da entidade, nesse caso Id)
 */

public interface UserRepository extends JpaRepository<User, Long> {

}
