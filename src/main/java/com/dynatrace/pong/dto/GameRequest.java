package com.dynatrace.pong.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class GameRequest {

    @NotBlank(message = "Player 1 ID is required")
    private Long player1Id;

    @NotBlank(message = "Player 2 ID is required")
    private Long player2Id;

    @NotBlank(message = "Player 1 score is required")
    @Min(value = 0, message = "Player score must be at least 0")
    private Integer player1Score;

    @NotBlank(message = "Player 2 score is required")
    @Min(value = 0, message = "Player score must be at least 0")
    private Integer player2Score;

    public GameRequest() {}

    public GameRequest(Long player1Id, Long player2Id, Integer player1Score, Integer player2Score) {
        this.player1Id = player1Id;
        this.player2Id = player2Id;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public Integer getPlayer1Score() {
        return player1Score;
    }
    public void setPlayer1Score(Integer player1Score) {
        this.player1Score = player1Score;
    }
    public Integer getPlayer2Score() {
        return player2Score;
    }
    public void setPlayer2Score(Integer player2Score) {}
    public Long getPlayer1Id() {
        return player1Id;
    }
    public void setPlayer1Id(Long player1Id) {
        this.player1Id = player1Id;
    }
    public Long getPlayer2Id() {
        return player2Id;
    }
    public void setPlayer2Id(Long player2Id) {}
}
