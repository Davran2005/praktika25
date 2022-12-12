package service.imple;

import classes.Person;
import classes.Whatsap;

import java.util.ArrayList;
import java.util.List;

public class WhatsappImple implements WhatsappService {
    List<Whatsap>whatsap = new ArrayList<>();
    List<String>whatsappMassege = new ArrayList<>();

    public WhatsappImple() {

    }

    @Override
    public String greateWhatsappAccount(Whatsap whatsap, List<Person> people) {
        if (whatsap.getId()!=0){
            this.whatsap.add(whatsap);
            return "УСПЕШНО!!!";
        }else {
            return "АКАУНТ НЕ СОЗДАН!!!";
        }

    }

    @Override
    public List<Whatsap> getWhatsap() {

        return this.whatsap;
    }

    @Override
    public Whatsap getProfil(String pasword, List<Whatsap> whatsappUzers) {
        for (Whatsap whatsappUzer : whatsappUzers) {
            if(whatsappUzer.getPassword().equals(pasword)){
                return whatsappUzer;
            }
        }
        return null;
    }


    @Override
    public String getMassege(String password, String name, List<String> massege, List<Whatsap> uzers, List<Whatsap> uzers2) {
        for (Whatsap whatsap1: whatsap) {

            for (Whatsap whatsappUzer : whatsap) {
                if (whatsap1.getPassword().equals(password)) {
                    if (whatsappUzer.getUserName().equals(name)) {
                        whatsappMassege.add(whatsap1.getUserName()+" : "+massege);

                        whatsappUzer.setMassege((ArrayList<String>) this.whatsappMassege);
                        return "СОБШЕННИЕ ОТПРАВЛЕННО!!";

                    }

                }
            }
        }
        return null;
    }
    }

