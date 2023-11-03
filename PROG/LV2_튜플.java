import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<String> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < s.length()-1; i++){
            if(s.charAt(i) == '{'){
                String now = "";
                i++;
                while(s.charAt(i) != '}'){
                    now = now + s.charAt(i);
                    i++;
                }
                list.add(now);
            }
        }
        
        Collections.sort(list, (o1, o2) ->{
           return o1.length()-o2.length(); 
        });
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < list.size(); i++){
            String tmp = list.get(i);
            String[] arr = tmp.split(",");
            
            for(int j = 0; j < arr.length; j++){
                if(!set.contains(Integer.valueOf(arr[j]))){
                    set.add(Integer.valueOf(arr[j]));
                    result.add(Integer.valueOf(arr[j]));
                }
            }
        }
        
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}