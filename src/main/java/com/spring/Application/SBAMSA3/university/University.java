package com.spring.Application.SBAMSA3.university;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MSA3Assignment")
public class University {
	
	
		
		public University()
		{
			super();
		}
		public University(int id, String name, int totcol)
		{
			super();
			this.id=id;
			this.name=name;
			this.totcol= totcol;
		}
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private int totcol;
		private String name;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getTotcol() {
			return totcol;
		}
		public void setTotcol(int totcol) {
			this.totcol = totcol;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String toString() 
		{
			return "Course[Id=" + id +", name=" + name +",TotalCollege=" +totcol +"]";
		} 

	}


