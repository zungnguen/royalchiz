package initial;

import java.util.Vector;

public abstract class Appliance {
String name;
double watt;
float prob;
int iD; // 8 number figure
int aID;
boolean status;
public static int uID = 1;

public Appliance(int i, String n, double w, float p, boolean b)
{
	if((i >9999999)&&(i<100000000)) 
	{
	this.iD = i;
	}
	this.name = n;
	this.watt = w;
	this.prob = p;
	this.status = b;
	this.aID = Appliance.uID++;
}
public Appliance() {
	iD = 0;
	name = "";
	watt = 0;
	prob = 0.0F;
	status = false;
	this.aID = ++Appliance.uID;
}
public String getName() {
	return this.name;
}
public int getID() {
	return this.iD;
}
public double getWatt() {
	return this.watt;
}
public float getProb() {
	return this.prob;
}
public boolean getStatus() {
	return this.status;
}
public int getAID() {
	return this.aID;
}
public void getName(String s) {
	this.name = s;
}
public void setID(int id) {
	if((id >9999999)&&(id<100000000)) {
		this.iD = id;
		}
	else {
		System.out.println("Invalid ID");
	}
}
public void setProb(float pro) {
	this.prob = pro;
}
public void setWatt(double d) {
	this.watt = d;
}
	public abstract String ToString();	
	


}
