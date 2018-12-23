package pk;

public class CarteTransfer extends Carte{
	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public CarteTransfer(String value) {
		this.value = value;
	}
}
