package com.alphatech.smile.controller;

import com.alphatech.smile.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/game/score")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<Object> getScore(@RequestParam Long id) {
        log.info("GameController : getUserScore : id :{}", id);
        return new ResponseEntity<>(gameService.getScore(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> setScore(@RequestParam Long id, @RequestParam Long score) {
        log.info("GameController : getUserScore : id :{}", id);
        return new ResponseEntity<>(gameService.setScore(id, score), HttpStatus.OK);
    }

    @GetMapping("/all_users")
    public ResponseEntity<Object> getAllUsersSortedByScore() {
        log.info("GameController : getAllUsersSortedByScore ");
        return new ResponseEntity<>(gameService.getAllUsersSortedByScore(), HttpStatus.OK);
    }
}
