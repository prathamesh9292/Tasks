package TaskNo2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


abstract class Staff{
    String name,address;
}

//    FullTimeStaff Class
class FullTimeStaff extends Staff{
    String department;
    double salary;
    public void input() throws IOException{
        System.out.println("Enter the name, address, department and salary: ");
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        address=sc.nextLine();
        department=sc.nextLine();
        salary=sc.nextDouble();
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
        System.out.println("----------------------");
    }
}

//    PartTimeStaff Class
class PartTimeStaff extends Staff{
    int hours, rate;
    public void input() throws IOException{
        System.out.println("Enter the name, address, No of working hours and rate per hour: ");
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();
        address=sc.nextLine();
        hours=sc.nextInt();
        rate= sc.nextInt();
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("No of Working Hours: "+hours);
        System.out.println("Rate per hour: "+rate);
        System.out.println("----------------------");
    }
}


public class Main{
    public static void main(String [] args) throws IOException{
        int i;
        System.out.println("Select Any One: ");
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        System.out.println("1.Full Time Staff");
        System.out.println("2.Part Time Satff");
        int ch= in.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter the number of Full Time Staff: ");
                int n= in.nextInt();
                FullTimeStaff [] FTStaff=new FullTimeStaff[n];
                for(i=0;i<n;i++){
                    FTStaff[i]=new FullTimeStaff();
                    FTStaff[i].input();
                }
                for(i=0;i<n;i++){
                    FTStaff[i].display();
                }
                break;

            case 2:
                System.out.println("Enter the number of Part Time Staff: ");
                int m= in.nextInt();
                PartTimeStaff [] PTStaff=new PartTimeStaff[m];
                for(i=0;i<m;i++){
                    PTStaff[i]=new PartTimeStaff();
                    PTStaff[i].input();
                }
                for(i=0;i<m;i++){
                    PTStaff[i].display();
                }
                break;

        }
    }
}