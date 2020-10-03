/*
 * 
 */
package cn.fanhoufang;

public class StrStr {
	public static void main(String[] args) {
		System.out.println("".indexOf(""));
		
	}
    public int strStr(String haystack, String needle) {
    	if(null==haystack||null==needle) {
    		return -1;
    	}
    	if(needle.length()>haystack.length()) {
    		return -1;
    	}

    	if(needle.equals("")) {
			return 0;
		}
    	if(needle.length()==haystack.length()&&!needle.equals(haystack)) {
    		
    		return -1;
    	}
    	int len = needle.length();
		for(int i=0; i<haystack.length()-len+1;i++) {
			if(haystack.substring(i, i+len).equals(needle)) {
				return i;
			}
		}
		return -1;
        
    }

}
