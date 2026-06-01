package Book;

import java.util.ArrayList;

public class BookManager {

	private ArrayList<String> books = new ArrayList<>();

	// 도서를 추가하고, 현재 총 도서 수를 반환하는 메서드
	public int addBook(String title) {
		if (title == null || title.isEmpty()) {
			return books.size();
		}
		books.add(title);
		return books.size();
	}

	public static void main(String[] args) {
		System.out.println("도서 관리 프로그램이 실행되었습니다.");
	}

	public void removeBook(String title) {
		return ;
	}

}
