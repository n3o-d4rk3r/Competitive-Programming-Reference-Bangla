#include <stdio.h>

 /* 
 Author: Aryan Kabir
 Id    : UG02-53-20-001
 
 Step by Step:
 
    Include the required headers in the answer program.
    Declare the main function in the program.
    Declare variables of appropriate datatypes.
    Prompt the user to enter the desired CGPA.
    Accept the input and store it in a variable.
    Prompt the user to enter the total number of courses.
    Accept the input and store it in a variable.
    Prompt the user to enter the credit per course.
    Accept the input and store it in a variable.
    Calculate the total credits.
    Calculate the grade point by multiplying CGPA with total credits.
    Display the output to the user.
 */ 
  

int main()
{
    float grade_point=0.0f ;
    int number_of_courses;
    int credits;
    int total_credits;
    float cgpa=0.0f;
    printf("Enter the Required CGPA:");
    scanf("%f", &cgpa); 
    printf("Enter the Total Number of Courses:");
    scanf("%d", &number_of_courses); 
    printf("Enter the Credit Per Course:");
 
    scanf("%d", &credits); 
    total_credits = number_of_courses*credits;
    printf("Total Credits = %d\n", total_credits);
    grade_point = cgpa*total_credits;
    printf("Desired Grade Point = %f", grade_point);
  

    return 0;
}
