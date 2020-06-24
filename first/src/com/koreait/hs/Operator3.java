package com.koreait.hs;

public class Operator3 {
	public static void main(String[] args) {
		int n1= 10;
		n1 = n1 + 1;			//리터럴 값은 되도록 사용하지 않는게 좋다. (더하기 1 같은.. 사용할 시 사용하는 이유 주석으로 적어주는게 좋음)
		System.out.println("n1 : " + n1);
		
		int n2 = 10;
		int cost = 1;			
		n2 = n2 + cost;			//리터럴값으로 +1 하는 것 보다 따로 변수로 지정해주는게 좋음. 하드코딩(바뀌지 않는 코드) 최소화하는게 좋다.
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		n3 += (-2) ; 			//음수를 쓸 때는 ()안에 넣어주는게 좋다. 가독성 때문에. 확실하게 표현하기 위해(애매하면 나중에 실수인 줄 알고 수정할 수도 있음)
								//음수 뿐 아니라 어떤 경우에도 확실하게 해주는게 좋음. ex> 2 + (4*8)
		System.out.println("n3 : " + n3);
	}
}
