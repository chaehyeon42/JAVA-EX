package code;

public class Caesar {
	
		public String solution(String s, int n) {
	      //ab  1
			//StringBuilder:String과 문자열을 더할 때 기존의 데이터에 더하는 방식을 사용(속도도 빠르고 상대적으로 부하가 적음)
						
			StringBuilder sb = new StringBuilder();
	 
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);									//s.charAt();=  String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
	 
				if (ch >= 'a' && ch <= 'z') {							//문자가 소문자인 경우
					ch = (char) (ch + n);
					if (ch > 'z')
						ch -= 26;										//마지막 문자인 z보다 커질 경우 알파벳 수만큼 빼준다
				} else if (ch >= 'A' && ch <= 'Z') {					//문자가 대문자인 경우
					ch = (char) (ch + n);
					if (ch > 'Z')
						ch -= 26;										//마지막 문자인 Z보다 커질 경우 알파벳 수만큼 빼준다
				}
	 
				sb.append(ch);				//문자열을 더하는 역할
			}
	 
			return sb.toString();			//만들어진 문자열을 출력
	  }
	
	}

