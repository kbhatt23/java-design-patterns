package com.learning.designpatterns.self;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//immutable/unmodifable/read only version of list
public class ListUnmodifableProxy<T> /* extends AbstractList<T> */ implements List<T>{

	//hold the actual instance
	private List<T> actualList;

	public ListUnmodifableProxy(List<T> actualList) {
		this.actualList = actualList;
	}

	@Override
	public int size() {
		return actualList.size();
	}

	@Override
	public boolean isEmpty() {
		return actualList.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return actualList.contains(o);
	}

	@Override
	public Iterator<T> iterator() {
		return actualList.iterator();
	}

	@Override
	public Object[] toArray() {
		return actualList.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return actualList.toArray(a);
	}

	@Override
	public boolean add(T e) {
		throw new UnsupportedOperationException("We do not supported mutable list");
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException("We do not supported mutable list");
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return actualList.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException("We do not supported mutable list");
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException("We do not supported mutable list");
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("We do not supported mutable list");
		
	}

	@Override
	public T get(int index) {
		return actualList.get(index);
	}

	@Override
	public T set(int index, T element) {
		throw new UnsupportedOperationException("We do not supported mutable list");
	}

	@Override
	public void add(int index, T element) {
		throw new UnsupportedOperationException("We do not supported mutable list");		
	}

	@Override
	public T remove(int index) {
		throw new UnsupportedOperationException("We do not supported mutable list");
		}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}


}
