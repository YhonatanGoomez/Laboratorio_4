import hangman.model.BonusScore;
import org.junit.Assert;
import org.junit.Test;
public class BonusScoreTest {
    @Test
    public void validateInvaldPara() {
        BonusScore s = new BonusScore();
        int puntos = s.calculateScore(-2, 4);
        Assert.assertEquals(puntos, -1);
    }
    @Test
    public void validateValdPara() {
        BonusScore s = new BonusScore();
        int puntos = s.calculateScore(3, 2);
        Assert.assertEquals(puntos, 20);
    }
    @Test
    public void validateScore() {
        BonusScore s = new BonusScore();
        int puntos = s.calculateScore(1, 4);
        Assert.assertEquals(puntos, -1);
    }
    @Test
    public void validateScore1() {
        BonusScore s = new BonusScore();
        int puntos = s.calculateScore(0, 0);
        Assert.assertEquals(puntos, 0);
    }
    @Test
    public void validateScore2() {
        BonusScore s = new BonusScore();
        int puntos = s.calculateScore(1, 2);
        Assert.assertEquals(puntos, 0);
    }
    @Test
    public void validateScore3() {
        BonusScore s = new BonusScore();
        int puntos = s.calculateScore(1, 3);
        Assert.assertEquals(puntos, 0);
    }
    @Test
    public void validateScore4() {
        BonusScore s = new BonusScore();
        int puntos = s.calculateScore(1, 1);
        Assert.assertEquals(puntos, 5);
    }
}
