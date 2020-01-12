package htmlBuilder;

import complexDriverBuilder.CloneBean;

public class CloneUsage {

	public static void main(String[] args) {

		CloneBean bean1 = new CloneBean("ram");
		try {
			CloneBean bran2 = (CloneBean)bean1.clone();
			bran2.name= "sita ram";
			
			System.out.println(bean1);
			System.out.println(bran2==bean1);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
