/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontOffice;

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
public class RecoverPwdAction extends ActionSupport {

    private Users user;
    private UserHelper helperUsers;
    private String emailTo;
    private String emailFrom = "admin@betfun.pingfiles.fr";
    private String password = "betFun2016";
    private String subject = "Recovery Password";
    private String body = "Bonjour, \n"
            + "\n"
            + "Le mot de passe de votre identifiant BetFun a été réinitialisé avec succés. \n"
            + "\n"
            + "Voici votre nouveau mot de passe: \"p@$$w0rD\" \n"
            + "\n"
            + "Si vous n'etes pas l'auteur de cette demande, vous pouvez contacter notre support admin@betfun.pingfiles.fr\n"
            + "\n"
            + "Cordialement, \n"
            + "\n"
            + "L'assistance BetFun";

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
        if (emailTo != null) {
            if (usersExist(emailTo)) {
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
                            InternetAddress.parse(emailTo));
                    message.setSubject(subject);
                    message.setText(body);
                    Transport.send(message);
                    resetPassword();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
                return SUCCESS;
            } else {
                System.out.println("User not exist");
            }
            return INPUT;
        }

    

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    private boolean usersExist(String email) {
        helperUsers = new UserHelper();
        user = helperUsers.getUser(email);
        return user != null;
    }

    private void resetPassword() {
        helperUsers = new UserHelper();
        user.setPassword("p@$$w0rD");
        helperUsers.updateUsers(user);
    }
}
