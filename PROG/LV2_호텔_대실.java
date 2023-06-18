import java.util.*;

class Solution {
    static class Room implements Comparable<Room>{
        int start, end;
        Room(int start, int end){
            this.start = start;
            this.end = end;
        }
        
        @Override
        public int compareTo(Room r){
            if(this.end == r.end) return this.start - r.start;
            return this.end - r.end;
        }
        
    }
    public int solution(String[][] book_time) {
        int answer = 1;
        int cnt = book_time.length;//방 개수
        List<Room> rooms = new ArrayList<>();
        
        for(int i = 0; i < cnt; i++){
            String s1 = book_time[i][0];
            String s2 = book_time[i][1];
            int start = s1.charAt(4) -'0'
                + s1.charAt(3)*10 -'0'*10
                + s1.charAt(1)*100 -'0'*100 
                + s1.charAt(0)*1000 -'0'*1000;
            
            int end = s2.charAt(4)-'0' + s2.charAt(3)*10 -'0'*10
                + 10 + s2.charAt(1)*100 -'0'*100 + s2.charAt(0)*1000-'0'*1000;
            
            if(s2.charAt(3)*10-'0'*10+10 >= 60){
                end = end + 100 - 60;
            }
            
            rooms.add(new Room(start, end));
        }
        
        Collections.sort(rooms);
        
        List<Integer> ends = new ArrayList<>();
        ends.add(-1);
        // 할 수 있는 것 중 끝이 가장 길었던거
        for(int i = 0; i < cnt; i++){
            int temp = rooms.get(i).start;
            int tempEnd = rooms.get(i).end;
            int tempI = 0;
            boolean isExist = false;
            
            for(int size = ends.size(), j = size-1; j >= 0; j--){
                if(ends.get(j) <= temp){
                    isExist = true;
                    tempI = j;
                    break;
                }
            }
            if(isExist){
                ends.set(tempI, tempEnd);
            }
            else{
                ends.add(tempEnd);
            }
            Collections.sort(ends);
            
        }
        
        answer = ends.size();
        
        return answer;
    }
}