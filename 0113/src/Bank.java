import java.util.ArrayList;
import java.util.Iterator;

import acc.Account;
import acc.SpecialAccount;

public class Bank {

	ArrayList<Account> accs = new ArrayList<>();
	int count = 0;
	
	void makeAccount(Account acc) {
		accs.add(acc);
	}
	
	void printAllAccount() {
		for(Account acc : accs) {
			System.out.println(acc.info());
		}
	}
	void printSpecialAccount(String grade) {
		Iterator<Account> it = accs.iterator();
		
		while(it.hasNext()) {
			Account acc = it.next();
			if(acc instanceof SpecialAccount) {
				System.out.println(acc.info());
			}
		}
		
	}
	void printAccount() {
		Iterator<Account> it2 = accs.iterator();
		while(it2.hasNext()) {
			Account acc = it2.next();
			if(!(acc instanceof SpecialAccount)) {
				System.out.println(acc.info());
			}
		}
	}
}
