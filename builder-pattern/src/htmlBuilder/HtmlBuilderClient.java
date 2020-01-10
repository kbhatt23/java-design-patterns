package htmlBuilder;

public class HtmlBuilderClient {
	public static void main(String[] args) {
		String[] messages = {"first line" , "second line" , "third line" , "fourth line"};
		StringBuilder builder = new StringBuilder();
		builder.append("<ul>\n");
		
		for(int i=0 ; i < messages.length ; i++) {
			builder.append("<li>");
			builder.append(messages[i]);
			builder.append("</li>\n");
		}
		builder.append("</ul>");
		
		
		System.out.println("old style coding starts");
		System.out.println(builder.toString());
		System.out.println("old style coding ends");
		
		System.out.println("builder way started");
		
		HtmlBuilder builderP = new HtmlBuilder("ul");
		builderP.addChild("li", "first value");
			//.addChild("li", "second value")
		    //.addChild("li", "third value")
			//.addChild("li", "fourth value");
		
		System.out.println(builderP);
		System.out.println("builder way ended");
	}
}
