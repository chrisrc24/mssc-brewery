package guru.springframework.msscbrewery.web.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {
    
    @Override
    public BeerDto getBeerById(UUID id){
        return BeerDto.builder().id(UUID.randomUUID())
        .beerName("Galaxy Beer")
        .beerStyle("IPA")
        .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto){
        return BeerDto.builder().id(UUID.randomUUID()).beerName("SavedBeer").beerStyle("IPA").build();
    }
}