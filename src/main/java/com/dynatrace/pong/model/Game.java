package com.dynatrace.pong.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "games")
public class Game {

    public Game() {

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_1_id")
    private Player player1;

    @ManyToOne(optional = false)
    @JoinColumn(name = "player_2_id")
    private Player player2;

    @ManyToOne
    @JoinColumn(name = "player_1_score_id")
    private Player player1Score;

    @ManyToOne
    @JoinColumn(name = "player_2_score_id")
    private Player player2Score;

    //What if there is a tie
    @ManyToOne(optional = false)
    @JoinColumn(name = "winner_id")
    private Player winnerId;

    private LocalDateTime gameStartDateTime;
    private LocalDateTime gameEndDateTime;

    public Game(LocalDateTime gameDate, LocalDateTime gameEndDateTime) {
        this.gameStartDateTime = gameDate;
        this.gameEndDateTime = gameEndDateTime;
    }


    public Player getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(Player player2Score) {
        this.player2Score = player2Score;
    }

    public Player getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(Player player1Score) {
        this.player1Score = player1Score;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Player getWinner() {
        if (player1Score.getRanking() > player2Score.getRanking()) {
            return player1;
        }
        if (player2Score.getRanking() > player1Score.getRanking()) {
            return player2;
        }
        //In case of a tie
        return null;
    }
}
