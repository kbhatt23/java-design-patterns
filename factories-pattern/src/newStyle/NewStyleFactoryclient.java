package newStyle;

import newStyle.bean.CoordinatePointsBad;
import newStyle.bean.CoordinatePointsGood;

public class NewStyleFactoryclient {

	public static void main(String[] args) {
		CoordinatePointsBad badPolar = new CoordinatePointsBad(2, 10, "polar");
		System.out.println(badPolar);
		
		CoordinatePointsBad badPolar1 = new CoordinatePointsBad(2, 10, "normal");
		System.out.println(badPolar1);
		
		System.out.println("good way ki shuruat");
		CoordinatePointsGood goodpolar =	CoordinatePointsGood.createBean(2, 10, "polar");
		System.out.println(goodpolar);
		
		CoordinatePointsGood goodpolar1 =	CoordinatePointsGood.createBean(2, 10, "normal");
		System.out.println(goodpolar1);
		
	}
}
