package Rooms.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "roomDetails")
public class RoomDetails {

    @Id
    Long id;
    Integer code;


    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";


    public RoomDetails() {

    }

    public RoomDetails(Long id, Integer code) {
        this.id = id;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "RoomDetails{" +
                "id=" + id +
                ", code=" + code +
                '}';
    }
}