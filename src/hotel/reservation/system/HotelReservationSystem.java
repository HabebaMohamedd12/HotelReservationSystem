/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.reservation.system;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.NullPointerException;
import java.util.HashMap;
import java.util.HashSet;

public class HotelReservationSystem {

    public static void main(String[] args) {
        LoginScreen app = new LoginScreen("Hotel Reservation System");
        //Define our data manager to access data file and read data if exists
//        DataFileManager fileManager = new DataFileManager();
//        // Read data from data.bin if any exists, or else initialize an empty HashMap
//        HashMap<Integer, Client> clients = fileManager.Read();
//        Scanner s = new Scanner(System.in);
//        //Check if the user is an admin
//        Receptionist r = new Receptionist();
//        System.out.println("Enter your username:");
//        r.setUserName(s.next());
//        System.out.println("Enter your password:");
//        r.setPassword(s.next());
//        r.CheckIfAdmin();
//        //SEARCH FOR CLIENT FIRST
//        System.out.println("Enter the clients's ID number: ");
//        int idNum = s.nextInt();
//        Client getClient = clients.getOrDefault(idNum, null);
//        //If found then read his details, if not then write and save his details
//        if (getClient != null) {
//            System.out.println("ID: " + getClient.getIDnumber());
//            System.out.println("Name: " + getClient.getFirstname());
//            System.out.println("Age: " + getClient.getAge());
//            System.out.println("Area: " + getClient.getarea());
//            System.out.println("phone number: " + getClient.getPhoneNumber());
//
//        } else {
//            getClient = new Client();
//            getClient.setIDnumber(idNum);
//            System.out.println("Enter the clients's first name:");
//            getClient.setFirstname(s.next());
//            System.out.println("Enter the clients's last name:");
//            getClient.setLastname(s.next());
//            System.out.println("Enter the clients's age:");
//            getClient.setAge(s.nextInt());
//            System.out.println("Enter the clients's area:");
//            getClient.setarea(s.next());
//            System.out.println("Enter the clients's gender :");
//            getClient.setGender(s.next());
//            System.out.println("Enter the clients's phone number:");
//            getClient.setPhoneNumber(s.next());
//            //Add to the clients
//            clients.put(idNum, getClient);
//            boolean dataSaved = fileManager.Save(clients);
//            if (dataSaved) {
//                System.out.println("Data saved successfully !");
//            } else {
//                System.out.println("Failed to save data !");
//            }
//        }
//        //reservation details in file
//        //Reservation reservation = new Reservation();
//        System.out.println("Does the clients have reservation number?");
//        String answer = s.next();
//        if (answer.equals("yes")) {
//            System.out.println("Enter the clients's reservation number");
//            int resNum = s.nextInt();
//            //Try to find the reservation on the clients reservations
//            Reservation getReservation = getClient.FindReservation(resNum);
//            if (getReservation != null) {
//                System.out.println("Reservation number: " + getReservation.getReservationNumber());
//                System.out.println("checkin date: " + getReservation.getCheckinDate());
//                System.out.println("checkout date:" + getReservation.getCheckoutDate());
//                System.out.println("Roomtype: " + getReservation.getRoomtype());
//                System.out.println("Room number: " + getReservation.roomNumber);
//                System.out.println("Price: " + getReservation.getPaymentAmount());
//                System.out.println("Number of beds: " + getReservation.getNumberOfBeds());
//                System.out.println("Payment Type:" + getReservation.getPaymentType());
//                System.out.println("PaymentID:" + getReservation.getPaymentId());
//                System.out.println("Payment amount:" + getReservation.getPaymentAmount());
//                System.out.println("Additional services:" + getReservation.getAdditionalServices());
//                System.out.println("Your final payment is:" + getReservation.getTotalAmount());
//            } else {
//                getReservation = new Reservation();
//                System.out.println("Enter the clients's IDnumber");
//                getReservation.setReservationNumber(s.nextInt());
//                System.out.println("Enter the clients's checkin date dd/mm/yyyy:");
//                getReservation.setCheckinDate(s.next());
//                System.out.println("Enter the clients's checkout date dd/mm/yyyy:");
//                getReservation.setCheckoutDate(s.next());
//                System.out.println("Enter the clients's choice of roomtype(single,double,suite)");
//                String an = s.next();
//                getReservation.setRoomtype(an);
//                int randroom = (int) (100 + (Math.random() * 1000));
//                int randompayment = (int) (1000000 + (Math.random() * 3000000));
//                if (an.equals("single")) {
//
//                    getReservation.roomNumber = randroom;
//                    getReservation.setPaymentAmount(1000);
//                    getReservation.setNumberOfBeds(1);
//                    getReservation.setPaymentId(randompayment);
//
//                } else if (an.equals("double")) {
//                    getReservation.roomNumber = randroom;
//                    getReservation.setPaymentAmount(2000);
//                    getReservation.setNumberOfBeds(2);
//                    getReservation.setPaymentId(randompayment);
//
//                } else {
//                    getReservation.roomNumber = randroom;
//                    getReservation.setPaymentAmount(4000);
//                    getReservation.setNumberOfBeds(4);
//                    getReservation.setPaymentId(randompayment);
//
//                }
//
//                System.out.println("Does the clients want to pay visa or cash?");
//                getReservation.setPaymentType(s.next());
//                System.out.println("Does the clients want additional services?");
//                String service = s.next();
//
//                if (service.equals("yes")) {
//                    System.out.println("which service did the client choose (gym= $100,wifi= $30,safari= $600) ?");
//                    String a = s.next();
//                    getReservation.addAdditionalservice(a);
//                    System.out.println("The clients's new payment amount is:" + getReservation.getTotalAmount());
//
//                }
//                getClient.AddReservation(getReservation);
//                clients.put(idNum, getClient);
//                boolean dataSaved = fileManager.Save(clients);
//                if (dataSaved) {
//                    System.out.println("Data saved successfully !");
//                } else {
//                    System.out.println("Failed to save data !");
//                }
//            }
//        }
    }
}
