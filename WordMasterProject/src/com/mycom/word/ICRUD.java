package com.mycom.word;

public interface ICRUD {
	public Object add(); //  data 추가 
	// 추가했을때 추가한 객체를 리턴하기 위해 obj 타입을 넣어줌 
	public int update(Object obj); // data 수정 
	// 업뎃할때는 어떤 데이터를 수정해야할지 파라미터로 주어짐 
	public int delete(Object obj); // data 삭제
	// 삭제할때도 어떤 데이터를 삭제해야할지 파라미터로 주어짐 
	public void selectOne(int id); // data 1개 조회 
	//해당 id 에 대해 데이터를 출력하도록 만들 생각. 
}
/* 위 인터페이스에 들어가게 되는 리턴 타입이나 파라미터는  
 * 작성하는 사람들이 원하는 템플릿 구성에 맞춰서 만들면 된다. 
 * 
 * */
 