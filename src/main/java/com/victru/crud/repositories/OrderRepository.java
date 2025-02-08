package com.victru.crud.repositories;

import com.victru.crud.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Responsável por criar operações com a entidade Order
 *
 *  Nesse caso, a interface OrderRepository extende JpaRepository passando 2 tipos Order (tipo da entidade que irá ser
 *  passada) e Long (Chave da entidade, nesse caso Id)
 */

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
