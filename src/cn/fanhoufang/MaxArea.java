package cn.fanhoufang;

/**
 * @author 樊厚方 
 *			 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 *			在坐标内画 n 条垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，
 *         使得它们与 x 轴共同构 成的容器可以容纳最多的水。
 *         说明：你不能倾斜容器，且 n 的值至少为 2。
 *         示例:
 *         输入: [1,8,6,2,5,4,8,3,7] 输出: 49
 * 
 *
 */
public class MaxArea {
	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 7, 4, 8, 3, 7,8,6 };
		System.out.println(maxArea(arr));
	}

	public static int maxArea(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int max = 0;
		while (right > left) {
			max = Math.max(max, Math.min(arr[right], arr[left]) * (right - left));
			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}
		}
		return max;

	}
	
	

}
