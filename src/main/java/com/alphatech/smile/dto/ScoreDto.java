package com.alphatech.smile.dto;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreDto {
    private String username;
    private String name;
    private Long score;
}