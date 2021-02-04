package com.learning.designpatterns.self;
//like tree any node can be contained
//each signle node can cnotain any number of node
//client thinks there is only root node is present

import java.util.Set;

public interface Component {
	//can add a component
	//add the component to first level
	void add(Component component);
	
	//print first level recursively
	void print();
	
	//remove item from first level only
	boolean remove(Component component);
	
	Set<Component> getChildren();
}
