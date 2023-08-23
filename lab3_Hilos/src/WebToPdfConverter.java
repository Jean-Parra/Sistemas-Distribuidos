import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.xhtmlrenderer.pdf.ITextRenderer;


public class WebToPdfConverter {

  public static void convertUrlsToPdf(List<String> urls) {
    int numThreads = 3;
    ExecutorService executor = Executors.newFixedThreadPool(numThreads);

    for (String url : urls) {
      executor.submit(() -> {
        convertToPdf(url);
      });
    }

    executor.shutdown();
    try {
      executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace(); 
    }
  }

  private static void convertToPdf(String url) {
    String pdfPath = "output_" + System.currentTimeMillis() + ".pdf";

    String chromeDriverPath = "ruta_al_archivo_chromedriver";
    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    
    ChromeOptions options = new ChromeOptions();
    options.setHeadless(true);
    WebDriver driver = new ChromeDriver(options);
    driver.get(url);

    ITextRenderer renderer = new ITextRenderer();

    try {
      Thread.sleep(3000);
      TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
      File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
      renderer.setDocumentFromString("<img src='data:image/png;base64," + screenshotFile + "'/>", "");
      renderer.layout(); 
      renderer.createPDF(new File(pdfPath));
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      renderer.finishPDF();
      driver.quit(); 
    }
  }
}