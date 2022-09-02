package com.mycom.word;


//WordManager를 이용해서 프로그램을 실제로 구동함 
//WordManager 에서 전체 단어를 관리하는 기능을 메인에서 시작 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!! 안녕 ");
		//To be able to call start() from WordManager
		//create obj with keyword "new" 
		new WordManager().start();
	}

}

//프로젝트 관점에서 flow 정리 
/*
 * 자바에서 실행. 
 * 프로젝트 밑의 메인 클래스의 메인 함수가 호출됨 
 * 그 안(메인 함수)에서 워드 매니저의 스타트 함수를 호출하게 됨 
 * 워드 매니저 클래스의 스타트가 실행됨. => 출력으로 나옴 
 * */
 