package com.andrewn.tictactoe.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;


/**
 * Created by pdybka on 27.05.16.
 */

@Getter
@Setter
public class PlayerDTO {

    @NotNull
    private String userName;
    @NotNull
    private String password;
    @NotNull
    @Email
    private String email;
}
