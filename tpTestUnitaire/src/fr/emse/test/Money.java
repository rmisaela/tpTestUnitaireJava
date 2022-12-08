package fr.emse.test;

class Money {
	private int fAmount;
	private String fCurrency;

	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}

	public int amount() {
		return fAmount;
	}

	public String currency() {
		return fCurrency;
	}

	public Money add(Money m) {
		return new Money(amount() + m.amount(), currency());
	}
	
	public boolean equals(Money m) {
		if (m == null) return false;
		
        if (amount() == 0)  return m.amount() == 0;
        
        return m.currency().equals(currency()) && amount() == m.amount();
    }
}