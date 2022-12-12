package service.imple;

import classes.Person;
import classes.Whatsap;

import java.util.List;

public interface WhatsappService {
    String greateWhatsappAccount(Whatsap whatsap, List<Person>people);
    List<Whatsap>getWhatsap();
    Whatsap getProfil(String pasword, List<Whatsap>whatsappUzers);
    String getMassege(String password, String name, List<String> massege, List<Whatsap>uzers, List<Whatsap>uzers2);

}


