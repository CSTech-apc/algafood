package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.models.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();

	Restaurante buscar(Long id);

	Restaurante salvar(Restaurante restaurante);

	void deletar(Restaurante restaurante);
	
}
