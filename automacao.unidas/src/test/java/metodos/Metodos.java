package metodos;

import org.openqa.selenium.By;

import driver.Drivers;

public class Metodos extends Drivers {
	
	
	public void clicar(By elemento) {
	driver.findElement(elemento).click();	
	
}
    public void escrever (By elemento,String texto) {
	driver.findElement(elemento).sendKeys(texto);
}
}
