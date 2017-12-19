package oop_lab4;
//สร้าง Methods สำหรับรับค่าข้อมูลนักศึกษาประกอบด้วย
//1.ชื่อ-สกุล
//2.ที่อยู่
//3.รหัสนักศึกษา
//4.สาขาและมหาวิทยาลัย
//5.EMail

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentData {
    public static BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
    public static String getName () throws IOException{
        System.out.print("Enter your name: ");
        return reader.readLine();
    }
    public static String getaddress() throws IOException{
        System.out.print("Enter your getaddress: ");
        return reader.readLine();
    }
    public static String getid () throws IOException{
        System.out.print("Enter your id: ");
        return reader.readLine();
    }
    public static String getfac () throws IOException{
        System.out.print("Enter your fac: ");
        return reader.readLine();
    }
    public static String getemail () throws IOException{
        System.out.print("Enter your email: ");
        return reader.readLine();
    }

    public static void main (String [] args)throws IOException{
        String name = getName();
        String address = getaddress();
        String id = getid();
        String fac = getfac();
        String email = getemail();
        System.out.println(name+"\n"+address+"\n"+id+"\n"+fac+"\n"+email);
    }//main





}//class
