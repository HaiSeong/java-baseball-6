package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.model.score.Score;
import org.junit.jupiter.api.Test;

class ScoreTest {

    @Test
    void testToString_스트라이크_볼() {
        // given
        Score score = new Score(1, 1);

        // when
        String result = score.toString();

        // then
        assertThat(result).isEqualTo("1볼 1스트라이크");
    }

    @Test
    void testToString_스트라이크() {
        // given
        Score score = new Score(0, 2);

        // when
        String result = score.toString();

        // then
        assertThat(result).isEqualTo("2스트라이크");
    }

    @Test
    void testToString_볼() {
        // given
        Score score = new Score(3, 0);

        // when
        String result = score.toString();

        // then
        assertThat(result).isEqualTo("3볼");
    }

    @Test
    void testToString_낫싱() {
        // given
        Score score = new Score(0, 0);

        // when
        String result = score.toString();

        // then
        assertThat(result).isEqualTo("낫싱");
    }

    @Test
    void isThreeStrike_3스트라이크() {
        // given
        Score score = new Score(0, 3);

        // when
        boolean result = score.isThreeStrike();

        // then
        assertThat(result).isEqualTo(true);
    }

    @Test
    void isThreeStrike_3스트라이크_아님() {
        // given
        Score score = new Score(0, 1);

        // when
        boolean result = score.isThreeStrike();

        // then
        assertThat(result).isEqualTo(false);
    }
}
