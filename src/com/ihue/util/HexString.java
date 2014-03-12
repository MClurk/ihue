package com.ihue.util;

public class HexString {
	public static String byteArrayToHexString(byte[] bytes) {
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < bytes.length; ++i) {
			if((bytes[i] & 0xff) < 16)
				result.append('0');
			result.append(Integer.toHexString(bytes[i] & 0xff));
		}
		return result.toString();
	}
}
