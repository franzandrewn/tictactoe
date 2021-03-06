package com.andrewn.tictactoe.repository;

import com.andrewn.tictactoe.domain.Game;
import com.andrewn.tictactoe.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by patrycja on 15.05.16.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    Player findOneByUserName(String userName);
}
