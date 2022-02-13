package com.dbs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Receiver")
public class Receiver {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
@Column(name="Ifsc")	
 String bic;
@Column(name="Institution_Name")
String iname;
public Receiver(String bic, String iname) {
	super();
	this.bic = bic;
	this.iname = iname;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Receiver() {
	super();
}
public String getBic() {
	return bic;
}
public void setBic(String bic) {
	this.bic = bic;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
@Override
public String toString() {
	return "Receiver [id=" + id + ",bic=" + bic + ", iname=" + iname + "]";
}

}
