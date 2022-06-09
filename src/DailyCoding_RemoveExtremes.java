//문제 : 문자열을 요소로 갖는 배열을 입력받아 가장 짧은 문자열과 가장 긴 문자열을 제거한 배열을 리턴해야 합니다.

// 주의사항 :
//가장 짧은 문자열의 길이와 가장 긴 문자열의 길이가 같은 경우는 없습니다.
//가장 짧은 문자열 또는 가장 긴 문자열이 다수일 경우, 나중에 위치한 문자열을 제거합니다.
//공백을 입력받을 경우, null을 반환합니다.

//입출력 예시 : 가장 짧은 문자열의 길이와 가장 긴 문자열의 길이가 같은 경우는 없습니다.
//가장 짧은 문자열 또는 가장 긴 문자열이 다수일 경우, 나중에 위치한 문자열을 제거합니다.
//공백을 입력받을 경우, null을 반환합니다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DailyCoding_RemoveExtremes {
    public static void main(String[] args) {

        String[] arr = {"where", "is", "the", "longest", "word"};

        String MinString = "";
        String MaxString = "";
        int min = 0;
        int max = 0;
        int size = 0;

        if(arr.length==0){
            System.out.println("null");
        }

        // 반복문으로 0부터 length -1까지 반복한다.
        for (int i = 0; i < arr.length; i++ ) {
            //만약 arr[i] length <= arr[min].length
            if (arr[i].length() <= arr[min].length()) {
                // min = i ;
                min = i;
                MinString = arr[i];

                //만약 arr[i] length >= arr[max].length
            } else if (arr[i].length() >= arr[max].length()) {
                // max = i;
                max = i;
                MaxString = arr[i];
                // 그렇지 않으면
            } else {
                //continue
                continue;
            }
        }
        //반복문 끝난 후, min과 max의 인덱스 제거하고 배열 리턴한다.

        ArrayList<String> list = new ArrayList<>();
        for(String temp : arr){
            list.add(temp);
        }
        System.out.println(list);

        //반복문 돌면서 min, max의 i를 구하고 배열에서 min max 인덱스를 제거하고 리턴한다.
        list.remove(MinString);
        list.remove(MaxString);

        String[] result = list.toArray(new String[0]);

        for (String temp : list) {
            result[size++] = temp;
        }

        System.out.println(Arrays.toString(result));
        System.out.println(list);
    }
}
