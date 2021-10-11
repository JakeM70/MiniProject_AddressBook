package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This Class defines the AddressBook object
 * It is annotated to persist to database.  
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Oct 5, 2021
 */
@Entity
@Table(name="entry")
public class AddressBook {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Phone Number")
	private String number;
	@Column(name="Birthday")
	LocalDate bday;
	
	/**
	 * Default no-arg constructor
	 */
	public AddressBook() {
		
	}
	
	/**
	 * Constructor with two params
	 * @param name attribute to be set within	
	 * @param number phone number to be set within
	 */
	public AddressBook(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	/**
	 * Constructor with all attribute params
	 * @param name String name attribute to be set within
	 * @param number String phone number to be set within
	 * @param bday LocalDate attribute to be set within
	 */
	public AddressBook(String name, String number, LocalDate bday) {
		this.name = name;
		this.number = number;
		this.bday = bday;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the bday
	 */
	public LocalDate getBday() {
		return bday;
	}

	/**
	 * @param bday the bday to set
	 */
	public void setBday(LocalDate bday) {
		this.bday = bday;
	}

	@Override
	public String toString() {
		return "AddressBook [name=" + name + ", number=" + number + ", bday=" + bday + "]";
	}
	
	
}
