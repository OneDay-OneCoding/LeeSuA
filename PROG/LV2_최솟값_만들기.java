import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int a = 0, b = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++){
            a = a + A[i]*B[B.length-i-1];
            b = a + B[i]*A[A.length-i-1];
        }
        
        answer = a;
        if(a > b)   answer = b;

        return answer;
    }
}