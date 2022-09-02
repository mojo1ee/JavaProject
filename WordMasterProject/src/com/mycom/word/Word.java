package com.mycom.word;

/*  data class 
 *  class in order for us to handle data
 *  단어를  다루기 위해 필요한 멤버 변수를 구성하면 될것.
 * */

public class Word {
	private int id; // private으로 멤버 변수 직접 접근 제한
	private int level;
	private String word;
	private String meaning;
	
	// data class 만들때 필요에 따라 생성자 만듦. 
	Word(){}
	
	Word(int id, int level, String word, String meaning){
		this.id = id;
		this.level = level;
		this.word = word;
		this.meaning = meaning;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		// level 숫자로 되어있음 => 반복문 사용해서 만들어주기 
		String slevel = "";
		for(int i = 0 ;  i< level ; i++) slevel += "*";
		
		//영어단어 (포맷 오른쪽 정렬) 
		String str = String.format("%-3s", slevel)
				+ String.format("%15s", word) + " " + meaning;
		
		return str;
	}
	
	

}
//private => can access from the same class and not others 
// ==> need to establish getter and setter 
