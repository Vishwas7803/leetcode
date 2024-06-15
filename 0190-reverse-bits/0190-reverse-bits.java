public class Solution {
    public int reverseBits(int n) {
        int reversedNum = 0;
        for (int i = 0; i < 32; i++) {
            reversedNum <<= 1;
            reversedNum |= (n & 1);
            n >>= 1;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n1 = 0b00000010100101000001111010011100;
        int n2 = 0b11111111111111111111111111111101;

        System.out.println(solution.reverseBits(n1));        System.out.println(solution.reverseBits(n2)); 
    }
}
