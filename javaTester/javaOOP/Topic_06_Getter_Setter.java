package javaOOP;

public class Topic_06_Getter_Setter {
	private String personName;
	private int personAge;
	private int personPhone;
	private float personBanlAccountAmount;

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		if (personAge > 15 && personAge < 60) {
			throw new IllegalArgumentException("Ten ban nhap vao khong hop le");
		} else {
			this.personAge = personAge;
		}
	}

	public int getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(int personPhone) {
		if (!String.valueOf(personPhone).startsWith("0")) {
			throw new IllegalArgumentException("So dien thoai bat dau bang :09 - 03- 012 - 016 - 018 -019");

		} else if (personPhone < 10 || personPhone > 11) {
			throw new IllegalArgumentException("So dien thoai phai tu 10-11");
		} else {
			this.personPhone = personPhone;
		}
	}

	public float getPersonBanlAccountAmount() {
		return personBanlAccountAmount;
	}

	public void setPersonBanlAccountAmount(float personBanlAccountAmount) {
		if (personBanlAccountAmount < 0) {
			throw new IllegalArgumentException("So tien khong duoc am");

		} else {
			this.personBanlAccountAmount = personBanlAccountAmount;
		}
	}

	public void setPersonName(String personName) {
		if (personName == null || personName.isEmpty() || personName.isBlank()) {
			throw new IllegalArgumentException("Ten ban nhap vao khong hop le");
		} else {
			this.personName = personName;
		}
	}

	public String getPersonName() {
		return this.personName;
	}

	public void showPersonInfo() {
		System.out.println(this.personName);
		System.out.println(this.personAge);
		System.out.println(this.personPhone);
	}
}
