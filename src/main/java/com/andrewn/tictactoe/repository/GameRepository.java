package com.andrewn.tictactoe.repository;

import com.andrewn.tictactoe.domain.Game;
import com.andrewn.tictactoe.domain.Player;
import com.andrewn.tictactoe.enums.GameStatus;
import com.andrewn.tictactoe.enums.GameType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by pdybka on 30.05.16.
 */
@Repository
public interface GameRepository extends CrudRepository<Game, Long>{
    List<Game> findByGameTypeAndGameStatus(GameType GameType, GameStatus GameStatus);
    List<Game> findByGameStatus(GameStatus gameStatus);
    Game findOneById(Long id);
}
