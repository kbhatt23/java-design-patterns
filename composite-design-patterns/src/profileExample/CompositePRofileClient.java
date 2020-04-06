package profileExample;

import java.util.Arrays;

public class CompositePRofileClient {
	public static void main(String[] args) {
		//this is the root node
		//root node can not have child
		Profile profileShankar = new Profile("uma", "maheshwar");
		Profile profileBrahma = new Profile("saraswati", "brahma");
		CompositeProfile profileVishnu = new CompositeProfile("shree", "vishnu", Arrays.asList(profileShankar,profileBrahma));
		
		Profile prfileRadha = new Profile("shree", "radha");
		Profile prfileBalram = new Profile("haldhar", "balram");
		CompositeProfile profileKrishna = new CompositeProfile("radha", "krishna", Arrays.asList(profileVishnu, prfileRadha , prfileBalram));
		
		profileKrishna.aggregateProfile()
					  .forEach(profile -> System.out.println(profile.toString()));
	}

}
