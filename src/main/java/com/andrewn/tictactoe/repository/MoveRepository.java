package com.andrewn.tictactoe.repository;

import com.andrewn.tictactoe.domain.Game;
import com.andrewn.tictactoe.domain.Move;
import com.andrewn.tictactoe.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by pdybka on 17.06.16.
 */
@Repository
public interface MoveRepository extends CrudRepository<Move, Long> {

    List<Move> findByGame(Game game);
    List<Move> findByGameAndPlayer(Game game, Player player);
    int countByGameAndPlayer(Game game, Player player);
}
