package com.victru.crud.resources;

import com.victru.crud.entities.Order;
import com.victru.crud.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Disponibiliza endpoints REST (cria pontos de acesso para que seja realizavel chamadas HTTP)
@RequestMapping(value = "/orders") // Define o caminho base para as requisições que devem ser tratadas pela classe
public class OrderResource {

    private final OrderService service;

    @Autowired
    public OrderResource(OrderService service) {
        this.service = service;
    }


    @GetMapping // Atende a requisições HTTP do tipo GET
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list); // Retorna com sucesso no HTTP
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
