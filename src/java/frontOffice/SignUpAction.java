/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontOffice;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import helper.UserHelper;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.Users;

/**
 *
 * @author Julien
 */
public class SignUpAction extends ActionSupport {

    private String lastName;
    private String firstName;
    private String email;
    private String password;
    private String confirmatedPassword;

    static Properties properties = new Properties();

    static {
        properties.put("mail.smtp.host", "cpanel6.pingfiles.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
    }

    @Override
    public String execute() throws Exception {
        if (lastName != null && password.equals(confirmatedPassword)) {
            Users user = new Users(lastName, firstName, false, false, email, false, password);
            UserHelper usersHelper = new UserHelper();
            usersHelper.addUsers(user);
            sendMail(email, firstName, password);
            return SUCCESS;
        }
        return INPUT;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmatedPassword(String confirmatedPassword) {
        this.confirmatedPassword = confirmatedPassword;
    }

    private void sendMail(String emailUser, String firstNameUser, String passwordUser) {

        String emailFrom = "admin@betfun.pingfiles.fr";
        String password = "betFun2016";
        String subject = "SignUp";
        String body = "Bonjour " + firstNameUser + ",\n"
                + "\n"
                + "Vous recevez ce message car vous venez de valider votre inscription ce jour sur BetFun. \n"
                + "\n"
                + "Vos identifiants de connexion au site sont les suivants: \n"
                + "\n"
                + "-login: " + emailUser + "\n"
                + "-mot de passe: " + passwordUser + "\n"
                + "\n"
                + "Si vous n'Ítes pas à l'origine de cette inscription, veuillez contacter immédiatement le support via le mail ci-dessous: \n"
                + "\n"
                + "- " + emailFrom + "\n"
                + "\n"
                + "Cordialement, \n"
                + "\n"
                + "L'Èquipe BetFun";

        try {
            Session session = Session.getInstance(properties,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication
                        getPasswordAuthentication() {
                            return new PasswordAuthentication(emailFrom, password);
                        }
                    });
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailFrom));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(emailUser));
            message.setSubject(subject);
            message.setText(body);
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
