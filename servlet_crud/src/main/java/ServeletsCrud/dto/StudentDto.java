package ServeletsCrud.dto;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDto {
	@Id
	private int Std_id;
	private String Std_name;
	private long ph_no;
	private String Gender;
	public int getStd_id() {
		return Std_id;
	}
	public void setStd_id(int std_id) {
		Std_id = std_id;
	}
	public String getStd_name() {
		return Std_name;
	}
	public void setStd_name(String std_name) {
		Std_name = std_name;
	}
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
}
