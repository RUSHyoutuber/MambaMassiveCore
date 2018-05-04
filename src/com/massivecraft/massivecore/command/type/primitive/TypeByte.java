package com.massivecraft.massivecore.command.type.primitive;

import org.bukkit.command.CommandSender;

public class TypeByte extends TypeAbstractNumber<Byte>
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static TypeByte i = new TypeByte();
	public static TypeByte get() { return i; }
	public TypeByte() { super(Byte.class); }
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public String getName()
	{
		return "n�mero pequeno";
	}
	
	@Override
	public Byte valueOf(String arg, CommandSender sender) throws Exception
	{
		return Byte.parseByte(arg);
	}

}
