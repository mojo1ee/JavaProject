package com.mycom.word;
import java.util.Scanner;


//word CRUD 를 이용해서 CRUD 기능을 구현하는 전체적인 관리 역할을 하게 됨 
public class WordManager {
	//해당 클래스의 멤버 변수로 스캐너를 하나 저장한다. (사용위해서) 
	Scanner s = new Scanner(System.in);
	WordCRUD wordCRUD;
	// addWord 가 WordCRUD에 있기 때문에 멤버변수에 추가해주고 생성자에넣어준다. 
	
	WordManager(){
		wordCRUD = new WordCRUD(s); // wordCRUD 의 생성자는 스캐너를 입력파라미터로 받으므
	}
	
	
	// selectMenu를 start (시작점) 내부로 이동 
	public int selectMenu(){
		System.out.print("*** 영단어 마스터 ***\n"
				+ "********************\n"
				+ "1. 모든 단어 보기\n"
				+ "2. 수준별 단어 보기\n"
				+ "3. 단어 검색\n"
				+ "4. 단어 추가\n"
				+ "5. 단어 수정\n"
				+ "6. 단어 삭제\n"
				+ "7. 파일 저장\n"
				+ "0. 나가기\n"
				+ "********************\n"
				+ "==> 원하는 메뉴는? "
			);
		return s.nextInt();
		
	}
	
	//does the function of main in this class (Starting Point) 
	public void start() {
		while(true) { //0번이 나올떄 까지 반복을 위해 while 조건. 
			int menu = selectMenu();
			if (menu == 0) break;
			if (menu == 1) {
				// show list
				wordCRUD.listAll();
			}
			if (menu == 4) {
				// create
				wordCRUD.addWord(); //WordCRUD 에 있음. 
			}
			
		}
	}

}
