package com.example.util;

public class Util {
	public static boolean checkNullString(String name)
	{
		if(name == null || name.length() < 0 || name.equalsIgnoreCase(""))
			return true;
		return false;
	}
}
