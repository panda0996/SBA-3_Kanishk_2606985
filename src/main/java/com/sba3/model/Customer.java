package com.sba3.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="customers")
public class Customer {
	

			@Id
			private long id;
			private String name;
			private String joining;
			private String city;
			private String contact;
			
			

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getJoining() {
				return joining;
			}

			public void setJoining(String joining) {
				this.joining = joining;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getContact() {
				return contact;
			}

			public void setContact(String contact) {
				this.contact = contact;
			}

				

}
