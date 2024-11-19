import java.util.*;
public class Student {
    public static void main(String[] args) {
    int n;
    double sum=0.0,average;
    System.out.println("enter the no of subject");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    System.out.println("enter "+(i+1)+"Subject");
    String s=sc.next();
    System.out.println("enter marks of "+s);
    arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    average=sum/n;
           String grade;
        if (average >= 90 && average <= 100) {
            grade = "A+ (Excellent)";
        } else if (average >= 80) {
            grade = "A (Very Good)";
        } else if (average >= 70) {
            grade = "B+ (Good)";
        } else if (average >= 60) {
            grade = "B (Above Average)";
        } else if (average >= 50) {
            grade = "C (Average)";
        } else if (average >= 40) {
            grade = "D (Pass)";
        } else {
            grade = "F (Fail)";
        }
        Main ob=new Main();
        ob.display(sum,average,grade);
}
void display(double sum,double average,String grade)
{
    System.out.println("Total marks obtained "+sum);
    System.out.println("Average percentage "+average);
    System.out.println("Grade is "+grade);
}
}

