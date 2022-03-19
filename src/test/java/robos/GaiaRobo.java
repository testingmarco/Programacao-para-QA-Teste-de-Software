package robos;

import com.beust.jcommander.Strings;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {

    private ChromeDriver julioDriver;

    public GaiaRobo() {
        WebDriverManager.chromedriver().setup();
        julioDriver = new ChromeDriver();
    }

    public void acessarUmSiteChamado(String site) {
        julioDriver.get(site);
    }

    public String pegarOTituloDaPagina() {
        return julioDriver.getTitle();
    }

    public void fazerLogin() {

        System.out.println("vou fazer login");
    }
    public void lancarNota() {

        System.out.println("vou lancar uma nota");
    }

}
