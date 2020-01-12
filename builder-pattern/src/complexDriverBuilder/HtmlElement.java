package complexDriverBuilder;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {

	private String name;
	
	//non mandaotry field
	private String value;
	
	private List<HtmlElement> chilldTags = new ArrayList<HtmlElement>();
//can alos use public in case we want this to show up like String and stirngbuilder
	private HtmlElement(String name) {
		this.name = name;
	}
	private HtmlElement(String name,String value) {
		this.name = name;
		this.value=value;
	}
	
	public void addChild(String name, String value) {
		chilldTags.add(new HtmlElement(name, value));
	}
	@Override
	public String toString() {
			StringBuilder sb= new StringBuilder();
			sb.append("<"+this.name + ">");
			sb.append(System.lineSeparator());
			for(HtmlElement child : this.chilldTags) {
				sb.append("<"+child.name + ">");
				sb.append(child.value);
				sb.append("</" + child.name+ ">");
				sb.append(System.lineSeparator());
			}
			sb.append("</" + this.name+">");
			return sb.toString();
	}
	
	static class HTMLElmentBuilder{

		 private HtmlElement root;
		 public HTMLElmentBuilder(String name) {
			 root = new HtmlElement(name);
		 }
		 //fluent builder
		 public HTMLElmentBuilder addChild(String name, String value) {
			 root.addChild(name, value);
			 return this;
		 }
		 @Override
		public String toString() {
			// TODO Auto-generated method stub
			return root.toString();
		}
		 public HtmlElement build() {
			 return root;
		 }
	}
	
}
