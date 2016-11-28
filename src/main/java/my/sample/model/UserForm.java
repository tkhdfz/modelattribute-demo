package my.sample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm implements Serializable {

    private static final long serialVersionUID = 6462183374089736727L;
    String name;
    String age;

}
