package models;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

@Entity
@Table(name = "user")
public class User extends ModelBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String firstName;

    @Column
    public String lastName;
    
    @Column
    public String middleName;
    
    



    public static User create(String firstName, String lastName,String middleName) {
        User user = new User();
        user.firstName = firstName;
        user.lastName = lastName;
        user.middleName= middleName;
        user.register();
        return user;
    }
    public User update(String firstName, String lastName,String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName= middleName;
        this.updater();
        return this;
    }

    public static List<User> search(Long id, String firstName, String lastName,String middleName) {
        StringJoiner joiner = new StringJoiner(" AND ");
        if (Objects.nonNull(id)) {
            joiner.add(" id = " + id + " ");
        }
        if (StringUtils.isNotBlank(firstName)) {
            joiner.add(" firstName like '%" + firstName + "%' ");
        }
        if (StringUtils.isNotBlank(lastName)) {
            joiner.add(" lastName like '%" + lastName + "%' ");
        }
        if (StringUtils.isNotBlank(middleName)) {
            joiner.add(" lastName like '%" + middleName + "%' ");
        }

        System.out.println(joiner.toString());
        return findWhere(User.class, joiner.toString());

    }
}
