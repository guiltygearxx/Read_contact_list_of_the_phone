package androidapp.focus.hoangnam.application_read_contact_sentsms;

import java.util.List;

/**
 * Created by HoangNam on 12/24/2017.
 */

public class DetailsContact {

    String nameContact;
    String phoneContact;

    public DetailsContact(String nameContact, String phoneContact) {
        this.nameContact = nameContact;
        this.phoneContact = phoneContact;
    }

    public DetailsContact() {
    }



    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
    }
}
