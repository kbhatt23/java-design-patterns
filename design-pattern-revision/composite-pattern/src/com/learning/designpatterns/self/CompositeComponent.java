package com.learning.designpatterns.self;

import java.util.HashSet;
import java.util.Set;

public class CompositeComponent implements Component {
	// unique identified
	private int id;

	// assuming it has a list of component itself
	// unique only allowed
	private Set<Component> children;

	public CompositeComponent(int id) {
		children = new HashSet<>();
		this.id = id;
	}

	// add componet to first level
	@Override
	public void add(Component component) {
		if (component.equals(this))
			return;
		children.add(component);
	}

	@Override
	public void print() {
		if(id == 0 )
		{
			System.out.println("tree is empty");
			return;
		}
		printRecursively(this);
	}

	private void printRecursively(Component component) {
		System.out.println("=====================");
		System.out.println(component);
		component.getChildren().forEach(item -> printRecursively((CompositeComponent) item));
		System.out.println("=====================");
	}

	@Override
	public boolean remove(Component component) {
		if (component.equals(this))
		{
			
			//remove everything
			children = null;
			id=0;

			return true;
		}
		boolean result = children.remove(component);
		if (!result) {
			for (Component children : children) {
				if(result)
					break;
				result = children.remove(component);
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositeComponent other = (CompositeComponent) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompositeComponent [id=" + id + "]";
	}

	@Override
	public Set<Component> getChildren() {
		return this.children;
	}

}
