package com.dynatrace.pong.dto;

public class GameResponse {

    private Long id;
    private Long player1Id;
    private String player1Name;
    private Long player2Id;
    private String player2Name;
    private String winnerName;
    private Long winnerId;
    private Integer player1Score;
    private Integer player2Score;

    public GameResponse() {
    }

    public GameResponse(Long id, Long player1Id, String player1Name,
                        String player2Name, Long player2Id, String winnerName,
                        Long winnerId, Integer player1Score, Integer player2Score) {
        this.id = id;
        this.player1Id = player1Id;
        this.player1Name = player1Name;
        this.player2Id = player2Id;
        this.player2Name = player2Name;
        this.winnerId = winnerId;
        this.winnerName = winnerName;
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
    }
    public Long getPlayer1Id() {
        return player1Id;
    }
    public void setPlayer1Id(Long player1Id) {
    }
    public String getPlayer1Name() {
        return player1Name;
    }
    public void setPlayer1Name(String player1Name) {
    }
    public Long getPlayer2Id() {
        return player2Id;
    }
    public void setPlayer2Id(Long player2Id) {
    }
    public String getPlayer2Name() {
        return player2Name;
    }
    public void setPlayer2Name(String player2Name) {
    }
    public String getWinnerName() {
        return winnerName;
    }
    public void setWinnerName(String winnerName) {
    }
    public Long getWinnerId() {
        return winnerId;
    }
    public void setWinnerId(Long winnerId) {
    }
    public Integer getPlayer1Score() {
        return player1Score;
    }
}

