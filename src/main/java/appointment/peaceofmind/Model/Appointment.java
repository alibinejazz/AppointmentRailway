package appointment.peaceofmind.Model;

import java.sql.Date;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd - HH:mm:ss")
    private ZonedDateTime created;
    
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd - HH:mm:ss")
    private ZonedDateTime updated;

    // @Nonnull
    private Long availabilityId;

    @Nonnull
    private Long patientid;

    private boolean confirmed;

    private Integer deleted;

   

   
}
