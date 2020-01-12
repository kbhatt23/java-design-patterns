package complexDriverBuilder;

import complexDriverBuilder.HtmlElement.HTMLElmentBuilder;

public class HtmlElementClient {
public static void main(String[] args) {
	//prepare data
	
	HtmlElement element = new HTMLElmentBuilder("ul")
			.addChild("li", "jai shree ram")
			.addChild("li", "jai hanuman")
			.addChild("li", "jai ram duta").build();
	System.out.println(element);
}
}
