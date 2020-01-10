package htmlBuilder;



public class HtmlBuilder {
	private HtmlElement root ;
	
	public HtmlBuilder(String name) {
		root = new HtmlElement(name);
	}
	
	public HtmlBuilder addChild(String tagName, String tagValue) {
		root.addChild(new HtmlElement(tagName, tagValue));
		return this;
	}
	
	@Override
	public String toString() {
		return root.toString();
	}
}
