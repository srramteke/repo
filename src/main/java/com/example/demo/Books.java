package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BooksTable")
public class Books {
    
	
	@Id
	@Column(name="BookID")
	@GeneratedValue
	private Integer BookID;
	
	@Column(name="BookName")
	private String BookName;
	
	@Column(name="BookPrice")
	private Integer BookPrice;
	
	public Integer getBookID() {
		return BookID;
	}
	public void setBookID(Integer bookID) {
		BookID = bookID;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public Integer getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		BookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Books [BookID=" + BookID + ", BookName=" + BookName + ", BookPrice=" + BookPrice + "]";
	}
	
}
