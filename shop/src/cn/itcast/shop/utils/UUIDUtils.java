package cn.itcast.shop.utils;

import java.util.UUID;

public class UUIDUtils {
	public static String getUuid(){
		return UUID.randomUUID().toString().replace("-", "");
	}
	
}