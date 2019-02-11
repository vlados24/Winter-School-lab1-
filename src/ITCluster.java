

public class ITCluster {

    private String city ;
    private String country ;
    private int number_of_participants ;
    private int number_of_speakers ;
    private String cluster_leader ;
    protected int performance_time_in_hours;
    protected String address_of_conducting ;
    static int ticket_price_in_dollars = 12;

    ITCluster() {

        this.city = "Lviv";
        this.country = "Ukraine" ;
        this.number_of_participants = 5000 ;
        this.number_of_speakers = 13 ;
        this.cluster_leader = "Anton Shikhmat" ;
        this.performance_time_in_hours = 3 ;
        this.address_of_conducting = "Sadovoa" ;
    }

    ITCluster(
            String city,
            String country,
            int number_of_participants,
            int number_of_speakers
    ) {
        this.city = city ;
        this.country = country ;
        this.number_of_participants = number_of_participants ;
        this.number_of_speakers = number_of_speakers ;
    }

    public ITCluster(String city,
                     String country,
                     int number_of_participants,
                     int number_of_speakers,
                     String cluster_leader,
                     int performance_time_in_hours,
                     String address_of_conducting) {
        this.city = city;
        this.country = country;
        this.number_of_participants = number_of_participants;
        this.number_of_speakers = number_of_speakers;
        this.cluster_leader = cluster_leader;
        this.performance_time_in_hours = performance_time_in_hours;
        this.address_of_conducting = address_of_conducting;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber_of_participants() {
        return number_of_participants;
    }

    public void setNumber_of_participants(int number_of_participants) {
        this.number_of_participants = number_of_participants;
    }

    public int getNumber_of_speakers() {
        return number_of_speakers;
    }

    public void setNumber_of_speakers(int number_of_speakers) {
        this.number_of_speakers = number_of_speakers;
    }

    public String getCluster_leader() {
        return cluster_leader;
    }

    public void setCluster_leader(String cluster_leader) {
        this.cluster_leader = cluster_leader;
    }

    public int getPerformance_time_in_hours() {
        return performance_time_in_hours;
    }

    public void setPerformance_time_in_hours(int performance_time_in_hours) {
        this.performance_time_in_hours = performance_time_in_hours;
    }

    public String getAddress_of_conducting() {
        return address_of_conducting;
    }

    public void setAddress_of_conducting(String address_of_conducting) {
        this.address_of_conducting = address_of_conducting;
    }

    public String toString() {
        return "ITCluster{" + '\n' +
                "city=" + city + '\n' +
                "country=" + country + '\n' +
                "number_of_participants=" + number_of_participants + '\n' +
                "number_of_speakers=" + number_of_speakers + '\n' +
                "cluster_leader=" + cluster_leader + '\n' +
                "performance_time_in_hours=" + performance_time_in_hours + '\n' +
                "address_of_conducting='" + address_of_conducting + '\n' +
                '}';
    }
    
    static void printStaticTicketPriceInDollars() {
		System.out.println("TickePriceInDollarst " + ticket_price_in_dollars);
	}

	public void printTicketPriceInDollars() {
		System.out.println("TickePriceInDollarst " + ticket_price_in_dollars);
	}

	public void resetValues(String city,
            String country,
            int number_of_participants,
            int number_of_speakers,
            String cluster_leader,
            int performance_time_in_hours,
            String address_of_conducting) 
	{
		this.city = city;
        this.country = country;
        this.number_of_participants = number_of_participants;
        this.number_of_speakers = number_of_speakers;
        this.cluster_leader = cluster_leader;
        this.performance_time_in_hours = performance_time_in_hours;
        this.address_of_conducting = address_of_conducting;
	}
} 