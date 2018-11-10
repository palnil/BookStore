package com.yoshallc.herbal.responses;

import com.yoshallc.herbal.dtos.HerbalDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HerbalResponse {

    private List<HerbalDto> herbals;

}
