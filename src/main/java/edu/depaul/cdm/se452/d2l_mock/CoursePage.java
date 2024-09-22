public class CoursePage {
    private AnnouncementComponent announcementComponent;
    private CalendarWidget calendarWidget;
    private UpcomingEventsWidget upcomingEventsWidget;

    // Constructor
    public CoursePage() {
        this.announcementComponent = new AnnouncementComponent();
        this.calendarWidget = new CalendarWidget();
        this.upcomingEventsWidget = new UpcomingEventsWidget();
    }

    // Methods to display components
    public void displayAnnouncements() {
        announcementComponent.display();
    }

    public void displayCalendar() {
        calendarWidget.display();
    }

    public void displayUpcomingEvents() {
        upcomingEventsWidget.display();
    }
}

class AnnouncementComponent {
    // Dummy announcement data for now
    private String[] announcements = {"Welcome to the course!", "HW 1 due next week!"};

    public void display() {
        for (String announcement : announcements) {
            System.out.println(announcement);
        }
    }
}

class CalendarWidget {
    // Dummy calendar data for now
    public void display() {
        System.out.println("Displaying Calendar for September...");
    }
}

class UpcomingEventsWidget {
    // Dummy upcoming events for now
    public void display() {
        System.out.println("Upcoming events: Class lecture on Jan 12, Midterm on Feb 2.");
    }
}
