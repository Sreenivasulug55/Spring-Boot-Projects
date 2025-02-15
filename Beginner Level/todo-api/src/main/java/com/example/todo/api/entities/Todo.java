package com.example.todo.api.entities;

import jakarta.persistence.Entity; 
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Todo {
    @Id
    private long id;
    private String discription;
    private LocalDate dueDate;
    private boolean status;
    private String priority;


    public Todo() {
    }

   

    public Todo(long id, String discription, LocalDate dueDate, boolean status, String priority) {
		super();
		this.id = id;
		this.discription = discription;
		this.dueDate = dueDate;
		this.status = status;
		this.priority = priority;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getDiscription() {
		return discription;
	}



	public void setDiscription(String discription) {
		this.discription = discription;
	}



	public LocalDate getDueDate() {
		return dueDate;
	}



	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public String getPriority() {
		return priority;
	}



	public void setPriority(String priority) {
		this.priority = priority;
	}



	@Override
    public String toString() {
        return "Todo{" +
                "discription='" + discription + '\'' +
                ", dueDate=" + dueDate +
                ", status=" + status +
                ", priority='" + priority + '\'' +
                ", id=" + id +
                '}';
    }
}
