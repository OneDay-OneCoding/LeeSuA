import java.util.*;
class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        int minA = arrayA[0];
        int minB = arrayB[0];
        for(int i = 0; i < arrayA.length; i++){
            if(minA > arrayA[i]) minA = arrayA[i];
        }
        for(int i = 0; i < arrayB.length; i++){
            if(minB > arrayB[i]) minB = arrayB[i];
        }
        // 1번 구하기
        List<Integer> tmpA = new ArrayList<Integer>();
        List<Integer> divideA = new ArrayList<Integer>();
        Loop1:for(int i = 2; i <= minA/2; i++){
            for(int j = 0; j < arrayA.length; j++){
                if(arrayA[j]%i != 0) continue Loop1;
            }
            tmpA.add(i);
        }
        
        tmpA.add(minA);
        
        for(int i = 0; i < tmpA.size(); i++){
            boolean flag1 = true;
            for(int j = 0; j < arrayA.length; j++){
                if(arrayA[j]%tmpA.get(i) != 0) flag1 = false;
                }
        
            if(flag1) divideA.add(tmpA.get(i));  
        }       
        
        Collections.sort(divideA);
        Collections.reverse(divideA);

        Loop1:for(int i = 0; i < divideA.size(); i++){
            for(int j = 0; j < arrayB.length; j++){
                if(arrayB[j]%divideA.get(i) == 0) continue Loop1;
            }
            answer = divideA.get(i);
            break;
        }
        /////// 2번 구하기
        List<Integer> divideB = new ArrayList<Integer>();
        List<Integer> tmpB = new ArrayList<Integer>();
        
        Loop1:for(int i = 2; i <= minB/2; i++){
            for(int j = 0; j < arrayB.length; j++){
                if(arrayB[j]%i != 0) continue Loop1;
            }
            tmpB.add(i);
        }
        
        tmpB.add(minB);
        
        for(int i = 0; i < tmpB.size(); i++){
            boolean flag1 = true;
            for(int j = 0; j < arrayB.length; j++){
                if(arrayB[j]%tmpB.get(i) != 0) flag1 = false;
                }
        
            if(flag1) divideB.add(tmpB.get(i));  
        }
        
        Collections.sort(divideB);
        Collections.reverse(divideB);

        Loop1:for(int i = 0; i < divideB.size(); i++){
            for(int j = 0; j < arrayA.length; j++){
                if(arrayA[i]%divideB.get(i) == 0) continue Loop1;
            }
            if(answer < divideB.get(i)) answer = divideB.get(i);
            break;
        }
        return answer;
    }
    
}