package kakeru;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloTestCase {

//	@Test
//	void test() {
//		fail("まだ実装されていません");
//	}
	
	private VendingMachine sut;

	@BeforeEach
	public void setUp() {
	sut = new VendingMachine();
	
	}
	
	
	@Test
	public void ReturnCoke() {
		//Arrange
		//Act
		String item = sut.pushedButton();
		//Assert
		assertEquals("コーラ",item);
	}
	
	@Test
	public void ボタンを押したかどうか() {
		//Arrange
		//Act
//		Button button = sut.getButton("コーラ");
//		button.push();
		
		boolean pushButton = sut.isButtonPushed();
		
		
		//Assert
		assertEquals(true, pushButton);
	}
	
	
	
	@Test
	public void 百円入れたかどうか() {
		//Arrange
		//Act
		boolean insert100yen = sut.insert100yen();
		//Assert
		assertEquals(true,insert100yen);
	}
	
	@Test
	public void コーラが買えるかどうか() {
		//Arrange
		//Act
		String pushedButton = sut.pushedButton();
		//Assert
		assertEquals("コーラ", pushedButton);
	}
	
	@Test
	public void ウーロン茶が買えるかどうか() {
		//Arrange
		//Act
		String pushedSecondButton = sut.pushedSecondButton();
		//Assert
		assertEquals("ウーロン茶", pushedSecondButton);
	}
	
	@Test
	public void _100円コインを投入したかどうかわかる() {
		//Arrange
		sut.insertCoin(100);
		//Act
		int remainingAmount = sut.getRemainingAmount();
		//Assert
		assertEquals(100, remainingAmount);
	}
	
//	@Test
//	public void _100円入れてボタンを押すとコーラが出る() {
//		//Arrange
//		sut.insertCoin(100);
//		//Act
//		sut.getButton("コーラ").push();
//		//Assert
//		assertEquals("コーラ",sut.getBucket());
//		
//	}
	

}
