package operatorPkg;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
        System.out.println("42423");
System.out.println("prabhu");
int a=10;
int b=2;
int c;
System.out.println("a*b:"+a*b);

if(a>b) System.out.println("a is greater than b");

if(a>b){
    System.out.println("a is greater than b");
}
else
{
       System.out.println("a is lesser than b");
 
}
c=a*b;
System.out.println("a,b,c:"+a+":"+b+":"+c);
int i;
for(i=0;i<=5;i++)
System.out.println("i:"+i);

    switch(a)
    {
    case 1:
    System.out.println("a is 1");
    case 2:
    System.out.println("a is 2");
    default:
    System.out.println("a is others");
    }
System.out.println("=========================================");

		String	streetAddress = "";
		//String	streetAddress = "Dubai";
		String	customerEmailAddress = "asprabhueee@gmail.com";
		
		String line1=
				((streetAddress==null||streetAddress=="")? customerEmailAddress :  customerEmailAddress + " - " +  streetAddress);
	    
		System.out.println(line1);
		
		String	mailingAddress = "mailingAddress     ";
		String	bulidingName = "bulidingName";
		String	villaOrFlatBuildingNumber = "villaOrFlatBuildingNumber";
		String	nearestLandmark = "nearestLandmark";
		
		String line3=(mailingAddress.trim()+ " - " + bulidingName+ " - " +villaOrFlatBuildingNumber+ " - "+nearestLandmark);
		System.out.println(line3);
		
		//String	shipments_Contacts_CompanyName = "shipments_Contacts_CompanyName";
		String	shipments_Contacts_CompanyName="";
		String	department = "department";		
		String companyName=(shipments_Contacts_CompanyName==null||shipments_Contacts_CompanyName=="")? shipments_Contacts_CompanyName: department;
	    
		System.out.println(companyName);
		
		String	departmentName = "departmentName";
		String	shipments_Contacts_Department = "shipments_Contacts_Department";
		String department2 = "";
	    if (departmentName!=null||departmentName!="") {
	       department2 = departmentName; 
	    } else {
	        department2 = shipments_Contacts_Department;
	    }
		System.out.println(department2);
System.out.println("=========================================");
	    
		String dueDate="/Date(" + new Date().getTime() + "-0500)/";
		System.out.println(dueDate);
	    

	}

}
