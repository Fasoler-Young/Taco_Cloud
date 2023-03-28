package com.example.taco.repo.template;


import com.example.taco.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);
}
