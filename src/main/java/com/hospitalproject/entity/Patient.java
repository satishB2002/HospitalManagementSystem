package com.hospitalproject.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="data")
public class Patient {
	public Patient() {
		super();
	}
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PatientId;
    private String FirstName;
    private String LastName;
    private int Age;
    private String Gender;
    private String BloodGroup;
    private String City;
    private String State;
	private int ContactNo;
	public int getPatientId() {
		return PatientId;
	}
public void setPatientId(int patientId) {
		PatientId = patientId;
}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Patient(int patientId, String firstName, String lastName, int age, String gender, String bloodGroup,
			String city, String state, int contactNo) {
		super();
		PatientId = patientId;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		Gender = gender;
		BloodGroup = bloodGroup;
		City = city;
		State = state;
		ContactNo = contactNo;
	}
	public int getContactNo() {
		return ContactNo;
	}
	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}
	
}