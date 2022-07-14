package ex2;

public class SubHealth extends Health {
	//속성
	double s_weight; 		//(표준체중 저장)- 인스턴스 변수
    double fat;      		//(비만도 저장)- 인스턴스 변수
    String result;   		//(결과값 저장)- 인스턴스 변수
    
    //생성자
    SubHealth (){			//매개변수가 없는 생성자(기본생성자)
    	s_weight = 0.0;
    	fat =0.0;
    	result= null;
    }
    //메서드
    void calculate() {				//매개변수가 없고 리턴도 없는 인스턴스메서드
    	//성별이 남자이면 
    	if(gender=='M') {
    	//표준체중 = (신장-100)*0.9 게산 후 s_weight에 저장
    		s_weight=(tall-100)*0.9;
    	}else {	
    	//그렇지 않으면
    	//표준체중 = (신장-100)*0.85
    		s_weight=(tall-100)*0.85;
    	}
    	//비만도계산:현재체중(Kg)/표준체중(Kg)*100
    	fat=weight/s_weight*100;
    	//결과
    	//비만도가 150이상이면 
    	if(fat>=150) {
    	//고도비만
    		result="고도비만";
    	}else if(fat>=131) {
    	//비만도가 131이상이면 
    	//중도비만
    		result="중도비만";
    	}else if(fat>=121) {
    	//비만도가 121이상이면
    	//경도비만
    		result="경도비만";
    	}else if(fat>=111) {
    	//비만도가 111이상이면
    	//과체중
    		result="과체중";	
    	}else if(fat>=91) {
    	//비만도가 91 이상이면 
    	//정상(표준체중)
    		result="표준체중";
    	}else {
    	//그렇지 않으면
    	//저체중
    		result="저체중";
    	}
    }
    	void output2() {				//매개변수가 없고 리턴도 없는 인스턴스메서드
    		System.out.println("당신은 비만도 140.84이고, 중도비만 입니다.");
    	}
}