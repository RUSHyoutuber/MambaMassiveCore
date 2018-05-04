package com.massivecraft.massivecore.command.type;

import com.massivecraft.massivecore.util.Txt;
import org.bukkit.command.CommandSender;

public abstract class TypeAbstractSimple<T> extends TypeAbstractException<T>
{
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public TypeAbstractSimple(Class<?> clazz)
	{
		super(clazz);
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public String extractErrorMessage(String arg, CommandSender sender, Exception ex)
	{
		return Txt.parse("�c\"%s�c\"�c n�o � um %s valido.", arg, this.getName());
	}

}
