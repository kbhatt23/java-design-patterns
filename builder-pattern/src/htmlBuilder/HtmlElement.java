package htmlBuilder;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
	private static final String TAG_END = ">";
	private static final String TAG_START = "<";
	private static final String TAG_DELIMETER = "/";
	private String tagName;
	private String tagValue;
	
	private List<HtmlElement> childList  = new ArrayList<HtmlElement>();
	//name is mandatory
	public HtmlElement(String tagName) {
		this.tagName = tagName;
		}
	
	//use below constructor for child tags creation
	public HtmlElement(String tagName, String tagValue) {
		this.tagName = tagName;
		this.tagValue = tagValue;
	}
	
	public void addChild(HtmlElement child) {
		childList.add(child);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(TAG_START + tagName+ TAG_END);
		sb.append(System.lineSeparator());
		for(HtmlElement child : childList) {
			sb.append(TAG_START + child.tagName + TAG_END);
			sb.append(child.tagValue);
			sb.append(TAG_START+TAG_DELIMETER + child.tagName + TAG_END);
			sb.append(System.lineSeparator());
		}
		sb.append(TAG_START + TAG_DELIMETER+tagName+ TAG_END);
		return sb.toString();
	}
	
}
