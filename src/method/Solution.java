package method;
/*
 * 3. 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

 */


class Solution {
	 	  //인스턴스 메서드
	      int solution(int x, int y) {
	      int answer = 0;
	     
	      if(x>y) {
	    	  for(int i = y; i<=x; i++){
		          answer+=i;
		      }
	      }
	      else{
	    	  for(int i = x; i<=y; i++){
	          answer+=i;
	    	  }
	      }  
	      return answer;
	  }
	}

//4번 - 속성에 관련된 문제
//인스턴스 변수(static이라는 키워득 없음)
 class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

//5번 
	/*
	void getTotal() {
	  kor=70;
	  eng=90;
	  math=68;
	  int sum = kor + eng + math ;
	  System.out.println(sum);
	}
	
	void getAverage() {
		  kor=70;
		  eng=90;
		  math=67;
		  
		int sum = kor + eng +math;
		float ave = sum/3f;
		System.out.println(ave);
	}
}
*/
//선생님 풀이
	int getTotal() {
		return kor + eng + math ;
	}
	float getAverage(){
		return (kor + eng + math)/(float)3 ;
	}
	}
	
	
