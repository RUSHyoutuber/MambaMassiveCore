package com.massivecraft.massivecore.adapter;

import com.massivecraft.massivecore.xlib.gson.JsonDeserializationContext;
import com.massivecraft.massivecore.xlib.gson.JsonDeserializer;
import com.massivecraft.massivecore.xlib.gson.JsonElement;
import com.massivecraft.massivecore.xlib.gson.JsonParseException;
import com.massivecraft.massivecore.xlib.gson.JsonPrimitive;
import com.massivecraft.massivecore.xlib.gson.JsonSerializationContext;
import com.massivecraft.massivecore.xlib.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.UUID;

public class AdapterUUID implements JsonDeserializer<UUID>, JsonSerializer<UUID>
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static final AdapterUUID i = new AdapterUUID();
	public static AdapterUUID get() { return i; }
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public JsonElement serialize(UUID src, Type typeOfSrc, JsonSerializationContext context)
	{
		return convertUUIDToJsonPrimitive(src);
	}
	
	@Override
	public UUID deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
	{
		return convertJsonElementToUUID(json);
	}
	
	// -------------------------------------------- //
	// STATIC LOGIC
	// -------------------------------------------- //
	
	public static String convertUUIDToString(UUID uuid)
	{
		return uuid.toString();
	}
	
	public static JsonPrimitive convertUUIDToJsonPrimitive(UUID uuid)
	{
		return new JsonPrimitive(convertUUIDToString(uuid));
	}
	
	public static UUID convertStringToUUID(String string)
	{
		return UUID.fromString(string);
	}
	
	public static UUID convertJsonElementToUUID(JsonElement jsonElement)
	{
		return convertStringToUUID(jsonElement.getAsString());
	}
	
}
