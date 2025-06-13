package week1.day3;
public class LearnArray {
	public static void  main(String[] args) {
		// literals way of initializing the array
		// type arrayName[] ;---> Declared the array
		// arrayName[] = {value1,value2,value3,value4}; --> literal way of Initializing the array 
        int [] employeeId  = {125,786,438,910};
        int lengthOfEmployeeId = employeeId.length;
        // length - will always starts from 1
        // index - will always starts from 0
        System.out.println("Total employee in the company is "+ lengthOfEmployeeId);
        // arrayName[index]
        System.out.println(employeeId [2]);
        System.out.println(employeeId [lengthOfEmployeeId-1]);
        // Condition is to retrieve all the data present inside the array
        //                       3<4
        System.out.println("Execution with the jump statement");
        for (int i = 0; i < employeeId.length; i++) {
        	if (i==1) {	
        		continue;
			}
        	else {
        		System.out.println(employeeId[i]);	
			}	
		}
        
     // type arrayName[] ;---> Declared the array, Instantiation way of Initializing the array
        System.out.println("Instantiation way of Initializing the array");
        String employeeName[] = new String[4];
        employeeName[3]="Bhuvanesh";
        employeeName[1]="Muthu";
        employeeName[2]="Anbu";
        employeeName[0]="Harrish"; 
        employeeName[3]="Vineeth";
        for (int i = 0; i < employeeName.length; i++) {
			System.out.println(employeeName[i]);
		}
	}

}
