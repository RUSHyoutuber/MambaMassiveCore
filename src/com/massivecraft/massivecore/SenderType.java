package com.massivecraft.massivecore;

public enum SenderType
{
	PLAYER, // A player. Such as Notch or Dinnerbone. @console n�o � um player.
	NONPLAYER, // A sender which n�o � um player. Such as @console.
	ANY, // Anyone. Both players, and nonplayers.
	
	;
}
