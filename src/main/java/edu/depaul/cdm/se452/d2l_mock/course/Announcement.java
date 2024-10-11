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
@Table(name = "announcements")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String content;
    private String datePosted;

    // Update announcement content
    public void updateContent(String content) {
        this.content = content;
    }

    // Show announcement
    public String displayAnnouncement() {
        return String.format("Title: %s\nDate: %s\nContent: %s", title, datePosted, content);
    }
}