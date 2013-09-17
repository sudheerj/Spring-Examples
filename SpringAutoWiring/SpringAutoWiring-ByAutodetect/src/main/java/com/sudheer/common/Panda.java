package com.sudheer.common;

public class Panda {
	private KungFu kungfu;

	public Panda(KungFu kungfu) {
		System.out.println("autowiring by constructor");
		this.kungfu = kungfu;
	}

	
	/*public KungFu getKungfu() {
		return kungfu;
	}

	public void setKungfu(KungFu kungfu) {
		System.out.println("autowiring by type");
		this.kungfu = kungfu;
	}*/

	@Override
	public String toString() {
		return "Person [kungfu=" + kungfu + "]";
	}

}