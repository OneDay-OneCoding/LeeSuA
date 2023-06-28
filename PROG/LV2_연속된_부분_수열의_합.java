class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        
        int min_left = 0;
        int min_right = sequence.length-1;
        
        int left = 0;
        int right = 0;
        int sum = sequence[0];
        
        while(left  sequence.length && right  sequence.length) {
            if (sequence[left]  k) {
                break;
            }
            
            if (sum == k) {
                if (min_right - min_left  right-left) {
                    min_left = left;
                    min_right = right;
                } else if (min_right - min_left == right - left) {
                    if (min_left  left) {
                        min_left = left;
                        min_right = right;
                    }
                }

            }
            
            if (sum = k) {
                right++;
                if (right  sequence.length) {
                    sum += sequence[right];
                }
            } else {
                sum -= sequence[left];
                left++;
            }
        }
        
        answer = new int[]{min_left, min_right};
        return answer;
    }
}