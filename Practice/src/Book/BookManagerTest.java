package Book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {

	private BookManager bookManager;

	@BeforeEach
	public void setUp() {
		bookManager = new BookManager();
		System.out.println("새로운 BookManager 인스턴스가 생성되어 테스트를 준비합니다.");
	}

	@Test
	public void testAddBook_oneBookRegister() {
		int resultCount = bookManager.addBook("이펙티브 자바");

		assertEquals(1, resultCount, "첫 번째 도서 등록 후 총 권수는 1권이어야 합니다.");

		// 일부러 2로 변경 (실패 유도)
		// assertEquals(2, resultCount, "첫 번째 도서 등록 후 총 권수는 1권이어야 합니다.");
	}
}
