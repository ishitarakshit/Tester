package com.practice;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String lcp = "";
		if(!isEmptyArray(strs)) {
			String first = strs[0];
			if(strs.length == 1) {
				return first;
			}
			for(int i = 1;i <= first.length(); i++) {
				String firstPrefix = first.substring(0, i);
				for(int j = 1; j < strs.length; j ++) {
					System.out.println("indexOf : "+strs[j].indexOf(first));
					if(strs[j].startsWith(firstPrefix)) {
						continue;
					} else {
						return lcp;
					}
				}
				lcp = firstPrefix;
			}
		}
		return lcp;
	}
	
	public boolean isEmptyArray(String[] strs) {
		if(strs.length > 0) {
			for(String str:strs) {
				 if(str.isEmpty()) {
					 return true;
				 } else {
					 continue;
				 }
			}
		} else {
			return true;
		}
		return false;
	}
}
