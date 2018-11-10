package com.yoshallc.herbal.controllers;

import com.yoshallc.herbal.dtos.HerbalDto;
import com.yoshallc.herbal.responses.HerbalResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HerbalController {

    @GetMapping(value = "/getallherbals", produces = "application/json")
    public ResponseEntity<HerbalResponse> getAllHerbals(){

            List<HerbalDto> herbals = new ArrayList<HerbalDto>();
            HerbalDto h1 = new HerbalDto(1,"Diabit",15,7.00, LocalDate.of(2019, Month.DECEMBER,31),"Tablets");
            HerbalDto h2 = new HerbalDto(2,"Herde",15,5.00, LocalDate.of(2019, Month.OCTOBER,15),"Tablets");

            herbals.add(h1);
            herbals.add(h2);

            return new ResponseEntity<HerbalResponse>(new HerbalResponse(herbals), HttpStatus.OK);


    }
}
