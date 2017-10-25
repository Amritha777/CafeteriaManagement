/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.*;
class staff_arr
{
    ArrayList<chef> chef_arr;
    ArrayList<servicemen> service_arr;
}

abstract class staff {
   int s_id;
   String s_name;
   long s_adhaar;
   public enum gender{Male,Female,Others}
   gender gen;
   String saddress;
   String scontact;
   String date_of_join; // change to date
   public enum exp{beginner,intermediate,expert}
   public enum job{Cleaning,Security,Serving,Cust_care}
   abstract void get_staff();
   abstract void display_staff();
}

class chef extends staff
{
    exp experience;
    void get_staff(){
       Scanner scn= new Scanner(System.in); 
       System.out.println("Enter the staff details:");
       System.out.println("Name : ");
       this.s_name=scn.next();
       System.out.println("Id:");
       this.s_id=scn.nextInt();
       System.out.println("Adhaar:");
       this.s_adhaar=scn.nextInt();
       System.out.println("Address : ");
       this.saddress=scn.next();
       System.out.println("Phone no : ");
       this.scontact=scn.next(); 
       System.out.println("Gender(1->Male 2->Female 3->Others)");
        int ch;
        ch=scn.nextInt();
        switch(ch)
        {
            case 1: gen=gen.Male;break;
            case 2 : gen=gen.Female; break;
            case 3 :gen=gen.Others; break;
        }
       System.out.println("Enter the experience(1->Beginner 2->intermediate 3-> expert)");
        ch=scn.nextInt();
        switch(ch)
        {
            case 1: experience=experience.beginner;break;
            case 2 : experience=experience.intermediate; break;
            case 3 :experience=experience.expert; break;
        }
       System.out.println("Date of Joining : ");
       this.date_of_join=scn.next(); 
       scn.close();
    }
    public void display_staff(){
        System.out.println("The staff details are");
        System.out.println("Staff id no: ");
        System.out.print(this.s_id);
        System.out.println("Name: ");
        System.out.print(this.s_name);
        System.out.println("Adhaar: ");
        System.out.print(this.s_adhaar);
        System.out.println("Gender: ");
        System.out.print(this.gen);
        System.out.println("Address: ");
        System.out.print(this.saddress);
        System.out.println("Experience: ");
        System.out.print(this.experience);
        System.out.println("Date of join: ");
        System.out.print(this.date_of_join);
        System.out.println("Phone num: ");
        System.out.print(this.scontact);
    }
   
}

class servicemen extends staff
{
    job jobb;
    void get_staff(){
       Scanner scn= new Scanner(System.in); 
       System.out.println("Enter the staff details:");
       System.out.println("Name : ");
       this.s_name=scn.next();
       System.out.println("Id:");
       this.s_id=scn.nextInt();
       System.out.println("Adhaar:");
       this.s_adhaar=scn.nextInt();
       System.out.println("Address : ");
       this.saddress=scn.next();
       System.out.println("Phone no : ");
       this.scontact=scn.next(); 
       System.out.println("Gender(1->Male 2->Female 3->Others)");
       int ch;
       ch=scn.nextInt();
       switch(ch)
        {
            case 1: gen=gen.Male;break;
            case 2 : gen=gen.Female; break;
            case 3 :gen=gen.Others; break;
        }
       System.out.println("Enter the job(1->Cleaning 2->Serving 3->Security 4->Customer care)");
       ch=scn.nextInt();
       switch(ch)
        {
            case 1: jobb=jobb.Cleaning;break;
            case 2 : jobb=jobb.Serving; break;
            case 3 :jobb=jobb.Security; break;
            case 4: jobb=jobb.Cust_care; break;
        }
       System.out.println("Date of Joining : ");
       this.date_of_join=scn.next(); 
       scn.close();
    }
    public void display_staff(){
        System.out.println("The staff details are");
        System.out.println("Staff id no: ");
        System.out.print(this.s_id);
        System.out.println("Name: ");
        System.out.print(this.s_name);
        System.out.println("Adhaar: ");
        System.out.print(this.s_adhaar);
        System.out.println("Gender: ");
        System.out.print(this.gen);
        System.out.println("Address: ");
        System.out.print(this.saddress);
        System.out.println("Department: ");
        System.out.print(this.jobb);
        System.out.println("Date of join: ");
        System.out.print(this.date_of_join);
        System.out.println("Phone num: ");
        System.out.print(this.scontact);
    }
   
}
