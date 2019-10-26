/**
 * @(#)LeavingCertCalc.java
 * This program uses a while loop to take in 7 grades off two students,
 * and calculates the points total, average, and the highest and lowest grade of the two
 * and who had the higher of the two points totals
 * @author Kevin Donovan
 * @version 1.3 2014/11/5
 */

import java.util.Scanner;//java lib needed for inputting
public class LeavingCertCalc {// start of class

	public static void main(String args[]) {

		Scanner input1 = new Scanner(System.in); //These are scanners
		Scanner input2 = new Scanner(System.in); //needed for inputing

		//declare varibles
        int grade1=0, grade2=0, points1=0, points2=0;
        int average1=0, highest1=0, lowest1 = 101, total1 = 0;
        int average2=0, highest2=0, lowest2 = 101, total2 = 0;
    	String name1;
    	String name2;

    	//This takes user input, in this case a name
    	System.out.println("Welcome to the Leaving Cert Points Calculator! ");
    	System.out.println("");
      	System.out.print("Please Enter Student Name 1: ");
		name1 = input1.nextLine();

        //This uses the given input and responds with a welcome message
    	System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    	System.out.println("Welcome " + name1 +", Please Enter your Grades Below ");
    	System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n");

        //while loop to take user input
        int i=1;
		//start of while loop
        while(i<=7){

        	//take user input, in this case a grade in the form of a number
        	System.out.print( "Please Enter Grade " +i+ ": " );
        	grade1=input1.nextInt();


        	//check grades
    		if (grade1>=90){
    			points1=100;
    			System.out.println(" You got an A1, Which is worth: "+points1+" points");

    		}
    		else if (grade1>=85){
    			points1=90;
    			System.out.println("You got an A2, Which is worth: "+points1+" points");

    		}
    		else if (grade1>=80){
    			points1=85;
    			System.out.println("You got a B1, Which is worth: "+points1+" points");

    		}
    		else if (grade1>=75){
    			points1=80;
    			System.out.println("You got a B2, Which is worth: "+points1+" points");
    		}
    		else if (grade1>=70){
    			points1=75;
    			System.out.println("You got a B3, which is worth: "+points1+" points");

    		}
    		else if (grade1>=65){
    			points1=70;
    			System.out.println("You got a C1, Which is worth: "+points1+" points");

    		}
    		else if (grade1>=60){
    			points1=65;
    			System.out.println("You got a C2, Which is worth:"+points1+" points");

    		}
    		else if (grade1>=55){
    			points1=60;
    			System.out.println("You got a C3, Which is worth: "+points1+" points");

    		}
    		else if (grade1>=50){
    			points1=55;
    			System.out.println("You got a D1, Which is worth: "+points1+" points");

    		}
    		else if (grade1>=45){
    			points1=50;
    			System.out.println("You got a D2, Which is worth: "+points1+" points");

    		}
    		else if (grade1>=40){
    			points1=45;
    			System.out.println("You got a D3, Which is worth: "+points1+" points");

    		}
    		else if (grade1>=30){
    			points1=0;
    			System.out.println("You got an E, Which is sadly worth: "+points1+" points");

    		}
    			else if (grade1>=25){
    			points1=0;
    			System.out.println("You got an F, Which is sadly worth: "+points1+" points");

    		}
    		else if (grade1>=20){
    			points1=0;
    			System.out.println("You got an NG, Which is sadly worth: "+points1+" points");

    		}
    		else if (grade1>=0){
    			points1=0;
    			System.out.println("You got an NG, Which is sadly worth: " +points1+" points");

    		}


			//Here we do the maths and calculate the highest/lowest points and the total for Student 2
        	//calc highest
        	if(highest1<points1){
        		highest1=points1;
        	}//end if

        	//calc lowest grade
        	if(lowest1>points1){
        		lowest1=points1;
        	}// end if

        	//calc the points total for Student 1
    		total1=total1+points1;
    		i++;


        }//end of while loop

		//Calculate the average points scored by Student 1
		total1=total1-lowest1;
        average1=total1/6;


		//Now that we have student one out of the way, We now take for Student 2
   		//This takes user input second time, in this case a name
      	System.out.println("");//this line spaces things out nicely
      	System.out.println("");
      	System.out.print("Please Enter Student Name 2: ");
		name2 = input2.nextLine();

        //This uses the given input and responds with a welcome message
    	System.out.println("\n+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    	System.out.println("Welcome, You entered: " + name2 );
    	System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\n");

	       //prompt the user for the grade 2
	       	int j;

	        for (j=1; j<=7; j++){//start of for loop
	        	System.out.print( "Please Enter Grade " +j+ ": " );
	        	grade2=input2.nextInt();

	        //check grades
    		if (grade2>=90){
    			points2=100;
    			System.out.println("You got an A1, Which is worth: "+points2+" points");

    		}
    		else if (grade2>=85){
    			points2=90;
    			System.out.println("You got an A2, Which is worth: "+points2+" points");
    		}
    		else if (grade2>=80){
    			points2=85;
    			System.out.println("You got a B1, Which is worth: "+points2+" points");
    		}
    		else if (grade2>=75){
    			points2=80;
    			System.out.println("You got a B2, Which is worth: "+points2+" points");
    		}
    		else if (grade2>=70){
    			points2=75;
    			System.out.println("You got a B3, which is worth: "+points2+" points");
    		}
    		else if (grade2>=65){
    			points2=70;
    			System.out.println("You got a C1, Which is worth: "+points2+" points");
    		}
    		else if (grade2>=60){
    			points2=65;
    			System.out.println("You got a C2, Which is worth: "+points2+" points");
    		}
    		else if (grade2>=55){
    			points2=60;
    			System.out.println("You got a C3, Which is worth: "+points2+" points");
    		}
    		else if (grade2>=50){
    			points2=55;
    			System.out.println("You got a D1, Which is worth: "+points2+" points");
    		}
    		else if (grade2>=45){
    			points2=50;
    			System.out.println("You got a D2, Which is worth: "+points2+" points");
    		}
    		else if (grade2>=40){
    			points2=45;
    			System.out.println("You got a D3, Which is worth: "+points2+" points");
    		}
    		else if (grade2>=30){
    			points2=0;
    			System.out.println("You got an E, Which is sadly worth: "+points2+" points");
    		}
    		else if (grade2>=25){
    			points2=0;
    			System.out.println("You got an F, Which is sadly worth: "+points2+" points");
    		}
    		else if (grade2>=20){
    			points2=0;
    			System.out.println("You got an NG, Which is sadly worth: "+points2+" points");
    		}
    		else if (grade2>=0){
    			points2=0;
    			System.out.println("You got an NG, Which is sadly worth: " +points2+" points");
    		}

			//Here we do the maths and calculate the highest/lowest points and the total for Student 2
        	//calc highest
        	if(highest2<points2){
        		highest2=points2;
        	}//end if

        	//calc lowest grade
        	if(lowest2>points2){
        		lowest2=points2;
        	}// end if

        	//calc the points total for Student 2
    		total2=total2+points2;


	        } //end of for

	        //Calculate the average points scored by Student 2
			total2=total2-lowest2;
		    average2=total2/6;


			//final printouts for both Students
			//the word result
    		System.out.println("");
	    	System.out.println("");
	    	System.out.println(" ******    *********  **********  **     **   **      **********  ********** ");
	    	System.out.println(" **   **   *********  **********  **     **   **      **********  ********** ");
	    	System.out.println(" **    **  **         **          **     **   **          **      **         ");
	    	System.out.println(" **   **   *****      **********  **     **   **          **      ********** ");
	    	System.out.println(" ******    *****      **********  **     **   **          **      ********** ");
	    	System.out.println(" **  **    **                 **  **     **   **          **              ** ");
	    	System.out.println(" **   **   *********  **********  *********   *********   **      ********** ");
	    	System.out.println(" **    **  *********  **********   *******    *********   **      ********** ");
	    	System.out.println("");

	        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	   	    System.out.println( "The Points total for Student 1: "+name1+" is " + total1);
	   	    System.out.println( "The average points "+name1+" got was: " + average1);
	   	    System.out.println( "The highest points was : " +highest1);
	   	    System.out.println( "The lowest was : " +lowest1);
	   	    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

	   	    System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	   	    System.out.println( "The Points total for Student 2: "+name2+" is " + total2);
	   	    System.out.println( "The average points "+name2+" got was: " + average2);
	   	    System.out.println( "The highest points was : " +highest2);
	   	    System.out.println( "The lowest was : " +lowest2);
	   	    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");


	   	    //start of if
	   	    if(total1 > total2){
	    		System.out.println(name1 + " scored the highest total points, with a total of "+ total1 +" points.");
	    	}
	    	//end if

	    	//start of else
	    	else if(total1<total2){
	    		System.out.println(name2 + " scored the highest total points, with a total of "+ total2 +" points.");
	    	}
	    	//end of else

	    	//start of mini else
	    	else{
	    		System.out.println(name1 + " and " + name2 + " have the same total points.");
	    	}//end of else


	}//end of main

}// end of class