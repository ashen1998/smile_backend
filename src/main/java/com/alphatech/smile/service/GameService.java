package com.alphatech.smile.service;

import com.alphatech.smile.dto.ScoreDto;

import java.util.List;

public interface GameService {

    Long getScore(Long id);

    Long setScore(Long id, Long score);

    List<ScoreDto> getAllUsersSortedByScore();
}
