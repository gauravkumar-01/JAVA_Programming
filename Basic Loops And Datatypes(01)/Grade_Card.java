public class Grade_Card {
    public static void main(String[] args) {
        int marks = 90;
        if (marks > 90){
            System.out.println("Grade 'O' ");
        }
        else if(marks > 80){
            System.out.println("Grade 'A+' ");
        }
        else if(marks > 70){
            System.out.println("Grade 'A' ");
        }
        else if(marks > 60){
            System.out.println("Grade 'B+' ");
        }
        else if(marks > 50){
            System.out.println("Grade 'B' ");
        }
        else if(marks > 40){
            System.out.println("Grade 'c' ");
        }
        else{
            System.out.println("Grade 'FAIL' ");
        }
    }
    
}
