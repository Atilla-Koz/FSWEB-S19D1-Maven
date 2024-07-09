package com.workintech.s18d2.service;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.repository.FruitRepository;
import lombok.AllArgsConstructor;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    @Override
    public List<Fruit> getByPriceASC() {
        return fruitRepository.getByPriceASC();
    }

    @Override
    public List<Fruit> getByPriceDESC() {
        return fruitRepository.getByPriceDesc();
    }

    @Override
    public Fruit getById(Long id) {
        return fruitRepository.findById(id).orElseThrow(() -> new PlantException("plant with given id is not exist" + id, HttpStatus.SC_NOT_FOUND));
    }

    @Override
    public Fruit save(Fruit fruit) {
        return null;
    }

    @Override
    public Fruit delete(Long id) {
        return null;
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return null;
    }
}
