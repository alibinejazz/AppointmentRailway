package appointment.peaceofmind.Model;

import java.sql.Date;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date created;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date updated;

    @Nonnull
    private Long availability_id;

    @Nonnull
    private Long patient_id;

    private boolean is_confirmed;
}