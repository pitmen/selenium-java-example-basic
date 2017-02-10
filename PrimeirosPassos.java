package primeirospassos;

// Importante sempre lembrar dos imports
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeirosPassos {
	
	// definido aqui para que todos os métodos da classe o enxerguem
	WebDriver driver; 
	
	@Before
	public void preCondicao(){
		// alterar o path para o local onde está o seu chromedriver
		System.setProperty("webdriver.chrome.driver", "C:/automacao/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com.br");
		driver.manage().window().maximize();
	}
	
	@Test
	public void teste(){	
		//busca pelo name
		WebElement caixaPesquisa = driver.findElement(By.name("q"));
		caixaPesquisa.sendKeys("Teste de software");
		
		// busca pelo cssSelector
		WebElement pesquisar = driver.findElement(By.cssSelector(".sbico-c"));
		pesquisar.click();
		
		// Imprime o título e a url atual
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
	}	
	
	@After
	public void posCondicao(){
		driver.quit();
	}

}
