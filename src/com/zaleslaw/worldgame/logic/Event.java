package com.zaleslaw.worldgame.logic;

public abstract class Event {
	String message;
	
   public abstract void ifCreate();
   public abstract void SendMessage();
   public abstract void ChangeWorld();
	
}
