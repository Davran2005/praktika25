package classes;

import enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Whatsap {

        private int id;
        private String phoneNumber;
        private String userName;
        private Status Status;
        private String password;
        private ArrayList<String> massege;

    public Whatsap(int id, String phoneNumber, String userName, enums.Status status, ArrayList<String> massage, int password) {
        this.id = this.id;
    }

    public Whatsap(int id, String phoneNumber, String uzerName, Status whatsappStatus, String password, List<Person> people) {
            for (Person person : people) {
                if (person.getId() == id) {
                    this.id = id;
                    this.phoneNumber = phoneNumber;
                    this.userName = uzerName;
                    this.Status = whatsappStatus;
                    this.password = password;
                } else {

                }
            }

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Status getStatus() {
            return Status;
        }

        public void setWhatsappStatus(Status whatsappStatus) {
            this.Status = whatsappStatus;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public ArrayList<String> getMassege() {
            return massege;
        }

        public void setMassege(ArrayList<String> massege) {
            this.massege = massege;
        }

        @Override
        public String toString() {
            return "\n<<<<<<< WHATSAPP ACCOUNT >>>>>>>>" +
                    "\nID : " + id +
                    "\nPHONE NUMBER : " + phoneNumber +
                    "\nUZER NAME : " + userName +
                    "\nWHATSAPP STATUS : " + Status +
                    "\nPASWORD : " + password +
                    "\nMASSEGE : " + massege +
                    "\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*";
        }
    }

