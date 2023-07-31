package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution10 {
    public List solution(int start, int end) {
        List<Integer> answer = new ArrayList<>();
        for (int i = start; i >= end; i--) {
            answer.add(i);
        }
        return answer;
    }
}
