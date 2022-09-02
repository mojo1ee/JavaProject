package com.mycom.word;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
	
	//동적 데이터 관리를 위해 arrayList를  추가해준다. 
	ArrayList<Word> list; // 다루고자하는 데이터 타입은 word 가 됨 (from word class which is a data class) 
	Scanner s; //= new Scanner(System.in);
	
	
	//ArrayList의 새로운 배열은 생성자 WordCrud 만들때 객체화 함. 
	WordCRUD(Scanner s){
		list = new ArrayList<>();
		this.s = s;
	}
	
	//가져온 각각의 함수를 어떤 기능을 할지 구현해주면 되는 것. 

	 
	@Override
	public Object add() {
		//  사용자에게 입력 받는 부분 구현.
		System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
		int level = s.nextInt();
		String word = s.nextLine(); // 그냥 next로 하면 엔터가 다음 입력버퍼에 들어가버려서 프로그램 제대로 작동 안함. 
		
		System.out.print("뜻 입력 : ");
		String meaning = s.nextLine(); //공백 포함해야하므로 nextLine() 
		
		//받은 내용을 word 클래스를 만들어서 객체로 리턴하게 됨. 
		return new Word(0, level, word, meaning);
	}
	
	//받은 add 단어를 list 에 추가하는 function. 
	//Function to call from the WordManager Class 
	public void addWord() {
		Word one = (Word)add();  // need to cast return type(Obj) into (Word) type.
		list.add(one);
		System.out.println("새 단어가 단어장에 추가되었습니다. ");
	}
	//완성된 addWord 함수를 WordManager Class 에서 호출. 

	@Override
	public int update(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectOne(int id) {
		// TODO Auto-generated method stub
		
	}
	
	// wordMangager 에도 추가해서 호출하게끔 해야함. 
	public void listAll() {
		System.out.println("-------------------------------");
		for(int i = 0; i < list.size(); i++) {
			System.out.print((i+1) + " ");
			System.out.println(list.get(i).toString());
		}
		System.out.println("-------------------------------");
	}
	

}
