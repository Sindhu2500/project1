package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studentdto {
	@Id
	private int sid;
	private String sname;
	private String smail;
	private long sphno;
	private String gender;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSmail() {
		return smail;
	}

	public void setSmail(String smail) {
		this.smail = smail;
	}

	public long getSphno() {
		return sphno;
	}

	public void setSphno(long sphno) {
		this.sphno = sphno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Studentdto [sid=" + sid + ", sname=" + sname + ", smail=" + smail + ", sphno=" + sphno + ", gender="
				+ gender + "]";
	}
}
