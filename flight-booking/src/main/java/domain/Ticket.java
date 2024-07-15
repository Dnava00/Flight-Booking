package domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "Ticket")
@Entity
public class Ticket {
   
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private UUID id;

    @Column(name = "TimeDeparture")
    private LocalDateTime timeDeparture;

    @Column(name = "TimeLanding")
    private LocalDateTime timeLanding;

    @Column(name = "Event_timestamp")
    private LocalDateTime eventTime; 

    @ManyToOne
    @JoinColumn(name = "User_ticker")
    private User user;
}
