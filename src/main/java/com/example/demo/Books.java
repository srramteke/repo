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
	@Column(name="BookId")
	@GeneratedValue
	private Integer BookId;
	
	@Column(name="BookName")
	private String BookName;
	
	@Column(name="BookPrice")
	private Integer BookPrice;
	
	public Integer getBookId() {
		return BookId;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
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
		return "Books [BookId=" + BookId + ", BookName=" + BookName + ", BookPrice=" + BookPrice + "]";
	}
	
}