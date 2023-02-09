public class User {

    private String username;
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) { 
        // this.age = age;
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getUsername() {
         return this.username;
       
    }

    public void setUsername(String username) {
        // this.username = username;
        if(username == null || username.isBlank()){
            throw new IllegalArgumentException("A username must be provided. ");
        }
        this.username = username;
    }


}
