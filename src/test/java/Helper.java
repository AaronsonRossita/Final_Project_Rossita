import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

    public static final String URL1 = "https://en.wikipedia.org/wiki/Moldova";
    public static final String URL2 = "https://en.wikipedia.org/wiki/Muse_(band)";
    public static final String FOLDER = "C:\\Users\\User\\Desktop\\Screenshots\\";
    public static final String JPG = ".jpg";
    public static final String TXT = ".txt";


    public static ChromeDriver setupDriver(){
        System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
        return new ChromeDriver();
    }



}
