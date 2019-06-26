import javax.annotation.Generated;



@SuppressWarnings("unused")
public class DemoLombak {
	

	private String empId;
	 private String firstName;
	 private String lastname;
	 private String dob;
	 private String phoneNo;

	private DemoLombak(Builder builder) {
		this.empId = builder.empId;
		this.firstName = builder.firstName;
		this.lastname = builder.lastname;
		this.dob = builder.dob;
		this.phoneNo = builder.phoneNo;
	}
	
	 public static void main(String[] args) {
		 DemoLombak demo = new DemoLombak.Builder().build();
		 System.out.println("String:"+demo.toString());
		 
	}

	/**
	 * Creates builder to build {@link DemoLombak}.
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return "DemoLombak [empId=" + empId + ", firstName=" + firstName + ", lastname=" + lastname + ", dob=" + dob
				+ ", phoneNo=" + phoneNo + "]";
	}

	/**
	 * Builder to build {@link DemoLombak}.
	 */
	public static final class Builder {
		private String empId;
		private String firstName;
		private String lastname;
		private String dob;
		private String phoneNo;

		private Builder() {
		}

		public Builder withEmpId(String empId) {
			this.empId = empId;
			return this;
		}

		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder withLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public Builder withDob(String string) {
			this.dob = string;
			return this;
		}

		public Builder withPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
			return this;
		}

		public DemoLombak build() {
			return new DemoLombak(this);
		}
	}
	 
}
