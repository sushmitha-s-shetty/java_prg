package day4;

import java.io.Serializable;

import  javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Freelancer2  implements Serializable,Comparable{

	


	private String name,skill;
	private Integer exp,id;
	@Overide
	public int compareTo(Freelancer2 a)
	{
		return this.paycompareTo(a.pay);
	}
	
	public Freelancer2()
	{}
	public Freelancer2(String alpha,String beta, Integer cosmo, Integer gama)
	{
	name=alpha;
	skill=beta;
	exp=cosmo;
	id=gama;

	}
	public String toString()
	{
	return name+ " "+skill+" "+exp+" "+id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getSkill() {
	return skill;
	}
	public void setSkill(String skill) {
	this.skill = skill;
	}
	@XmlAttribute
	public Integer getExp() {
	return exp;
	}
	public void setExp(Integer exp) {
	this.exp = exp;
	}
	@XmlElement
	public Integer getId() {
	return id;
	}
	public void setId(Integer id) {
	this.id = id;
	}
	public static void main(String[] args) {


	}

	
	}


