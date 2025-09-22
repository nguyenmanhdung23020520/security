import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
    import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

    public class PasswordGenerator {
        public static void main(String[] args) {
            PasswordEncoder encoder = new BCryptPasswordEncoder();
            String rawPassword = "123456"; // your plain password
            String encodedPassword = encoder.encode(rawPassword);
            System.out.println(encodedPassword);
        }
    }

