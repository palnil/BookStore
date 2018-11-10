package com.yoshallc.herbal.dtos;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HerbalDto {

    private long herbalId;
    private String herbalName;
    private int qty;
    private double price;
    private LocalDate expirationDate;
    private String herbalGroup;

}
