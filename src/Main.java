import classes.Person;
import classes.Whatsap;
import enums.Gender;
import enums.Status;
import service.imple.PersonIple;
import service.imple.WhatsappImple;

import java.util.*;

import static enums.Country.*;
import static enums.Gender.FAMALE;
import static enums.Gender.MALE;


public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Person> peoples = new ArrayList<>();
            List<Gender> genders = new ArrayList<>(List.of(MALE, FAMALE));
            PersonIple personuimple = new PersonIple();
            personuimple.grateGender(genders);
             WhatsappImple whatsappImple=new WhatsappImple();
             Person person=new Person();
            while (true) {
                System.out.println("PRESS 1 CREATE PASSPORT!");
                System.out.println("PRESS 2 GET ALL PASPORT!");
                System.out.println("PRESS 3 CREATE WHATSAPP ACCOUNT!");
                System.out.println("PRESS 4 GET ALL WHATSAPP ACCOUNT!");
                System.out.println("PRESS 5 GET WHATSAPP PROFIL!");
                System.out.println("PRESS 6 GET PERSON FIRST NAME!");
                System.out.println("PRESS 7 GET MASSEGE!");
                System.out.println("PRESS 8 GET ALL GENDER!");
                System.out.print("Pult : ");
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("<<<< CREATE PASSPORT >>>>");
                        System.out.print("ID : ");
                        int id = scanner.nextInt();
                        String n1 = scanner.nextLine();
                        System.out.print("FIRST NAME : ");
                        String firstName = scanner.nextLine();
                        System.out.print("LAST NAME : ");
                        String lastName = scanner.nextLine();
                        System.out.print("GENDER : ");
                        String gender = scanner.nextLine();
                        System.out.print("COUNTRI : ");
                        String countri = scanner.nextLine();
                        System.out.print("DATE OF BIRTH-(XXXX-XX-XX) : ");
                        String dateOfBirt = scanner.nextLine();

                        System.out.println(personuimple.create(new Person(id, firstName, lastName, dateOfBirt, valueOf(countri.toUpperCase()), Gender.valueOf(gender.toUpperCase()))));
                        break;
                    case 2:
                        System.out.println(personuimple.getPerson());
                        break;
                    case 3:
                        System.out.println("<<<< GREATE WHATSAPP ACCOUNT >>>>");
                        System.out.print("ID : ");
                        int id2 = scanner.nextInt();
                        String n11 = scanner.nextLine();
                        System.out.print("UZER NAME : ");
                        String whatsappName = scanner.nextLine();
                        System.out.print("PHONE NUMBER :1 ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("PASWORD : ");
                        String password = scanner.nextLine();
                        System.out.println(whatsappImple.greateWhatsappAccount(new Whatsap(id2,
                                phoneNumber, whatsappName, Status.Я_ИСПОЛЬЗУЮ_WHATSAPP, password, personuimple.getPerson()), peoples));
                        break;
                    case 4:
                        System.out.println("<<<< GET ALL WHATSAPP ACCOUNT >>>>");
                        System.out.println(whatsappImple.getWhatsap());
                        break;
                    case 5:
                        System.out.println("<< LOG IN TO WHATSAPP ACCOUNT >>");
                        String nnn = scanner.nextLine();
                        System.out.print("PASSWORD : ");
                        String password2 = scanner.nextLine();
                        System.out.println(whatsappImple.getProfil(password2, whatsappImple.getWhatsap()));
                        break;
                    case 6:
                        String nm = scanner.nextLine();
                        System.out.print("FIRST NAME : ");
                        String firstName2 = scanner.nextLine();
                        System.out.println(personuimple.getPersonFirsName(firstName2, personuimple.getPerson()));
                        break;
                    case 7:
                        System.out.println("<<< SEND A MESSAGE >>>");
                        String nn5 = scanner.nextLine();
                        System.out.print("PASSWORD : ");
                        String password4 = scanner.nextLine();
                        System.out.print("UZER NAME : ");
                        String uz = scanner.nextLine();

                        while (true) {
                            System.out.print("MASSEGE : ");
                            List<String> masege = new ArrayList<>(List.of(scanner.nextLine()));
                            System.out.println(whatsappImple.getMassege(password4, uz, masege, whatsappImple.getWhatsap(), whatsappImple.getWhatsap()));
                            System.out.println("PREES 1 CONTINEN ");
                            System.out.println("PREES 2 BREAK ");
                            System.out.print("Pult : ");
                            String srt = scanner.nextLine();
                            if (srt.equals("2")) {
                                break;
                            } else {
                                continue;
                            }

                        }
                    case 8:
                        System.out.println(personuimple.getGender());
                        break;
                    case 9:

                        break;
                    case 10:

                        break;
                    case 11:

                        break;
                    case 12:

                        break;
                    case 13:

                        break;
                    default:
                        System.err.println("ERROR");
                        break;

                }


            }
        }
    }
