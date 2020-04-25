package com.pokedex.reativeweb.repository;

import com.pokedex.reativeweb.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String> {
}