package cn.fanhoufang;

public class Multiply {
	//43.字符串相乘
		public String multiply(String num1, String num2) {
			if(num1.equals("0") || num2.equals("0"))//特殊情况
				return "0";
			
			int n = num1.length(), m = num2.length();
			//一般来说两个数相乘，其最大位数也不会大于啷个位数之和
			int[] res = new int[n + m];
			char[] nums1 = num1.toCharArray();
			char[] nums2 = num2.toCharArray();
			//字符转换为数字
			for(int i =0; i<nums1.length; i++)
				nums1[i] -= '0';
			for(int i =0; i<nums2.length; i++)
				nums2[i] -= '0';
			
//			for(int i =0; i<nums1.length; i++)
//				System.out.print(nums1[i]);
		
			//用第二个数的每一个数  乘以 第一个数，结果存到数组里，并注意处理进位
			for(int i =0; i<m; i++) {
				int carry = 0;
				for(int j =0; j<n; j++) {
					res[i + j] = res[i+j] + nums2[m-1-i] * nums1[n-1-j] + carry;
					carry = res[i+j] / 10;
					res[i+j] %= 10;
				}
				//处理进位
				int k = i+n;
				while(carry > 0) {
					res[k] += carry;
					carry = res[k] /10;
					res[k] = res[k] % 10;
					k++;
				}
			}
			
			StringBuffer sb = new StringBuffer();//使用String或者StringBuffer都可以，但StringBuffer效率更高
			int i = n + m - 1;
			while(i >= 0 && res[i] == 0)
				i--;
			while(i >= 0) {
				sb.append(res[i]);
				i--;
			}
			
			return sb.toString();
	    }


}
