package com.example1;

public class May_11task implements Camera,MusicPlayer{
	public void takephoto() {
		System.out.println("smile please");
	}
	public void playMusic()
	{
		System.out.println("what song you want me to play now!!");
	}
	@Override
	public void specifications() {
		// TODO Auto-generated method stub
		System.out.println("this is mainly from the to hear music");
		
	}
	@Override
	public void warranty() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("it belongs to sony");
		
	}
	@Override
	public void zoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String args[])
	{
		May_11task obj1 = new May_11task();
		obj1.brand();
		
	}
	
}
