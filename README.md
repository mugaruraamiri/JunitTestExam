# Software Testing Techniques Final Exam 6th June, 2022

1. git clone ``` https://github.com/mugaruraamiri/JunitTestExam.git```
2. After downloading the project please update the project by righ clicking on the project then Maven update the project to download all dependancies
3. You will be working in test package in the following Files:

    ```sh
   1. TestEmployeeDetails.java
   2. TestSimpleMathOperation.java
   3. TestStringOperation.java
   4. TestSimpleMathOperations.java
   ```

4. Write test code in ``` TestEmployeeDetails.java ``` to test bellow two method implemented in ``` EmpBusinessLogic.java ```. the two method takes one argument ``` EmployeeDetails ``` Object as an argument

    ```sh
    
    // Calculate the yearly salary of employee
    public double calculateYearlySalary(EmployeeDetails employeeDetails) {
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }
    
    
    and
    
    // Calculate the appraisal amount of employee
    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraisal = 0;

        if(employeeDetails.getMonthlySalary() < 10000){
            appraisal = 500;
        }else{
            appraisal = 1000;
        }

        return appraisal;
    }
    
    ```
5. Write test code in ``` TestSimpleMathOperations.java ``` to test bellow two method implemented in ``` SimpleMathOperations.java ```

    ``` sh 
    
    //computing addition of two numbers
    public double add(double x, double y){
        return x + y;
    }
    
    and
    
    //Computing Squareroot of a given number
    public double SquareRoot(double x){
        return Math.sqrt(x);
    }
    ```
    
6.  Write test code in ``` TestStringOperation.java ``` to test bellow two method implemented in ``` StringOperation.java ```

    ```sh
    
    //Reverse a String
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    ```
    
7. Replace all TODO comments with your implementation code and run your tests 
8. All test should pass top get fill Marks

