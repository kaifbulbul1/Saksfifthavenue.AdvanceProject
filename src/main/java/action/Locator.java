package action;

public enum Locator {
	
	ID("id"),
	NAME("name"),
	CLASSNAME("className"),
	LINKTEXT("linkText"),
	PARTIALLINKTEXT("partialLinkText"),
	CSSSELECTOR("cssSelector"),
	TAGNAME("tagName"),
	XPATH("xpath");
	
	String locator;
	Locator(String locator)
	{
		this.locator = locator;
	}
	
	public String getLocator(){
		return this.locator;
	}

}
