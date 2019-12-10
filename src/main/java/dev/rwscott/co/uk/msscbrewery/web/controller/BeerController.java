package dev.rwscott.co.uk.msscbrewery.web.controller;


import dev.rwscott.co.uk.msscbrewery.service.BeerService;
import dev.rwscott.co.uk.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(
                beerService.getBeerById(UUID.randomUUID()),
                HttpStatus.OK
        );
    }
}
