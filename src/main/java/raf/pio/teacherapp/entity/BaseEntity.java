package raf.pio.teacherapp.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
abstract class BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Version
    private Integer version;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;
}
