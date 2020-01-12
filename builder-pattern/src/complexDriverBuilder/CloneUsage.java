package complexDriverBuilder;

public class CloneUsage {

	public static void main(String[] args) {

		CloneBean bean1 = new CloneBean("ram");
		InnerCloneBean inner = new InnerCloneBean("inner ram bhagwan");
		bean1.bean1 = inner;
		System.out.println(bean1);
		try {
			CloneBean bran2 = (CloneBean)bean1.clone();
			bran2.bean1.innerbeanName= "sita ram ki jai";
			
			System.out.println(bean1);
			System.out.println(bran2);
			System.out.println(bran2==bean1);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
