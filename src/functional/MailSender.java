package functional;

import java.util.List;

public class MailSender {

    public void send(List<Person> persons) {
        for (Person person : persons) {
            sendMail(person.mailAddress);
        }
    }

    private void sendMail(String mailAddress) {
        // send mail
    }

}
