import java.util.Scanner;
/**
 *
 * created by Pratik
 */
public class onlineExamination {
    public static void main(String[] args) {
        int ch=4;
        int choice;
        String name;
        int id=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        name=sc.next();
        System.out.print("Enter your roll no:");
        id=sc.nextInt();
        int count=0;
        System.out.println("\t\tWelcome "+name+" to appear your online examination");

        do {
            System.out.println("1.Take Exam");
            System.out.println("2.View Marks");
            System.out.println("3.Exit");
            System.out.print("Enter your choice:");
            ch=sc.nextInt();
            switch(ch) {
                case 1:
                {
                    System.out.println("Select programming language:");
                    System.out.println("1.C \n2.Java \n3.C++");
                    System.out.println("Enter your choice:");
                    int sub=sc.nextInt();
                    System.out.println("There are 5 questions in the examination");
                    System.out.println("Each question consist of 4 option you have to choose the correct answer");
                    if(sub==2)
                    {
                        count=0;
                        System.out.println("Q.1.Java is developed by:");
                        System.out.println("1.James Gosling \n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.Java is:");
                        System.out.println("1.Middle Level\n2.Low Level\n3.High Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.Number of primitive data types in Java are:");
                        System.out.println("1.9\n2.6\n3.8\n4.5");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.4.Select the valid statement:");
                        System.out.println("1.char[] ch = new char(5)\n2.char[] ch = new char()\n3.char[] ch = new char[]\n4.char[] ch = new char[5]");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==4)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.When an array is passed to a method, what does the method receive:");
                        System.out.println("1.The reference of the array\n2.A copy of the array\n3.Length of the array\n4.All of these");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                    }
                    else if(sub==1)
                    {
                        count=0;
                        System.out.println("Q.1.C is developed by:");

                        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.C is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.How are String represented in memory in C:");
                        System.out.println("1.The object of some class\n2.An array of characters\n3.LinkedList of characters\n4.Same as other primitive data types");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.4.What is the disadvantage of arrays in C:");
                        System.out.println("1.The amount of memory to be allocated should be known beforehand\n2.Multiple other data structures can be implemented using arrays\n3.Elements are stored in contiguous memory blocks\n4.ELements of an array can be accessed in constant time");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.Which of the following is the proper syntax for declaring macros in C:");
                        System.out.println("1.#define ||\n2.#define long long\n3.#define || long long\n4.#define long long ||");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                    }
                    else
                    {
                        count=0;
                        System.out.println("Q.1.C++ is developed by:");

                        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.C++ is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.Identify the correct extension of the user-defined header file in C++:");
                        System.out.println("1..h\n2..cpp\n3..hg\n4..hf");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.4.C++ uses which approach:");
                        System.out.println("1.left-right\n2.bottom-up\n3.right-left\n4.top-down");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.Identify the correct syntax for declaring arrays in C++:");
                        System.out.println("1.array arr[10]\n2.array{10}\n3.int arr[10]\n4.int arr");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Congrats  "+name+"  You scored "+count+" marks "+"out of 5");
                    System.out.println("Thank you for taking exam");
                }
            }
        }
        while(true);
    }
}
