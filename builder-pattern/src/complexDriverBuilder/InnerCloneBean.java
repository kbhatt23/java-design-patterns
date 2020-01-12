package complexDriverBuilder;

public class InnerCloneBean {

	public InnerCloneBean(String innerbeanName) {
		this.innerbeanName = innerbeanName;
	}

	@Override
	public String toString() {
		return "InnerCloneBean [innerbeanName=" + innerbeanName + "]";
	}

	public String innerbeanName;
}
