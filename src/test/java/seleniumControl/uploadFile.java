package seleniumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

    WebDriver driver = new ChromeDriver();

    void openSite() {
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='filesToUpload']")).sendKeys("");
        // In the above we need to set the file Name and location in the sendKeys
        // We can only automate the webBased Application not Window based so for this we will directly setValue

        // Multiple File Upload
        String file1 = "";
        String file2 = "";

        driver.findElement(By.xpath("//*[@id='filesToUpload']")).sendKeys(file1 + "/n" + file2);
    }

    public static void main(String[] args) {
        uploadFile uf = new uploadFile();
        uf.openSite();
    }
}
