package prob5;

public class Account {
	
	private String accountNo;
	private int balance;
	
	
	public Account(String string) {
		// TODO Auto-generated constructor stub
		accountNo = string;
		
		System.out.println(accountNo +" 계좌가 개설되었습니다.");
	}

	public String getAccountNo() {
		// TODO Auto-generated method stub
		return accountNo;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void save(int i) {
		balance+=i;
		System.out.println(accountNo +" 계좌에 "+i+"만원이 입금되었습니다.");
	}

	public void deposit(int i) {
		balance-=i;
		System.out.println(accountNo +" 계좌에 "+i+"만원이 출금되었습니다.");
		
	}
}