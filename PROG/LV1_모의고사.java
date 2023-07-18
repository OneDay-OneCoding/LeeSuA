import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int a = 0, b = 0, c = 0;

        for (int i = 0, size = answers.length; i < size; i++) {
            if (first[i % 5] == answers[i]) a++;
            if (second[i % 8] == answers[i]) b++;
            if (third[i % 10] == answers[i]) c++;
        }

        int max = Math.max(a, Math.max(b, c));

        if (max == a && max == b && max == c) answer = new int[]{1, 2, 3};
        else if (max == a && max == b) answer = new int[]{1, 2};
        else if (max == b && max == c) answer = new int[]{2, 3};
        else if (max == a && max == c) answer = new int[]{1, 3};
        else if (max == a) answer = new int[]{1};
        else if (max == b) answer = new int[]{2};
        else if (max == c) answer = new int[]{3};
        else answer = new int[0];

        return answer;
    }
}
