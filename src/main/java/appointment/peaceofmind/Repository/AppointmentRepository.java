package appointment.peaceofmind.Repository;

import java.util.List;

// import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import appointment.peaceofmind.Model.Appointment;

@EnableJpaRepositories
public interface AppointmentRepository extends JpaRepository<Appointment,Long>{

    

    List<Appointment> findByAvailabilityId(Long availability_id);
        List<Appointment> findBypatientid(Long patientid);
 }
