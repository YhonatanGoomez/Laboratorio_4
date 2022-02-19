import hangman.model.PowerScore;
import org.junit.Assert;
import org.junit.Test;
public class PowerScoreTest {
    @Test
    public void validateInvaldPara() {
        PowerScore s = new PowerScore();
        int puntos = s.calculateScore(2, -4);
        Assert.assertEquals(puntos, -1);
    }
    @Test
    public void validateValdPara() {
        PowerScore s = new PowerScore();
        int puntos = s.calculateScore(3, 2);
        Assert.assertEquals(puntos, 111);
    }
    @Test
    public void validateScore() {
        PowerScore s = new PowerScore();
        int puntos = s.calculateScore(1, 2);
        Assert.assertEquals(puntos, 0);
    }
    @Test
    public void validateScore1() {
        PowerScore s = new PowerScore();
        int puntos = s.calculateScore(4, 2);
        Assert.assertEquals(puntos, 500);
    }
    @Test
    public void validateScore2() {
        PowerScore s = new PowerScore();
        int puntos = s.calculateScore(-1, -1);
        Assert.assertEquals(puntos, -1);
    }
    @Test
    public void validateScore3() {
        PowerScore s = new PowerScore();
        int puntos = s.calculateScore(0, 0);
        Assert.assertEquals(puntos, 0);
    }
    @Test
    public void validateScore4() {
        PowerScore s = new PowerScore();
        int puntos = s.calculateScore(1, 1);
        Assert.assertEquals(puntos, 0);
    }
    @Test
    public void validateScore5() {
        PowerScore s = new PowerScore();
        int puntos = s.calculateScore(1, 0);
        Assert.assertEquals(puntos, 5);
    }
    @Test
    public void validateScore6() {
        PowerScore s = new PowerScore();
        int puntos = s.calculateScore(4, 0);
        Assert.assertEquals(puntos, 500);
    }

}
