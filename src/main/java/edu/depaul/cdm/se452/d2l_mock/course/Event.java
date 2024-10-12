package edu.depaul.cdm.se452.d2l_mock.course;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "events")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String date;
    private String time;
    private String description;

    // Update event details.
    public void updateEventDetails(String name, String date, String time, String description) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.description = description;
    }

    // Show event information
    public String displayEventInfo() {
        return String.format("Event: %s\nDate: %s\nTime: %s\nDescription: %s", name, date, time, description);
    }
}