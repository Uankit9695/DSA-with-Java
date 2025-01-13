package function;

public class Grade {
    
    static void printGrade(int marks){
        if(marks <=100 && marks>90){
            System.out.println("AA");
        } else if (marks <=90 && marks>80) {
            System.out.println("AB");
        } else if (marks<=80 && marks>70) {
            System.out.println("BB");

        } else if (marks<=70 && marks>60) {
            System.out.println("BC");

        } else if (marks<=60 && marks>50) {
            System.out.println("CD");

        }else if (marks<=50 && marks>40) {
            System.out.println("DD");
        } else {
            System.out.println("fail");
        }
    }

    public static void main(String[] args) {
        printGrade(80);
    }
}
