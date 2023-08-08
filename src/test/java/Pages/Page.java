package Pages;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Page {
    private static WebDriver driver;
    Util.ElementHelper elementHelper;
    static WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new Util.ElementHelper(driver);
    }


    public void anasayfa() {
        driver.get("http://www.seleniumeasy.com/");
    }

    public void seleniumbut() {
        driver.findElement(By.cssSelector("li[class='expanded active dropdown'] a[class='dropdown-toggle active']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void javabut() {
        driver.findElement(By.cssSelector("li[class='expanded active dropdown open'] li[class='first leaf'] a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void scroll() {
        WebElement element = driver.findElement(By.cssSelector("article[id='node-251'] header a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void back() {
        wait.until(ExpectedConditions.visibilityOf((WebElement) driver));
        driver.navigate().back();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void testngbut() {
        driver.findElement(By.cssSelector("body > header:nth-child(3) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void pacefactorybut() {
        driver.findElement(By.cssSelector("div[id='collapseOne'] li:nth-child(1) a:nth-child(1)")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void ifcommand() {
        String text = driver.findElement(By.cssSelector("div[class='section-title'] h1")).getText();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (text.equals("tolga ercan")) {
            driver.findElement(By.cssSelector("a[href='/selenium-tutorials/simple-page-object-model-framework-example']")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            driver.navigate().back();
            driver.navigate().back();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void iftrue() {
        driver.findElement(By.cssSelector("body > header:nth-child(3) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();
        String text1 = driver.findElement(By.cssSelector("div[class='section-title'] h1")).getText();
        if (text1.equals("Maven Tutorials")) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.cssSelector("a[href='/selenium-tutorials/simple-page-object-model-framework-example']")).click();
        } else {
            driver.navigate().back();

        }
    }

    public void clickjs() {
        driver.findElement(By.cssSelector("a[href='/selenium-tutorials/click-element-using-javascriptexecutor']")).click();
        driver.navigate().back();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void morebutton() {
        WebElement dropdown = driver.findElement(By.cssSelector("li.last.expanded.active.dropdown > a"));
        dropdown.click();

        WebElement menuItem = driver.findElement(By.cssSelector("#navbar-collapse > nav > ul > li.last.expanded.active.dropdown.open > ul > li:nth-child(5) > a"));
        menuItem.click();

    }

    public void ifcommad1() {
        String text = driver.findElement(By.cssSelector("article[id='node-84'] header a")).getText();
        if (text.equals("Timeout Test in JUnit")) {
            driver.findElement(By.cssSelector("article[id='node-84'] header a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else {
            driver.navigate().back();
        }
    }

    public void popularpost() {
        WebElement popularpost = driver.findElement(By.cssSelector("#headingTwo"));
        popularpost.click();
        WebDriverWait wait = new WebDriverWait(driver, 10); // 10 saniye kadar bekleyecek
        wait.until(ExpectedConditions.elementToBeClickable(popularpost));


    }

    public void selectinex() {
        WebElement optionAtIndexZero = driver.findElement(By.cssSelector("a[href='/testng-tutorials/assertions-in-testng']"));
        WebDriverWait wait = new WebDriverWait(driver, 10); // 10 saniye kadar bekleyecek
        wait.until(ExpectedConditions.elementToBeClickable(optionAtIndexZero));
        optionAtIndexZero.click();
    }

    public void backhomepage() {
        driver.findElement(By.cssSelector("img[title='Selenium Easy']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void protractorbutton() {
        WebElement elementToClick = driver.findElement(By.cssSelector("a[href='/protractor-angularjs-tutorials']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();
    }

    public void findingelements() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[id='node-268'] header a")));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();

        // Bir süre beklemek için
        try {
            Thread.sleep(2000); // 2 saniye bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geri butonuna tıkla
        driver.navigate().back();
    }

    public void capabilities() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[id='node-264'] header a")));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();

        // Bir süre beklemek için
        try {
            Thread.sleep(2000); // 2 saniye bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geri butonuna tıkla
        driver.navigate().back();

    }

    public void howtocheck() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[id='node-263'] header a")));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();

        // Bir süre beklemek için
        try {
            Thread.sleep(2000); // 2 saniye bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geri butonuna tıkla
        driver.navigate().back();

    }

    public void runProtractor() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[id='node-261'] header a")));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();

        // Bir süre beklemek için
        try {
            Thread.sleep(2000); // 2 saniye bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geri butonuna tıkla
        driver.navigate().back();
    }

    public void usingLocators() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[id='node-260'] header a")));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();

        // Bir süre beklemek için
        try {
            Thread.sleep(2000); // 2 saniye bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geri butonuna tıkla
        driver.navigate().back();
    }

    public void runMultiple() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[id='node-258'] header a")));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();

        // Bir süre beklemek için
        try {
            Thread.sleep(2000); // 2 saniye bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geri butonuna tıkla
        driver.navigate().back();

    }

    public void protractorsBasic() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[id='node-119'] header a")));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();

        // Bir süre beklemek için
        try {
            Thread.sleep(2000); // 2 saniye bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geri butonuna tıkla
        driver.navigate().back();

    }

    public void installing() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[id='node-118'] header a")));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();

        // Bir süre beklemek için
        try {
            Thread.sleep(2000); // 2 saniye bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geri butonuna tıkla
        driver.navigate().back();

    }

    public void protractorintroduction() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement elementToClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("article[id='node-117'] header a")));

        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().perform();

        // Bir süre beklemek için
        try {
            Thread.sleep(2000); // 2 saniye bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geri butonuna tıkla
        driver.navigate().back();

    }

    public void jenkinsclick() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elementToClick = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/jenkins-tutorials']")));
        elementToClick.click();
    }

    public void jenkinsscreenshot() {
        WebElement element = driver.findElement(By.cssSelector("article[id='node-232'] header a"));

// Ekran görüntüsünü al ve belirtilen yere kaydet
        File screenshot = element.getScreenshotAs(OutputType.FILE);
        String desktopPath = System.getProperty("user.home") + "\\Desktop\\selenium web drıver\\SCREENSHOTAS\\JenkinsScreenShot.png";

        try {
            FileHandler.copy(screenshot, new File(desktopPath));
            System.out.println("Ekran görüntüsü başarıyla kaydedildi: " + desktopPath);
        } catch (IOException e) {
            System.out.println("Ekran görüntüsü kaydedilirken hata oluştu: " + e.getMessage());
        }

    }

    public void containerscreenshot() {

        WebElement element = driver.findElement(By.cssSelector("body > div.main-container.container-fluid > div > aside.col-sm-3"));
// Ekran görüntüsünü al ve belirtilen yere kaydet
        File screenshot = element.getScreenshotAs(OutputType.FILE);
        String desktopPath = System.getProperty("user.home") + "\\Desktop\\selenium web drıver\\SCREENSHOTAS\\ContainerScreenShot.png";

        try {
            FileHandler.copy(screenshot, new File(desktopPath));
            System.out.println("Ekran görüntüsü başarıyla kaydedildi: " + desktopPath);
        } catch (IOException e) {
            System.out.println("Ekran görüntüsü kaydedilirken hata oluştu: " + e.getMessage());
        }


    }

    public void robot() {

        // Ekran görüntüsünü alacak olan alanın koordinatlarını belirle
        int x = 0; // Başlangıç x koordinatı
        int y = 500; // Başlangıç y koordinatı
        int width = 1519; // Genişlik
        int height = 289; // Yükseklik

        // WebDriver'ı "TakesScreenshot" arayüzüyle kullanarak ekran görüntüsünü al
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Ekran görüntüsünden belirtilen alana ait bir kırpma yap
            BufferedImage fullImage = ImageIO.read(screenshot);
            BufferedImage areaScreenshot = fullImage.getSubimage(x, y, width, height);
            ImageIO.write(areaScreenshot, "png", screenshot);

            // Ekran görüntüsünü belirtilen yere kaydet
            String desktopPath = System.getProperty("user.home") + "\\Desktop\\selenium web drıver\\SCREENSHOTAS\\AreaScreenShot.png";
            FileHandler.copy(screenshot, new File(desktopPath));

            System.out.println("Ekran görüntüsü başarıyla kaydedildi: " + desktopPath);
        } catch (Exception e) {
            System.out.println("Ekran görüntüsü alınırken hata oluştu: " + e.getMessage());
        }
    }

    public void location() {
        WebElement element = driver.findElement(By.cssSelector("#footer")); // Elementi bulmak için uygun bir CSS seçici kullanın.

        Point location = element.getLocation();
        int xCoordinate = location.getX();
        int yCoordinate = location.getY();

        Dimension size = element.getSize();
        int width = size.getWidth();
        int height = size.getHeight();

        System.out.println("Elementin X Koordinatı: " + xCoordinate);
        System.out.println("Elementin Y Koordinatı: " + yCoordinate);
        System.out.println("Elementin Genişliği: " + width);
        System.out.println("Elementin Yüksekliği: " + height);
    }
}




