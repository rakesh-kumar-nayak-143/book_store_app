package com.rakesh.request;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Books {

	private List<Book> booklist;

	/**
	 * @return the booklist
	 */
	public List<Book> getBooklist() {
		return booklist;
	}

	/**
	 * @param booklist the booklist to set
	 */
	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	
}
