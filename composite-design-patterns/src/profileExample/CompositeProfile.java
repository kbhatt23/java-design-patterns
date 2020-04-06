package profileExample;

import java.util.ArrayList;
import java.util.List;

public class CompositeProfile extends Profile{
	private List<Profile> innerProfiles;

	public List<Profile> getInnerProfiles() {
		return innerProfiles;
	}
	//composite profile will always have innerProfile or child profile
	public CompositeProfile(String firstName, String lastName, List<Profile> innerProfiles) {
		super(firstName, lastName);
		this.innerProfiles = innerProfiles;
	}
	

	public List<Profile> aggregateProfile(){
		List<Profile> profileList = new ArrayList<Profile>();
		profileList.add(this);
		List<Profile> innerProfileList = this.getInnerProfiles();
		iterateCompositeItem(profileList, innerProfileList);
	return profileList;
	}
	private void iterateCompositeItem(List<Profile> profileList, List<Profile> innerProfileList) {
		for(Profile innerProfile:innerProfileList) {
			profileList.add(innerProfile);
			if(innerProfile instanceof CompositeProfile) {
				iterateCompositeItem(profileList, ((CompositeProfile) innerProfile).getInnerProfiles());
			}
		}
	}
	
	@Override
	public void  printName() {
		System.out.println(aggregateProfile()); 
	}
}
