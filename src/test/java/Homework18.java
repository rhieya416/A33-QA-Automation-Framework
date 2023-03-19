import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {

    @Test
    public void playSongTest() {
        logIn("demo@class.com", "te$t$tudent");
        playSong();

        Assert.assertTrue(isSongPlaying());
    }
    private void logIn("demo@class.com", "te$t$tudent") {
    }
    public void playSong() {
        WebElement playButton = driver.findElement(By.cssSelector("[data-testid='play-next-btn']")).click();
        WebElement playNextButton = driver.findElement(By.cssSelector("[data-testid='play-btn']")).click();
    }
    public boolean isSongPlaying(){
        WebElement songIsPlaying = driver.findElement(By.cssSelector("[data-testid='sound-bar-play']"));
        return songIsPlaying.isDisplayed();
    }
}
