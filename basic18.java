
//조건에 맞게 수열 변환하기 2

/*
 * arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
 * 
 * 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다. 
 * 
 * 이러한 x 중 가장 작은 값을 return
 * 
 * 배열의 변화하다가 멈춤 -> 배열이 같아지는 시점
 */
public class basic18 {
    public int solution(int[] arr) {
        int[] arr1 = new int[arr.length];
        int count = 0;
        int answer = 0;

        while (true) {
            //count 는 배열의 변화만을 감지함
            count = 0;

            //변화가 있을 때마다 count 증가
            for (int i = 0; i < arr.length; i++) {

                if(arr[i] >= 50 && arr[i]%2==0){
                    arr[i] = arr[i]/2;
                    count++;
                }else if(arr[i] < 50 && arr[i]%2==1){
                    arr[i] = arr[i]*2 + 1;
                    count++;
                }else{
                    arr[i] = arr[i];
                }
                
            }
            //더이상 배열의 변화가 없다면 while 문 종료
            if(count == 0) break;
            answer++;
        }


        return answer;
    }


}
