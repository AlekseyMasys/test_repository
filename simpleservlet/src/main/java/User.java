
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class User {
    @Setter
    @Getter
    private int id;

    @Setter
    @Getter
    private String fname;

    @Setter
    @Getter
    private String lname;

}
