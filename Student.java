package assesment;

public class Student {
    private String firstName;
    private String lastName;
    int[] scores;


    public Student(String firstName, String lastName, int[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    public String toString() {
        return this.firstName+this.lastName+ this.scores;
    }

    public double totalScores(int[] scores) {
        return(scores.length);
    }


    public String getFirstName() {
        return firstName;

    }
    public void setFirstName(){
        this.firstName = firstName;

    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public int[] getScores() {
        return scores;
    }
    public void setScores(){
        this.scores = scores;
    }

}
