package hjfgcjhgf;

public class Sdghxh
{

	//Iterate for number of links
			for (int i = 0; i < LinksCount; i++) 
			{
				//Target Each link
				WebElement Each_link=All_links.get(i);
				//Get name of link
				String Linkname=Each_link.getText();
				String Linkhref=Each_link.getAttribute("href");
				System.out.println(Linkname+"=>    "+Linkhref);
				
				Each_link.click();
				Thread.sleep(2000);
				
				driver.navigate().back();
				Thread.sleep(2000);
				
				//Restore all page refernces to avlid <<" staleelementreference excepion">>
				Footer_Area=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
				All_links=Footer_Area.findElements(By.tagName("a"));
			}
			
}
