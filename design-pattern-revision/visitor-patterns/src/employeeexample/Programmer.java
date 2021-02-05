package employeeexample;

public class Programmer extends AbstractEmployee{

	//extra states
	private String language;
	
	public Programmer(String name,String language) {
		super(name);
		this.language=language;
	}

	@Override
	public void accept(EmployeeVisitor employeeVisitor) {
		employeeVisitor.visit(this);
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
