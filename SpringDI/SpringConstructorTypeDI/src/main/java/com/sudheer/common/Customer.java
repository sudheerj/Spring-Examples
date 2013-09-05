package com.sudheer.common;

public class Customer 
{
	private String name;
    private int age;
    private Float height=6.0f;
      
   public Customer(String name, int age, Float height) {
       this.name = name;
       this.age = age;
       this.height = height;
   }
  
   public Customer(String name,Float height) {
       this.name = name;
       this.height = height;
   }
   
   public Customer(String name,int age) {
       this.name = name;
       this.age = age;
   }
   public String getname() {
       return name;
   }
   public void setname(String name) {
       this.name = name;
   }
   public int getAge() {
       return age;
   }
   public void setAge(int age) {
       this.age = age;
   }
   public Float getHeight() {
       return height;
   }
   public void setHeight(Float height) {
       this.height = height;
   }
	//getter and setter methods
	public String toString(){
		return " name : " +name +  "\n age : " + age+"\n height : "
	               + height ;
	}
 
}
