// Develop a small java application,
// which accepts employee id from the command prompt and displays the details using array


public class employeee{
	static int emp_no;
	 int ba;
	 int hr;
	int it;
	 int da;
	 double salary=0;
	 static String name,join,dep,desig;
	  char code;
	employeee(int i){             //contructor accepting one variable
		
		String[] emp_name= {"Abc","Opqr","Ghi","Wxyz","Jklmn","Stuv","Def"};
		String[] join_date={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/02/2000","12/06/2006"};
		char[] des_code= {'E','C','K','R','M','E','C'};
		String[] dept= {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int[] basic= {20000,30000,10000,12000,50000,23000,29000};
		int[] HRA= {8000,12000,8000,6000,20000,9000,12000};
		int[] It= {3000,9000,1000,2000,20000,4400,10000};
		//int emp_no=empno[i];
		 join=join_date[i];
		 name=emp_name[i];
		 code=des_code[i];
		dep=dept[i];
		 ba=basic[i];
		 hr=HRA[i];
		 it=It[i];
		designation(code);
		}
	void designation(char code) {
		int[] da1= {20000,32000,12000,15000,40000};
		String[] designation= {"Engineer","consultant","clerck","reciptionist","manager"};
		 switch(code) {
		 case 'E': desig=designation[0];
		 			da=da1[0];
		 			break;
		 case 'C': desig=designation[1];
			da=da1[1];
			break;
			
		 case 'K': desig=designation[2];
			da=da1[2];
			break;
			
		 case 'R': desig=designation[3];
			da=da1[3];
			break;
			
		 case 'M': desig=designation[4];
			da=da1[4];
			break;
		 }
	}
	
	void calculate() {
		salary=ba+hr+da-it;
		}
		
	void print_details(){
		calculate();
		System.out.println("emp_id  : "+emp_no+"  emp_name :"+name+ "  dapartment :"+dep+"   designation: "+desig+"  salary: "+salary);
		
		
	
		
	}
		
	public static void main(String[] args){
		
		int k,i=-1;
		int empno[]= {1001,1002,1003,1004,1005,1006,1007};
		int key=Integer.parseInt(args[0]);
		for(k=0;k<7;k++) {
			if(empno[k]==key) {
				i=k;
				emp_no=empno[i];}
				
			
			}
			if(i==-1) {
				System.out.println("employee with employee id  "+key+"  doesnt exists");
			}
			else {
				
			
		employeee emp=new employeee(i);
		emp.print_details();
		}
	}		
		
		
		
		
}