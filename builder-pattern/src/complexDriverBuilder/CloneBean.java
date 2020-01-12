package complexDriverBuilder;

public class CloneBean implements Cloneable {
	

	@Override
	public String toString() {
		return "CloneBean [name=" + name + ", bean1=" + bean1 + "]";
	}

	public String name;
	
	public InnerCloneBean bean1;

	public CloneBean(String name) {
		super();
		this.name = name;
	}

	//protected functions become porivate after extending in different package
	  @Override public CloneBean clone() throws CloneNotSupportedException { 
	  return (CloneBean) super.clone(); }
	 
}
