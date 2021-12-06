package com.andrewn.tictactoe.DTO;

import com.andrewn.tictactoe.domain.Player;
import com.andrewn.tictactoe.enums.GameType;
import com.andrewn.tictactoe.enums.Piece;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by pdybka on 31.05.16.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {

    private int id;
    private GameType gameType;
    private Piece piece;
}


