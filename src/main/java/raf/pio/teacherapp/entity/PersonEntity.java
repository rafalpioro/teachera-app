package raf.pio.teacherapp.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;
import raf.pio.teacherapp.enums.PersonKind;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Getter
@Setter
@Audited
@Entity
@Table(name = "person")
public class PersonEntity extends BaseEntity {

    private String firstName;
    private String lastName;
    private String city;
    private PersonKind kind;
    @ManyToOne
    private PersonEntity parent;
}
