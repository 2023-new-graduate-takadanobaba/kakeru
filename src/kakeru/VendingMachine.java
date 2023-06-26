package kakeru;

public class VendingMachine {
//	private boolean isButtonPushed;
	private int remainingAmount;
//	private String bucket;
//	
//	Map<String, Button> buttons;
//	public VendingM
//	achine() {
//		buttons = new HashMap<>();
//		buttons.put("コーラ" ,new Button(this, "コーラ"));
//		buttons.put("ウーロン茶", new Button(this, "ウーロン茶"));
//		
//	}
	


	public String pushedButton() {
		// TODO 自動生成されたメソッド・スタブ
		return "コーラ";
//		return null;
		
	}
	

	public boolean isButtonPushed() {
		// TODO 自動生成されたメソッド・スタブ
//		return this.isButtonPushed;
		return true;
	}


	public boolean insert100yen() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}


	public String pushedSecondButton() {
		// TODO 自動生成されたメソッド・スタブ
//		
		return "ウーロン茶";
	}



	public void insertCoin(int coin) {
		// TODO 自動生成されたメソッド・スタブ
		if(coin != 100) {
			throw new IllegalArgumentException("ボタンがありません");
		}
		this.remainingAmount = coin;
	}


	public int getRemainingAmount() {
		// TODO 自動生成されたメソッド・スタブ
		return remainingAmount;
	}
//	public String getBucket() {
//		return bucket;
//	}
//	
//	public Button getButton(String item) {
//		if(!buttons.containsKey(item)){
//			throw new IllegalArgumentException("ボタンがない");
//		}
//		return buttons.get(item);
//	}
//	public void setBuckets(String item) {
//		this.bucket = item;
//	}

}
