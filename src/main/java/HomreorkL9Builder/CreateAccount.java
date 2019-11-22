package HomreorkL9Builder;

public class CreateAccount {
    public static void main(String[] args) {
        CreateAccount createAccount = new CreateAccount.Builder().enterAddress("Ukraine").enterCity("Kyiv").enterFirstName("Anna").enterPassword(257569).build();
    }
    private String firstName;
    private String lastName;
    private String email;
    private int password;
    private String address;
    private String city;
    private int postalCode;
    private String mobilePhone;



    public static class Builder {
        private CreateAccount createAccount;

        public Builder() {
            createAccount = new CreateAccount();
        }

        public Builder enterFirstName(String firstName) {
            createAccount.firstName = firstName;
            return this;
        }

        public Builder enterLastName(String lastName) {
            createAccount.lastName = lastName;
            return this;
        }

        public Builder enterEmail(String email) {
            createAccount.email = email;
            return this;
        }

        public Builder enterPassword(int password) {
            createAccount.password = password;
            return this;
        }

        public Builder enterAddress(String address) {
            createAccount.address = address;
            return this;
        }

        public Builder enterCity(String city) {
            createAccount.city = city;
            return this;
        }

        public Builder enterPostalCode(int postalCode) {
            createAccount.postalCode = postalCode;
            return this;
        }

        public Builder enterMobilePhone(String mobilePhone) {
            createAccount.mobilePhone = mobilePhone;
            return this;
        }

        public CreateAccount build() {
            return createAccount;

        }
    }
}
