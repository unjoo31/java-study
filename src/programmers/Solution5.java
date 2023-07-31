package programmers;

public class Solution5 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.startsWith(is_suffix) || my_string.endsWith(is_suffix)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}
