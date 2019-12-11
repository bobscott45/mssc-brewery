package dev.rwscott.co.uk.msscbrewery.service;

import dev.rwscott.co.uk.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void deleteBeer(UUID beerId);
    void updateBeer(BeerDto beerDto);
}
