package in.milndjadhavproject.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
@NoArgsConstructor
@Document(collection = "employee")
public class Employee {
	@Id
//	@Field(name = "employeeId")
	private String id;
	private String Name;
	private String Age;
	private String Dept;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Age=" + Age + ", Dept=" + Dept + "]";
	}

}
