package gameLogic.player;

import org.junit.Test;

import static gameLogic.player.Player.*;
import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void get_symbol_test() {
        //given
        Player[] inputPlayer = new Player[]{N, E, W, W, S, N};
        char[] outputCheck = new char[]{'N', 'E', 'W', 'W', 'S', 'N'};
        char[] output = new char[inputPlayer.length];
        //when
        for (int i = 0; i < inputPlayer.length; i++) {
            output[i] = inputPlayer[i].getSymbol();
        }
        //then
        for (int i = 0; i < inputPlayer.length; i++) {
            assertEquals(outputCheck[i], output[i]);
        }
    }

    @Test
    public void ordinal_test() {
        //given
        Player[] inputPlayer = new Player[]{N, E, W, W, S, N};
        int[] outputCheck = new int[]{0, 1, 3, 3, 2, 0};
        int[] output = new int[inputPlayer.length];
        //when
        for (int i = 0; i < inputPlayer.length; i++) {
            output[i] = inputPlayer[i].ordinal();
        }
        //then
        for (int i = 0; i < inputPlayer.length; i++) {
            assertEquals(outputCheck[i], output[i]);
        }
    }

    @Test
    public void next_player_test() {
        //given
        Player[] input = {N, W, E, S, S, N};
        Player[] outputCheck = {E, N, S, W, W, E};
        Player[] output = new Player[input.length];
        //when
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i].nextPlayer();
        }
        //then
        for (int i = 0; i < input.length; i++) {
            assertEquals(outputCheck[i], output[i]);
        }
    }

}
