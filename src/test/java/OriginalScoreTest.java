import hangman.model.OriginalScore;
import org.junit.Assert;
import org.junit.Test;
public class OriginalScoreTest {
        @Test
        public void validateInvaldPara() {
            OriginalScore s = new OriginalScore();
            int puntos = s.calculateScore(-10, 13);
            Assert.assertEquals(puntos, -1);
        }
        @Test
        public void validateValdPara() {
            OriginalScore s = new OriginalScore();
            int puntos = s.calculateScore(20, 4);
            Assert.assertEquals(puntos, 60);
        }
        @Test
        public void validateScore() {
            OriginalScore s = new OriginalScore();
            int puntos = s.calculateScore(0, 12);
            Assert.assertEquals(puntos, 0);
        }
        @Test
        public void validateScore1() {
            OriginalScore s = new OriginalScore();
            int puntos = s.calculateScore(-1, -1);
            Assert.assertEquals(puntos, -1);
        }
        @Test
        public void validateScore2() {
            OriginalScore s = new OriginalScore();
            int puntos = s.calculateScore(0, 0);
            Assert.assertEquals(puntos, 100);
        }
        @Test
        public void validateScore3() {
            OriginalScore s = new OriginalScore();
            int puntos = s.calculateScore(1, 11);
            Assert.assertEquals(puntos, 0);
        }
        @Test
        public void validateScore4() {
            OriginalScore s = new OriginalScore();
            int puntos = s.calculateScore(1, 10);
            Assert.assertEquals(puntos, 0);
        }
    }

